package com.xworkz.projector.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan("com.xworkz.projector")
public class ProjectorSpringConfig{

	public ProjectorSpringConfig() {
		System.out.println("Created ProjectorSpringConfig...");
	}
	
	  @Bean public ViewResolver viewResolver() { InternalResourceViewResolver
	  ViewResolver = new InternalResourceViewResolver();
	  ViewResolver.setPrefix("/"); ViewResolver.setSuffix(".jsp"); return
	  ViewResolver; }
}
