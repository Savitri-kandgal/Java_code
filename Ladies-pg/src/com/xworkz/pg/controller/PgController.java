package com.xworkz.pg.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

//default landing to landing page

@Component
@RequestMapping("/")
public class PgController {

	public PgController() {
		System.out.println("Created PgController...");
	}
	
	@RequestMapping("click")
	public String onClick() {
		System.out.println("running onClick()...");
		return "Landing";
	}
}
