package com.xworkz.pg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc // this wl work only with @Configuration
@ComponentScan("com.xworkz.pg")
public class PgSpringConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("Landing");
	}

	//this is for avoid 
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver ViewResolver = new InternalResourceViewResolver();
		ViewResolver.setPrefix("/");
		ViewResolver.setSuffix(".jsp");
		return ViewResolver;
	}

}
