package com.xworkz.projector.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

//index to index page

@Component
@RequestMapping("/")
public class ProjectorController {

	public ProjectorController() {
		System.out.println("Created ProjectorController...");
	}
	
	@RequestMapping("click")
	public String onClick() {
		System.out.println("running onClick()...");
		return "index";
	}
}
