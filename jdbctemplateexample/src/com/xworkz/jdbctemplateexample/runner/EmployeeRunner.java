package com.xworkz.jdbctemplateexample.runner;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.jdbctemplateexample.config.SpringJDBCConfiguration;
import com.xworkz.jdbctemplateexample.dto.EmployeeDTO;
import com.xworkz.jdbctemplateexample.service.EmployeeService;

public class EmployeeRunner {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext spring = new AnnotationConfigApplicationContext(SpringJDBCConfiguration.class);

		System.out.println("No. of beans: " + spring.getBeanDefinitionCount());
		String[] beans = spring.getBeanDefinitionNames();
		Stream.of(beans).forEach(e -> System.out.println(e));
		
		EmployeeDTO dto1 = new EmployeeDTO(1, "Suma", "Patil", 30000, "Bengalore");
		EmployeeDTO dto2 = new EmployeeDTO(2, "Sanvi", "Bhovi", 50000, "Bagalkot");

		EmployeeService service = spring.getBean(EmployeeService.class);
		
		  boolean saved1 = service.validateAndSave(dto1);
		  System.out.println("DTO1 is saved: " + saved1); 
		  boolean saved2 =service.validateAndSave(dto2); 
		  System.out.println("DTO2 is saved: " +saved2);
		 
		EmployeeDTO dto = service.findById(2);
		System.out.println("DTO fetched by ID: 2: "+dto);
		
		AnnotationConfigApplicationContext ImplClass = (AnnotationConfigApplicationContext) spring;
		ImplClass.close();
	}
}
