package com.xworkz.beanannotation.wrapperclasses;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class IntergerComponent {

	public IntergerComponent() {
		System.out.println("IntergerComponent is running...");
	}
	
	@Bean("pincode1")
	public Integer pincode1() {
		System.out.println("pincode1 is running...");
		return 123456;
	}
	
	@Bean("pincode2")
	public Integer pincode2() {
		System.out.println("pincode2 is running...");
		return 142537;
	}
	@Bean("pincode3")
	public Integer pincode3() {
		System.out.println("pincode3 is running...");
		return 122456;
	}
	@Bean("pincode4")
	public Integer pincode4() {
		System.out.println("pincode4 is running...");
		return 123458;
	}
	@Bean("pincode5")
	public Integer pincode5() {
		System.out.println("pincode5 is running...");
		return 123439;
	}
	@Bean("pincode6")
	public Integer pincode6() {
		System.out.println("pincode6 is running...");
		return 123420;
	}
	@Bean("pincode7")
	public Integer pincode7() {
		System.out.println("pincode7 is running...");
		return 123401;
	}
	@Bean("pincode8")
	public Integer pincode8() {
		System.out.println("pincode8 is running...");
		return 123446;
	}
	@Bean("pincode9")
	public Integer pincode9() {
		System.out.println("pincode9 is running...");
		return 123499;
	}
}
