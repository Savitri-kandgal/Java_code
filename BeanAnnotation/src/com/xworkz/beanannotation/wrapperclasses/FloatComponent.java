package com.xworkz.beanannotation.wrapperclasses;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class FloatComponent {

	public FloatComponent() {
		System.out.println("FloatComponent is running...");
	}
	
	@Bean("height1")
	public Float height1() {
		System.out.println("height1 bean is running...");
		return 5.1f;
	}
	
	@Bean("height2")
	public Float height2() {
		System.out.println("height2 bean is running...");
		return 5.2f;
	}
	
	@Bean("height3")
	public Float height3() {
		System.out.println("height3 bean is running...");
		return 5.3f;
	}
	
	@Bean("height4")
	public Float height4() {
		System.out.println("height4 bean is running...");
		return 5.4f;
	}
	@Bean("height5")
	public Float height5() {
		System.out.println("height5 bean is running...");
		return 5.5f;
	}
	@Bean("height6")
	public Float height6() {
		System.out.println("height6 bean is running...");
		return 5.6f;
	}
	@Bean("height7")
	public Float height7() {
		System.out.println("height7 bean is running...");
		return 5.7f;
	}
	@Bean("height8")
	public Float height8() {
		System.out.println("height8 bean is running...");
		return 5.8f;
	}
	@Bean("height9")
	public Float height9() {
		System.out.println("height9 bean is running...");
		return 5.9f;
	}
}
