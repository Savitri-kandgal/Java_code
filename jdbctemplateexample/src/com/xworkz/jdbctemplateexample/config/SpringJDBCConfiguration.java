package com.xworkz.jdbctemplateexample.config;

import javax.sql.DataSource;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.xworkz.jdbctemplateexample")
public class SpringJDBCConfiguration {

	public SpringJDBCConfiguration() {
		System.out.println("EmployeeConfig is running in no-arg constructor");
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource=new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/frame_work");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate JdbcTemplate() {
		JdbcTemplate JdbcTemplate=new JdbcTemplate(); //(dataSource());
		JdbcTemplate.setDataSource(dataSource());
		return JdbcTemplate;
	}
	
	@Bean
	public Validator validator() {
		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator=factory.getValidator();
		return validator;
	}
}
