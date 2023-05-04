package com.xworkz.crudoperation.config;

import java.util.ArrayList;
import java.util.Collection;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.crudoperation.dto.PolishDTO;

@Configuration
@ComponentScan("com.xworkz.crudoperation")
public class CrudOperationConfig {

	@Bean
	public Validator validator() {
		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		return validator;
	}
	
	@Bean
	public Collection<PolishDTO> collectionRef(){
		Collection<PolishDTO> dtoList=new ArrayList<PolishDTO>();
		return dtoList;
	}
}
