package com.xworkz.beanannotation.wrapperclasses;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ByteComponent {

	public ByteComponent() {
		System.out.println("Byte Component is Running...");
	}

	@Bean("studentId")
	public Byte studentId() {
		System.out.println("studentId bean is running...");
		return 101;
	}

	@Bean("ssnId")
	public Byte ssnId() {
		System.out.println("ssnId bean is running...");
		return 102;
	}

	@Bean("EmpId")
	public Byte EmpId() {
		System.out.println("EmpId bean is running...");
		return 103;
	}

	@Bean("RegistrationId")
	public Byte RegistrationId() {
		System.out.println("RegistrationId bean is running...");
		return 104;
	}

	@Bean("transactionId")
	public Byte transactionId() {
		System.out.println("transactionId bean is running...");
		return 105;
	}

	@Bean("orderId")
	public Byte orderId() {
		System.out.println("orderId bean is running...");
		return 106;
	}

	@Bean("orderCancelledId")
	public Byte orderCancelledId() {
		System.out.println("orderCancelledId bean is running...");
		return 107;
	}

	@Bean("shippingId")
	public Byte shippingId() {
		System.out.println("shippingId bean is running...");
		return 108;
	}

	@Bean("productId")
	public Byte productId() {
		System.out.println("productId bean is running...");
		return 109;
	}

}
