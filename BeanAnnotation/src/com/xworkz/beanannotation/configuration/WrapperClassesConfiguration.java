package com.xworkz.beanannotation.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.beanannotation.wrapperclasses")
public class WrapperClassesConfiguration {

	public WrapperClassesConfiguration() {
		System.out.println("WrapperClassesConfiguration is running...");
	}

}
