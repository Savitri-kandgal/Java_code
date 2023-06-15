package com.xworkz.contactdata.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.contactdata.dto.ContactDataDTO;
import lombok.extern.slf4j.Slf4j;

@Component
@RequestMapping
@Slf4j
public class ContactDataDefaultController {

	public ContactDataDefaultController() {
		log.info("created: "+this.getClass().getSimpleName());
	}
	
	@RequestMapping("start")
	public String onStart(Model model) {
		System.out.println("running onStart()");
		model.addAttribute("dto", new ContactDataDTO());
		return "Register";
	}
}

