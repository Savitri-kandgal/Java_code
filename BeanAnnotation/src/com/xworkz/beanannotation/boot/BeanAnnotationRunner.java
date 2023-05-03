package com.xworkz.beanannotation.boot;
import java.util.stream.Stream;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beanannotation.configuration.StringBeanConfiguration;

public class BeanAnnotationRunner {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext spring=new AnnotationConfigApplicationContext(StringBeanConfiguration.class);
		int count=spring.getBeanDefinitionCount();
		System.out.println("No. of Beans: "+count);
		String[] beans=spring.getBeanDefinitionNames();
		Stream.of(beans).forEach(System.out::println);
		
		System.out.println(spring.getBean("test", String.class));
		System.out.println(spring.getBean("run"));
		System.out.println(spring.getBean("name"));
		System.out.println(spring.getBean("age", String.class));
		System.out.println(spring.getBean("area"));
		System.out.println(spring.getBean("street", String.class));
		String gender = (String) spring.getBean("gender"); 			//casting
		System.out.println(gender.toUpperCase());
		System.out.println(spring.getBean("district"));
		System.out.println(spring.getBean("phoneNo"));
		System.out.println(spring.getBean("institute"));
		System.out.println(spring.getBean("height"));
		System.out.println(spring.getBean("weight"));
		System.out.println(spring.getBean("email", String.class));
		
	}
}
