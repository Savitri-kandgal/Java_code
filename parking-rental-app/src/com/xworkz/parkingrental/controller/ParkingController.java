package com.xworkz.parkingrental.controller;

import java.time.LocalTime;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.xworkz.parkingrental.dto.ParkingDTO;
import com.xworkz.parkingrental.dto.ParkingInfoDTO;
import com.xworkz.parkingrental.dto.UserDTO;
import com.xworkz.parkingrental.dto.UserParkingDTO;
import com.xworkz.parkingrental.service.ParkingService;
import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping("/")
@Slf4j
public class ParkingController {

	@Autowired
	private ParkingService service;

	public ParkingController() {
		log.info("Created: " + getClass().getSimpleName());
	}

	@PostMapping("adminLogin")
	public String validate(ParkingDTO dto, Model model, HttpServletRequest req) {
		// if(dto!=null)
		if (!dto.getEmail().isEmpty() && !dto.getPassword().isEmpty()) {
			log.info("running parking()");
			ParkingDTO dto2 = service.validateCredential(dto.getEmail(), dto.getPassword());
			if (dto2 != null) {
				// session scope
				HttpSession session = req.getSession();
				session.setAttribute("sessionDTO", dto2);

				// request scope
				// model.addAttribute("time", dto2.getLoginTime());
				// model.addAttribute("name", dto2.getName());
				return "AdminLoginSuccess";
			} else {
				model.addAttribute("error", "*Invalid credential");
			}
		} else {
			model.addAttribute("error2", "Please enter credential");
		}
		return "AdminLogin";
	}

	@RequestMapping(value = "updateParkingInfo", method = RequestMethod.POST)
//	@PostMapping("updateParkingInfo")
	public String updateParkingInfo(ParkingInfoDTO dto, Model model) {
		log.info("running updateParkingInfo()");
		boolean saved = service.saveParkingInfo(dto);
		if (saved) {
			model.addAttribute("success", "Data saved successfully");
		} else {
			log.info("Data already exist");
			model.addAttribute("error", "Data already exist");
			model.addAttribute("dto2", dto);
		}
		return "UpdateParkingInfo";
	}

	@RequestMapping("viewData")
	public String viewData(String location, Model model) {
		log.info("running viewData()");
		List<ParkingInfoDTO> dtoList = service.findByLocation(location);
		if (!dtoList.isEmpty()) {
			log.info("dto list: " + dtoList);
			model.addAttribute("list", dtoList);
			model.addAttribute("size", "No. of records: " + dtoList.size());
			return "AdminViewData";
		} else {
			model.addAttribute("error", "No record found");
			return "AdminViewData";
		}
	}

	@PostMapping("userRegistration")
	public String userRegistration(UserDTO userDto, UserParkingDTO upDto, Model model) {
		log.info("running userRegistration");
		boolean status = service.validateAndRegister(userDto, upDto);
		if (status) {
			model.addAttribute("success", "Registration done Successfully");
		} else {
			model.addAttribute("error", "Email is already registered, please login");
		}
		return "UserRegistration";
	}

	private String emailId = null;

	@RequestMapping("generateOTPAndLogin")
	public String onGenerateOTPAndLogin(String generateOtp, String login, String email, Integer otp, Model model,
			HttpServletRequest req) {
		log.info("running onGenerateOTPAndLogin()");
		log.info("Controller: generateOtp: " + generateOtp);
		log.info("controller: login from UI: " + login);
		log.info("controller: email from UI: " + email);
		log.info("controller: otp from UI: " + otp);

		if (generateOtp != null && "Generate OTP".equals(generateOtp)) {
			UserDTO dto = service.findByUserEmail(email);
			if (dto != null) {
				emailId = email;
				boolean otpStatus = service.generateOtp(email);
				if (otpStatus) {
					model.addAttribute("generateOtpSuccess",
							"OTP sent to registered mail-id, will be expired after 2 mins");
				} else {
					model.addAttribute("generateOtpError", "Re-generate the OTP");
				}
			} else {
				model.addAttribute("emailError", "*Not a registered mail-id");
			}
		} else if (login != null && "Login".equals(login)) {
			log.info("validating otp...");
			log.info("controller: onGenerateOTP(): emailId: " + emailId);
			UserDTO dto = service.findByUserEmail(emailId);
			boolean otpNotExpired = dto.getOtpExpiryTime().isAfter(LocalTime.now());
			log.info("otp Not Expired: " + otpNotExpired);
			if (otpNotExpired) {
				log.info("OTP not expired");
				boolean isOtpValid = service.validateOTP(emailId, otp);
				if (isOtpValid) {
					HttpSession session = req.getSession();
					session.setAttribute("userDto", dto);
					return "UserLoginSuccess";
				} else {
					if (dto.getOtpCount() < 3) {
						model.addAttribute("otpError", "*Invalid OTP");
					} else {
						model.addAttribute("acctLocked", "*Your account is blocked");
					}
				}
			} 
			log.info("OTP expired");
			model.addAttribute("otpExpired", "*OTP expired, please generate the new OTP");
		}
		return "UserLogin";
	}

	// add user parking info
	@RequestMapping("addUserParkingInfo")
	public String onAddUserParkingInfo(UserParkingDTO upDto, Model model) {
		log.info("controller: running onAddUserParkingInfo()");
		UserParkingDTO dto = service.findByVehicleNo(upDto.getVehicleNo());
		if (dto == null) {
			log.info("controller: onAddUserParkingInfo(): new vehicle");
			service.addUserParkingInfo(upDto, emailId);
			model.addAttribute("success", "Parking slot booked!");
			return "UserParkingInfo";
		}
		log.info("controller: onAddUserParkingInfo(): This vehicle is already parked");
		model.addAttribute("error", "*This vehicle is already parked");
		return "UserParkingInfo";
	}

	// view user data
	@GetMapping("userViewData")
	public String onUserViewData(Model model) {
		log.info("onUserViewData()");
		UserDTO userDto = service.findByUserEmail(emailId);
		List<UserParkingDTO> upDtos = service.findUserParkingDtoById(emailId);
		log.info("controller: onUserViewData: userDto: " + userDto);
		log.info("controller: onUserViewData: upDtos: " + upDtos);
		if (userDto != null && !upDtos.isEmpty()) {
			model.addAttribute("personalData", userDto);
			model.addAttribute("parkingData", upDtos);
			return "UserViewData";
		}
		model.addAttribute("error", "error in data reading");
		return "UserViewData";
	}
}
