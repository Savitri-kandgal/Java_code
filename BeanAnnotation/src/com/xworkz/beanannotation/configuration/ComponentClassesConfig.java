package com.xworkz.beanannotation.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.beanannotation.componentclasses")
public class ComponentClassesConfig {

	public ComponentClassesConfig() {
		System.out.println("ComponentClassesConfig is running...");
	}
}
