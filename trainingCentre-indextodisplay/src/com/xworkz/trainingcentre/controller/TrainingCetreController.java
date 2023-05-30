package com.xworkz.trainingcentre.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

//index to display for display name

@Component
@RequestMapping("/")
public class TrainingCetreController {

	public TrainingCetreController() {
		System.out.println("Created TrainingCetreController...");
	}
	
	@RequestMapping("click")
	public String onClick() {
		System.out.println("running onClick()...");
		return "Display";
	}
}
