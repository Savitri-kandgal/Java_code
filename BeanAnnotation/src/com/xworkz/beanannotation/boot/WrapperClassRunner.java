package com.xworkz.beanannotation.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beanannotation.configuration.WrapperClassesConfiguration;

public class WrapperClassRunner {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext spring = new AnnotationConfigApplicationContext(WrapperClassesConfiguration.class);
		int count = spring.getBeanDefinitionCount();
		System.out.println("No. of beans: " + count);

		String[] beans = spring.getBeanDefinitionNames();
		Stream.of(beans).forEach(System.out::println);

		System.out.println();
		System.out.println("Byte wrapper class");
		System.out.println(spring.getBean("studentId"));
		System.out.println(spring.getBean("ssnId"));
		System.out.println(spring.getBean("EmpId"));
		System.out.println(spring.getBean("RegistrationId"));
		System.out.println(spring.getBean("transactionId"));
		System.out.println(spring.getBean("orderId"));
		System.out.println(spring.getBean("orderCancelledId"));
		System.out.println(spring.getBean("shippingId"));
		System.out.println(spring.getBean("productId"));

		System.out.println();
		System.out.println("Short wrapper class");
		System.out.println(spring.getBean("RegisterNo1"));
		System.out.println(spring.getBean("RegisterNo2"));
		System.out.println(spring.getBean("RegisterNo3"));
		System.out.println(spring.getBean("RegisterNo4"));
		System.out.println(spring.getBean("RegisterNo5"));
		System.out.println(spring.getBean("RegisterNo6"));
		System.out.println(spring.getBean("RegisterNo7"));
		System.out.println(spring.getBean("RegisterNo8"));
		System.out.println(spring.getBean("RegisterNo9"));
		
		System.out.println();
		System.out.println("Interger wrapper class");
		System.out.println(spring.getBean("pincode1"));
		System.out.println(spring.getBean("pincode2"));
		System.out.println(spring.getBean("pincode3"));
		System.out.println(spring.getBean("pincode4"));
		System.out.println(spring.getBean("pincode5"));
		System.out.println(spring.getBean("pincode6"));
		System.out.println(spring.getBean("pincode7"));
		System.out.println(spring.getBean("pincode8"));
		System.out.println(spring.getBean("pincode9"));
		
		System.out.println();
		System.out.println("Long wrapper class");
		System.out.println(spring.getBean("phNo1"));
		System.out.println(spring.getBean("phNo2"));
		System.out.println(spring.getBean("phNo3"));
		System.out.println(spring.getBean("phNo4"));
		System.out.println(spring.getBean("phNo5"));
		System.out.println(spring.getBean("phNo6"));
		System.out.println(spring.getBean("phNo7"));
		System.out.println(spring.getBean("phNo8"));
		System.out.println(spring.getBean("phNo8"));
	
		
		System.out.println();
		System.out.println("Float wrapper class");
		System.out.println(spring.getBean("height1"));
		System.out.println(spring.getBean("height2"));
		System.out.println(spring.getBean("height3"));
		System.out.println(spring.getBean("height4"));
		System.out.println(spring.getBean("height5"));
		System.out.println(spring.getBean("height6"));
		System.out.println(spring.getBean("height7"));
		System.out.println(spring.getBean("height8"));
		System.out.println(spring.getBean("height9"));
	
	
	System.out.println();
	System.out.println("Double wrapper class");
	System.out.println(spring.getBean("readingValue1"));
	System.out.println(spring.getBean("readingValue2"));
	System.out.println(spring.getBean("readingValue3"));
	System.out.println(spring.getBean("readingValue4"));
	System.out.println(spring.getBean("readingValue5"));
	System.out.println(spring.getBean("readingValue6"));
	System.out.println(spring.getBean("readingValue7"));
	System.out.println(spring.getBean("readingValue8"));
	System.out.println(spring.getBean("readingValue9"));
	
	System.out.println();
	System.out.println("Charactor wrapper class");
	System.out.println(spring.getBean("alphabet1"));
	System.out.println(spring.getBean("alphabet2"));
	System.out.println(spring.getBean("alphabet3"));
	System.out.println(spring.getBean("alphabet4"));
	System.out.println(spring.getBean("alphabet5"));
	System.out.println(spring.getBean("alphabet6"));
	System.out.println(spring.getBean("alphabet7"));
	System.out.println(spring.getBean("alphabet8"));
	System.out.println(spring.getBean("alphabet9"));

}
}
