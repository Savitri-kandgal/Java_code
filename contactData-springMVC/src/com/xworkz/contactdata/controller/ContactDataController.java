package com.xworkz.contactdata.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.print.attribute.standard.Media;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.xworkz.contactdata.constant.ContactDataConstant;
import com.xworkz.contactdata.dto.ContactDataDTO;
import com.xworkz.contactdata.email.ContactDataEmail;
import com.xworkz.contactdata.entity.ContactDataEntity;
import com.xworkz.contactdata.service.ContactDataService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Component
@RequestMapping("/")
@EnableWebMvc
@Slf4j
public class ContactDataController {

	@Autowired
	private ContactDataService service;
	@Autowired
	private ContactDataEmail email;

	public ContactDataController() {
		System.out.println("Created: " + this.getClass().getSimpleName());
	}

	@PostMapping("register")
	public String onSubmit(@Valid ContactDataDTO dto, BindingResult br, Model model, MultipartFile file)
			throws IOException {
		System.out.println("running onSubmit()");
		System.out.println("DTO: " + dto);

		if (br.hasErrors()) {
			log.info("data is invalid");
			model.addAttribute("error", "data is invalid");
			model.addAttribute("errors", br.getFieldErrors());
			br.getFieldErrors().forEach(e -> log.info(e.getField() + " " + e.getDefaultMessage()));
		} else {
			log.info("File Name: " + file.getName());
			log.info("File coontentType: " + file.getContentType());
			log.info("File Size: " + file.getSize());

			dto.setOriginalFileName(file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			dto.setFileName(System.currentTimeMillis() + "_" + file.getOriginalFilename());
			dto.setFileSize(file.getSize());

			File physicalFile = new File(ContactDataConstant.FILE_LOCATION + dto.getFileName());
			try (OutputStream os = new FileOutputStream(physicalFile)) {
				os.write(file.getBytes());
			}

			boolean save = service.validateAndSave(dto);
			if (save) {
				boolean emailStatus = email.sendMail(dto.getEmail(), dto.getName());
				if (emailStatus) {
					model.addAttribute("success", "Request for " + dto.getName() + " is submitted successfully");
					model.addAttribute("email", "Confirmation email has been sent to your registered email-ID");
				}
			} else {
				model.addAttribute("failed", "Request for " + dto.getName() + " is not submitted");
			}
		}
		// return "Testing";
		return "Register";
	}

	@GetMapping("displayList")
	public String displayData(Model model) {
		log.info("running displayData()");
		List<ContactDataDTO> list = service.findAll();
		model.addAttribute("list", list);
		return "DisplayList";
	}

	@GetMapping("showFile")
	public void showFile(String fileName, String contentType, HttpServletResponse resp) throws IOException {
		log.info("running showFile()");
		File physicalFile = new File(ContactDataConstant.FILE_LOCATION + fileName); // STEP 1: GET ref of the file, by
																					// name passed
		resp.setContentType(contentType); // STEP2 : set content type
		OutputStream outputStream = resp.getOutputStream(); // STEP 3: write file as Bytes to response
		FileInputStream inputStream = new FileInputStream(physicalFile);
		byte[] buffer = new byte[4096];
		int length;
		while ((length = inputStream.read(buffer)) > 0) {
			outputStream.write(buffer, 0, length);
		}
		inputStream.close();
		outputStream.flush();
	}

	@GetMapping(value = "/validateEmail/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
	public String validateEmail(@PathVariable String email) {
		log.info("running validateEmail()");
		List<ContactDataDTO> list = service.findAll();
		for (ContactDataDTO dto : list) {
			if (dto.getEmail().equals(email)) {
				return "Email-Id is already exist";
			}
		}
		return "";
	}
	// return "Register";
	// }
}
