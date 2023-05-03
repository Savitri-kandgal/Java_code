package com.xworkz.beanannotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.beanannotation.stringbeans")
public class StringBeanConfiguration {
	
	public StringBeanConfiguration() {
		System.out.println("BeanConfiguration running...");
	}
	
	@Bean("test")
	public String testing() {
		System.out.println("test bean is running....");
		return "testing bean successfully registered";
	}

	@Bean("run")
	public String run() {
		System.out.println("run bean is running...");
		return "run bean successfully registered";
	}
}
