package com.xworkz.contactdata.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.xworkz.contactdata.constant.ContactDataConstant;
import com.xworkz.contactdata.dto.ContactDataDTO;
import com.xworkz.contactdata.email.ContactDataEmail;
import com.xworkz.contactdata.service.ContactDataService;

import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping
@Slf4j
public class ContactDataController {

	@Autowired
	private ContactDataService service;
	@Autowired
	private ContactDataEmail email;
	
	public ContactDataController() {
		System.out.println("Created: "+this.getClass().getSimpleName());
	}
	
	@PostMapping("register")
	public String onSubmit(@Valid ContactDataDTO dto, BindingResult br, Model model, MultipartFile file) throws IOException {
		System.out.println("running onSubmit()");
		System.out.println("DTO: "+dto);
		
		if(br.hasErrors()) {
			log.info("data is invalid");
			model.addAttribute("error", "data is invalid");
			model.addAttribute("errors", br.getFieldErrors());
			br.getFieldErrors().forEach(e->log.info(e.getField()+" "+e.getDefaultMessage()));
		}else {
			log.info("File Name: "+file.getName());
			log.info("File coontentType: "+file.getContentType());
			log.info("File Size: "+file.getSize());
			
			dto.setOriginalFileName(file.getOriginalFilename());
			dto.setContentType(file.getContentType());
			dto.setFileName(System.currentTimeMillis()+"_"+file.getOriginalFilename());
			dto.setFileSize(file.getSize());
			
			File physicalFile=new File(ContactDataConstant.FILE_LOCATION+dto.getFileName());
			try(OutputStream os=new FileOutputStream(physicalFile)){
				os.write(file.getBytes());
			} 
			
			boolean save=service.validateAndSave(dto);
			if(save) {
				boolean emailStatus = email.sendMail(dto.getEmail(), dto.getName());
				if(emailStatus) {
					model.addAttribute("success", "Request for "+dto.getName()+" is submitted successfully");
					model.addAttribute("email", "Confirmation email has been sent to your registered email-ID");
				}
			}else {
				model.addAttribute("failed", "Request for "+dto.getName()+" is not submitted");
			}
		}
		return "Register";
	}
	
	@GetMapping("displayData")
	public String displayData(Model model) {
		log.info("running displayData()");
		//model.addAttribute("list", )
		return "DisplayData";
	}
	
}
