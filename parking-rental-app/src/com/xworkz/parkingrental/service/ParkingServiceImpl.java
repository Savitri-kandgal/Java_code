package com.xworkz.parkingrental.service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.jws.soap.SOAPBinding.Use;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.xworkz.parkingrental.dto.ParkingDTO;
import com.xworkz.parkingrental.dto.ParkingInfoDTO;
import com.xworkz.parkingrental.dto.UserDTO;
import com.xworkz.parkingrental.dto.UserParkingDTO;
import com.xworkz.parkingrental.entity.ParkingEntity;
import com.xworkz.parkingrental.entity.ParkingInfoEntity;
import com.xworkz.parkingrental.entity.UserEntity;
import com.xworkz.parkingrental.entity.UserParkingEntity;
import com.xworkz.parkingrental.repository.ParkingRepo;
import com.xworkz.parkingrental.util.GenerateOTP;
import com.xworkz.parkingrental.util.ParkingEmail;
import com.xworkz.parkingrental.util.UserOTPMail;
import com.xworkz.parkingrental.util.UserParkingEmail;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ParkingServiceImpl implements ParkingService {

	@Autowired
	private ParkingRepo repo;
	@Autowired
	private ParkingEmail parkingEmail;
	@Autowired
	private UserParkingEmail userParkingEmail;
	@Autowired
	private UserOTPMail userOTPMail;

	public ParkingServiceImpl() {
		log.info("Created: " + getClass().getSimpleName());
	}

	public ParkingDTO validateCredential(String email, String password) {
		log.info("running validateCredential()");
		if (email != null && password != null) {
			log.info("dto is not null");
			ParkingEntity entity = repo.findByEmail(email);
			if (entity != null) {
				if (entity.getAdminEmail().equals(email) && entity.getPassword().equals(password)) {

					// sending email
					parkingEmail.sendMail(entity.getAdminEmail(), entity.getName());

					// setting current time
					SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy hh:mm aa");
					String formattedDate = dateFormat.format(new Date()).toString();

					// updating time in db
					entity.setLoginTime(formattedDate);
					boolean timeUpdated = repo.updateLoginTime(entity);

					// getting entity with login-time
					ParkingEntity entity2 = repo.findByEmail(email);

					// coping entity to dto
					ParkingDTO dto2 = new ParkingDTO();
					BeanUtils.copyProperties(entity2, dto2);
					return dto2;
				} else {
					log.info("Service: invalid credential");
				}
			} else {
				log.info("Service: No matching record found by email");
			}
		} else {
			log.info("Service: email & password are null");
		}
		return null;
	}

	public ParkingInfoDTO isExist(String location, String vehicleType, String engineType, String classification,
			String term) {
		log.info("running isExist()");
		ParkingInfoEntity record = repo.findByLocationAndVehicleTypeAndEngineTypeAndClsAndTerm(location, vehicleType,
				engineType, classification, term);
		if (record != null) {
			log.info("data is already exist");
			ParkingInfoDTO dto = new ParkingInfoDTO();
			BeanUtils.copyProperties(record, dto);
			return dto;
		}
		return null;
	}

	public boolean saveParkingInfo(ParkingInfoDTO dto) {
		log.info("running isExist()");
		ParkingInfoEntity record = repo.findByLocationAndVehicleTypeAndEngineTypeAndClsAndTerm(dto.getLocation(),
				dto.getVehicleType(), dto.getEngineType(), dto.getClassification(), dto.getTerm());
		if (record != null) {
			log.info("data is already exist");
			return false;
		} else {
			log.info("data does not exist in db, saving new record");
			ParkingInfoEntity entity = new ParkingInfoEntity();
			BeanUtils.copyProperties(dto, entity);
			boolean saved = repo.saveParkingInfo(entity);
			if (saved) {
				log.info("Service: data saved");
				return true;
			}
			log.info("Service: data not saved");
			return false;
		}
	}

	public List<ParkingInfoDTO> findByLocation(String location) {
		log.info("service: running findByLocation()");
		List<ParkingInfoEntity> entityList = repo.findByLocation(location);
		if (!entityList.isEmpty()) {
			List<ParkingInfoDTO> dtoList = entityList.stream().map(entity -> {
				ParkingInfoDTO dto = new ParkingInfoDTO();
				BeanUtils.copyProperties(entity, dto);
				return dto;
			}).collect(Collectors.toList());
			return dtoList;
		}
		return Collections.emptyList();
	}

	// for user
	public boolean isUserExist(String email) {
		log.info("running isUserEmailExist()");
		UserEntity entity = repo.findByUserEmail(email);
		log.info("service: isUserExist: " + entity);
		if (entity != null) {
			return true;
		}
		return false;
	}

	public boolean validateAndRegister(UserDTO userDto, UserParkingDTO upDto) {
		log.info("running validateAndRegister()");

		UserEntity record = repo.findByUserEmail(userDto.getEmail());
		if (record == null) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm aa");
			String formattedDate = dateFormat.format(new Date());

			userDto.setCreatedBy(userDto.getName());
			userDto.setCreatedDate(formattedDate);
			userDto.setUpdatedBy(userDto.getName());
			userDto.setUpdatedDate(formattedDate);
			userDto.setOtp(0);
			userDto.setOtpCount(0);
			userDto.setAcctStatus("Active");
			
			log.info("validateAndRegister: userDto: " + userDto);
			UserEntity userEntity = new UserEntity();
			BeanUtils.copyProperties(userDto, userEntity);
			boolean saved = repo.saveUserData(userEntity);

			UserParkingEntity upEntity = new UserParkingEntity();
			UserEntity userByEmail = repo.findByUserEmail(userDto.getEmail());
			upDto.setUserId(userByEmail.getId());
			BeanUtils.copyProperties(upDto, upEntity);
			repo.saveUserParkingInfo(upEntity);
			userParkingEmail.sendMail(userDto.getEmail(), userDto.getName(), upDto);
			return true;
		}
		return false;
	}

	/*
	 * public boolean generateOtp(String email) { log.info("running generateOtp()");
	 * UserEntity entity = repo.findByUserEmail(email); if(entity!=null) { int otp =
	 * GenerateOTP.generateOtp(); // generated otp
	 * 
	 * SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm aa");
	 * String formattedDate = dateFormat.format(new Date());
	 * log.info("service: generateOtp: formattedDate: "+formattedDate);
	 * 
	 * entity.setOtp(otp); entity.setUpdatedDate(formattedDate);
	 * 
	 * if (repo.saveOtp(entity) && userOTPMail.sendMail(email, entity.getName(),
	 * otp)) // to save otp & send email {
	 * log.info("otp generated & sent to registered email"); return true; }
	 * log.info("otp not generated & sent to registered email"); return false; }
	 * log.info("service: generateOtp(): entity is not found by email"); return
	 * false; }
	 */

	public boolean generateOtp(String email) 
	{
		log.info("running generateOtp()");
		int otp = GenerateOTP.generateOtp(); // generated otp
		log.info("service: generateOtp: otp: " + otp);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy hh:mm aa");
		String formattedDate = dateFormat.format(new Date());
		log.info("service: generateOtp: formattedDate: " + formattedDate);
		
		
		UserEntity entity = repo.findByUserEmail(email);
		entity.setUpdatedDate(formattedDate);
		entity.setOtp(otp);
		entity.setOtpCount(0);
		entity.setAcctStatus("Active");
		entity.setOtpExpiryTime(LocalTime.now().plusSeconds(60));

		if (repo.updateUserEntity(entity) && userOTPMail.sendMail(email, entity.getName(), otp))																							// send email
		{
			log.info("otp generated & sent to registered email");
			return true;
		} else {
			log.info("otp not generated & sent to registered email");
			return false;
		}
	}

	//private int otpCount=0; 
	public boolean validateOTP(String email, Integer otp) {
		log.info("running validateOTP()");
		UserEntity entity = repo.findByUserEmail(email);
		int otpCount = entity.getOtpCount();
		if (entity.getAcctStatus().equals("Active")) {
			if (entity.getOtp().equals(otp)) {
				log.info("valid otp");
				return true;
			} else {
				log.info("service: validateOTP(): otpCount: " + otpCount);
				otpCount++;
				if (otpCount < 3) {
					entity.setOtpCount(otpCount);
					repo.updateUserEntity(entity);
					log.info("invalid otp");
					return false;
				} else {
					entity.setOtpCount(otpCount);
					entity.setAcctStatus("Blocked");
					repo.updateUserEntity(entity);
					log.info("Acccount is blocked");
					return false;
				}
			}
		}
		log.info("Acccount is blocked");
		return false;
	}

	public UserDTO findByUserEmail(String email) {
		log.info("running findByUserEmail()");
		UserEntity entity = repo.findByUserEmail(email);
		if (entity != null) {
			UserDTO dto = new UserDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return null;
	}	

	public List<UserParkingDTO> findUserParkingDtoById(String email) {				
		log.info("running findUserParkingDtoById()");
		UserEntity userEntity = repo.findByUserEmail(email);
		List<UserParkingEntity> upEntities = repo.findParkingEntitiesByUserId(userEntity.getId());
		log.info("service: findUserParkingDtoById: upList: " + upEntities);
		if (!upEntities.isEmpty()) {
			List<UserParkingDTO> upDtos = upEntities.stream().map(entity -> {
				UserParkingDTO upDto = new UserParkingDTO();
				BeanUtils.copyProperties(entity, upDto);
				return upDto;
			}).collect(Collectors.toList());
			return upDtos;
		}
		return Collections.emptyList();
	}
	
	public UserParkingDTO findByVehicleNo(String vehicleNo) {
		log.info("running findByVehicleNo()");
		UserParkingEntity entity = repo.findByVehicleNo(vehicleNo);
		if (entity != null) {
			UserParkingDTO dto = new UserParkingDTO();
			BeanUtils.copyProperties(entity, dto);
			return dto;
		}
		return null;
	}

	public boolean addUserParkingInfo(UserParkingDTO uParkingDto, String email) {
		log.info("running addUserParkingInfo()");
		UserEntity entityByEmail = repo.findByUserEmail(email);
		if (entityByEmail != null) {
			log.info("entityByEmail is not null");
			uParkingDto.setUserId(entityByEmail.getId());
			UserParkingEntity upEntity = new UserParkingEntity();
			BeanUtils.copyProperties(uParkingDto, upEntity);
			repo.saveUserParkingInfo(upEntity);
			userParkingEmail.sendMail(email, entityByEmail.getName(), uParkingDto);
			return true;
		}
		log.info("entityByEmail is not null");
		return false;
	}
}
