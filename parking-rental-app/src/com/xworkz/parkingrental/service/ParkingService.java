package com.xworkz.parkingrental.service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.xworkz.parkingrental.dto.ParkingDTO;
import com.xworkz.parkingrental.dto.ParkingInfoDTO;
import com.xworkz.parkingrental.dto.UserDTO;
import com.xworkz.parkingrental.dto.UserParkingDTO;
import com.xworkz.parkingrental.entity.UserEntity;

public interface ParkingService {

	default ParkingDTO validateCredential(String email, String password) {
		return null;
	}

	default ParkingDTO findById(int id) {
		return null;
	}

	default boolean saveParkingInfo(ParkingInfoDTO dto) {
		return false;
	}

	default ParkingInfoDTO isExist(String location, String vehicleType, String engineType, String classification, String term) {
		return null;
	}

	default List<ParkingInfoDTO> findByLocation(String location){
		return Collections.emptyList();
	}
	
	//user
	default boolean validateAndRegister(UserDTO userDto, UserParkingDTO uParkingDto) {
		return false;
	}
	
	default boolean isUserExist(String email) {
		return false;
	}
	
	default boolean generateOtp(String email) {
		return false;
	}
	
	default boolean validateOTP(String email, Integer otp) {
		return false;
	}
	
	default String validateAccountStatus(int otpCount) {
		return null;
	}
	default UserDTO findByUserEmail(String email) {
		return null;
	}
	
	default List<UserParkingDTO> findUserParkingDtoById(String email){
		return Collections.emptyList();
	}
	
	default UserParkingDTO findByVehicleNo(String vehicleNo) {
		return null;
	}
	
	default boolean addUserParkingInfo(UserParkingDTO uParkingDto, String email) {
		return false;
	}
}
