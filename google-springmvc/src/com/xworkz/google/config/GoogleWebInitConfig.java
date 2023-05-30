package com.xworkz.google.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class GoogleWebInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running getServletConfigClasses...");
		return new Class[] {GoogleSpringConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running getServletMappings...");
		return new String[] {"/"};
	}
}
