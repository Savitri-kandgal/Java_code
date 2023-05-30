package com.xworkz.icecream.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//default landing to display page for display the name

@Component
@RequestMapping("/") // mandatory
public class IceCreamController {

	public IceCreamController() {
		System.out.println("Created IceCreamController....");
	}

	/*	//if we want to make default page as landing.jsp like index.jsp below is the way(without implementing WebMvcConfigurer in config cls)
	 * @RequestMapping("/") public String landing() {
	 * System.out.println("Running landing()..."); return "landing"; }
	 */

	@RequestMapping("click") // "value=click" is not mandatory
	public String onClick() {
		System.out.println("Running onClick()...");
		return "Display"; 	// return "/Display.jsp this has been rewritten to return "Display" by using viewResolver() which is configured in springconfig class
	}
}
