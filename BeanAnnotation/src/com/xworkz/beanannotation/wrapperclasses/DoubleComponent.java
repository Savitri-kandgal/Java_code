package com.xworkz.beanannotation.wrapperclasses;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DoubleComponent {

	public DoubleComponent() {
		System.out.println("DoubleComponent bean is running...");
	}
	
	@Bean("readingValue1")
	public Double readingValue1() {
		System.out.println("readingValue1 is running...");
		return 12345678.0001;
	}
	
	@Bean("readingValue2")
	public Double readingValue2() {
		System.out.println("readingValue2 is running...");
		return 12345678.003546;
	}
	@Bean("readingValue3")
	public Double readingValue3() {
		System.out.println("readingValue3 is running...");
		return 12345678.07384;
	}
	@Bean("readingValue4")
	public Double readingValue4() {
		System.out.println("readingValue4 is running...");
		return 12345678.0218;
	}
	@Bean("readingValue5")
	public Double readingValue5() {
		System.out.println("readingValue5 is running...");
		return 12345678.0323;
	}
	@Bean("readingValue6")
	public Double readingValue6() {
		System.out.println("readingValue6 is running...");
		return 12345678.04943;
	}
	@Bean("readingValue7")
	public Double readingValue7() {
		System.out.println("readingValue7 is running...");
		return 12345678.03232;
	}
	@Bean("readingValue8")
	public Double readingValue8() {
		System.out.println("readingValue8 is running...");
		return 12345678.29942;
	}
	@Bean("readingValue9")
	public Double readingValue9() {
		System.out.println("readingValue9 is running...");
		return 12345678.021323;
	}
	
}

