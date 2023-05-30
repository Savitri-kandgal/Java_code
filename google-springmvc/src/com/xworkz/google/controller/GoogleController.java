package com.xworkz.google.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Component
@RequestMapping("/")
public class GoogleController {

	public GoogleController() {
		System.out.println("Created GoogleController...");
	}
	
	@RequestMapping(value="/click")  //method = RequestMethod.POST - is not necessary 
	public ModelAndView onClick() {
		System.out.println("running onClick()...");
		String url="https://www.google.com";
		return new ModelAndView("redirect:"+url);
	}
	
	/*
	 * public RedirectView method1() { String url="https://www.google.com";
	 * RedirectView redirectView=new RedirectView(); redirectView.setUrl(url);
	 * return redirectView; }
	 */
	
}
