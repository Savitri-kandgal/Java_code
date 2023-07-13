package com.xworkz.parkingrental.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WebInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer{
	
	public WebInitConfig() {
		log.info("Created: "+getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		log.info("running getRootConfigClasses()");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		log.info("running getServletConfigClasses()");
		return new Class[] {SpringConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		log.info("running getServletMappings()");
		return new String[] {"/"};
	}

}
