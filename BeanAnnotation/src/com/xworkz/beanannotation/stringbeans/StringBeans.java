package com.xworkz.beanannotation.stringbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class StringBeans {

	public StringBeans() {
		System.out.println("StringBeans is running...");
	}

	@Bean("name")
	public String name() {
		System.out.println("Name bean is running...");
		return "Name: Savitri";
	}

	@Bean("age")
	public String age() {
		System.out.println("Age is running...");
		return "Age: 25";
	}

	@Bean("area")
	public String area() {
		System.out.println("area bean running...");
		return "Area: Rajaji Nagar";
	}

	@Bean("street")
	public String street() {
		System.out.println("street bean running...");
		return "Street: 2nd main";
	}

	@Bean("gender")
	public String gender() {
		System.out.println("gender bean is running...");
		return "Gender: Female";
	}

	@Bean("district")
	public String district() {
		System.out.println("district bean is running...");
		return "District: Bagalkot";
	}

	@Bean("phoneNo")
	public String phoneNo() {
		System.out.println("phoneNo bean is running...");
		return "Phone_No: 9743735361";
	}
	
	@Bean("institute")
	public String institute() {
		System.out.println("institute is running...");
		return "Institute: X-workz";
	}
	
	@Bean("height")
	public String height() {
		System.out.println("height is running...");
		return "Height: 5 feet";
	}
	
	@Bean("weight")
	public String weight() {
		System.out.println("weight is running...");
		return "Weight: 45 KGs";
	}
	
	@Bean("email")
	public String email() {
		System.out.println("Email is running...");
		return "Savitri.xworkz@gmail.com";
	}
	

}
