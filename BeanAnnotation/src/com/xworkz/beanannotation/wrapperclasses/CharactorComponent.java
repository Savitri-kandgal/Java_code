package com.xworkz.beanannotation.wrapperclasses;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CharactorComponent {

	public CharactorComponent() {
	System.out.println("CharactorComponent is running...");
	}
	
	@Bean("alphabet1")
	public Character alphabet1() {
		return 'A';
	}
	
	@Bean("alphabet2")
	public Character alphabet2() {
		return 'B';
	}
	@Bean("alphabet3")
	public Character alphabet3() {
		return 'C';
	}
	@Bean("alphabet4")
	public Character alphabet4() {
		return 'D';
	}
	@Bean("alphabet5")
	public Character alphabet5() {
		return 'E';
	}
	@Bean("alphabet6")
	public Character alphabet6() {
		return 'F';
	}
	@Bean("alphabet7")
	public Character alphabet7() {
		return 'G';
	}
	@Bean("alphabet8")
	public Character alphabet8() {
		return 'H';
	}
	@Bean("alphabet9")
	public Character alphabet9() {
		return 'I';
	}
	
}
