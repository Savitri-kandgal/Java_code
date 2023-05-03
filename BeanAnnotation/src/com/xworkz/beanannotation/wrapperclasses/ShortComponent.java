package com.xworkz.beanannotation.wrapperclasses;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ShortComponent {

	public ShortComponent() {
		System.out.println("ShortComponent bean is running...");
	}
	
	@Bean("RegisterNo1")
	public Short RegisterNo1() {
		System.out.println("RegisterNo1 is running...");
		return 12341;
	}

	@Bean("RegisterNo2")
	public Short RegisterNo2() {
		System.out.println("RegisterNo2 is running...");
		return 25348;
	}
	
	@Bean("RegisterNo3")
	public Short RegisterNo3() {
		System.out.println("RegisterNo3 is running...");
		return 12343;
	}
	
	@Bean("RegisterNo4")
	public Short RegisterNo4() {
		System.out.println("RegisterNo4 is running...");
		return 12347;
	}
	
	@Bean("RegisterNo5")
	public Short RegisterNo5() {
		System.out.println("RegisterNo5 is running...");
		return 12344;
	}
	
	@Bean("RegisterNo6")
	public Short RegisterNo6() {
		System.out.println("RegisterNo6 is running...");
		return 12398;
	}
	
	@Bean("RegisterNo7")
	public Short RegisterNo7() {
		System.out.println("RegisterNo7 is running...");
		return 12360;
	}
	@Bean("RegisterNo8")
	public Short RegisterNo8() {
		System.out.println("RegisterNo8 is running...");
		return 12327;
	}
	@Bean("RegisterNo9")
	public Short RegisterNo9() {
		System.out.println("RegisterNo9 is running...");
		return 12318;
	}
	
}
