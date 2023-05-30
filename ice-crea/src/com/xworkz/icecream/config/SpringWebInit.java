package com.xworkz.icecream.config;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("Running getRootConfigClasses...");
		return null;
	}

	//giving configuration class to AC (Spring container)
	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses...");
		return new Class[] {SpringConfig.class};
	}

	//mapping actions to Dispatcher-Servlet (if any request(static/dynamic) comes giving/mapping it to DS to handle 
	//but purpose of DS it to handle only dynamic resources hence we override method called configureDefaultServletHandling(See below)
	@Override
	protected String[] getServletMappings() {
		System.out.println("Running getServletMappings...");
		return new String[] {"/"};
	}
	
	//enable server to handle the static resource by default Servlet
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
