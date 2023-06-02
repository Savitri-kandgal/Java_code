package com.xworkz.contactapp.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.xworkz.contactapp.dto.ContactDTO;

@Configuration
@EnableWebMvc
@ComponentScan("com.xworkz.contactapp")
public class ContactSpringConfig implements WebMvcConfigurer {

	public ContactSpringConfig() {
		System.out.println("Created ContactSpringConfig");
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("Welcome");
	}

	@Bean
	public ViewResolver vr() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setSuffix(".jsp");
		return vr;
	}

	@Bean
	public List<ContactDTO> list() {
		List<ContactDTO> list = new ArrayList<ContactDTO>();
		return list;
	}
}
