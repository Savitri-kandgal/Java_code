package com.xworkz.google.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.google")
public class GoogleSpringConfig implements WebMvcConfigurer {

	public GoogleSpringConfig() {
		System.out.println("Created GoogleSpringConfig...");
	}
}
