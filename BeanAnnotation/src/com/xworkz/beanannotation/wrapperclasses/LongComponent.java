package com.xworkz.beanannotation.wrapperclasses;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LongComponent {

	public LongComponent() {
		System.out.println("LongComponent bean is running...");
	}
	
	@Bean("phNo1")
	public Long phNo1() {
		System.out.println("phNo1 bean is running...");
		return 8976543279l;
	}
	@Bean("phNo2")
	public Long phNo2() {
		System.out.println("phNo2 bean is running...");
		return 8976543228l;
	}
	@Bean("phNo3")
	public Long phNo3() {
		System.out.println("phNo3 bean is running...");
		return 8876543279l;
	}
	@Bean("phNo4")
	public Long phNo4() {
		System.out.println("phNo4 bean is running...");
		return 7776543279l;
	}
	@Bean("phNo5")
	public Long phNo5() {
		System.out.println("phNo5 bean is running...");
		return 6676543269l;
	}
	@Bean("phNo6")
	public Long phNo6() {
		System.out.println("phNo6 bean is running...");
		return 8976543270l;
	}
	@Bean("phNo7")
	public Long phNo7() {
		System.out.println("phNo7 bean is running...");
		return 9776543279l;
	}
	@Bean("phNo8")
	public Long phNo8() {
		System.out.println("phNo8 bean is running...");
		return 8676543270l;
	}
	@Bean("phNo9")
	public Long phNo9() {
		System.out.println("phNo9 bean is running...");
		return 7976543273l;
	}
	
	
}
