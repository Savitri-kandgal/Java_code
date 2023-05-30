package com.xworkz.ksrtc.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

//default landing page to details page

@Component
@RequestMapping("/")
public class KsrtcController {

	public KsrtcController() {
		System.out.println("Created KsrtcController...");
	}
	
	@RequestMapping("click")
	public String onClick() {
		System.out.println("onClick() is running...");
		return "Details";
	}
}