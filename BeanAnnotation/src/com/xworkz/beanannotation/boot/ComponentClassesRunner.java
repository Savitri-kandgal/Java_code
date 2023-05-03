package com.xworkz.beanannotation.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.beanannotation.componentclasses.Student1;
import com.xworkz.beanannotation.componentclasses.Student10;
import com.xworkz.beanannotation.componentclasses.Student11;
import com.xworkz.beanannotation.componentclasses.Student12;
import com.xworkz.beanannotation.componentclasses.Student13;
import com.xworkz.beanannotation.componentclasses.Student2;
import com.xworkz.beanannotation.componentclasses.Student3;
import com.xworkz.beanannotation.componentclasses.Student4;
import com.xworkz.beanannotation.componentclasses.Student5;
import com.xworkz.beanannotation.componentclasses.Student6;
import com.xworkz.beanannotation.componentclasses.Student7;
import com.xworkz.beanannotation.componentclasses.Student8;
import com.xworkz.beanannotation.componentclasses.Student9;
import com.xworkz.beanannotation.configuration.ComponentClassesConfig;

public class ComponentClassesRunner {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext spring=new AnnotationConfigApplicationContext(ComponentClassesConfig.class);
		int count=spring.getBeanDefinitionCount();
		System.out.println("No. of beans: "+count);
		
		Stream.of(spring.getBeanDefinitionNames()).forEach(System.out::println);
		
		spring.getBean(Student1.class);
		System.out.println();
		System.out.println("Component Classes");
		System.out.println();
		Student1 std1=spring.getBean(Student1.class);
		System.out.println(std1);
		System.out.println(std1.passedoutYear());
		
		System.out.println();
		Student2 std2 = spring.getBean(Student2.class);
		System.out.println(std2);
		System.out.println(std2.passedoutYear());
		
		System.out.println();
		Student3 std3=spring.getBean(Student3.class);
		System.out.println(std3);
		System.out.println(std3.passedoutYear());
		
		System.out.println();
		Student4 std4=spring.getBean(Student4.class);
		System.out.println(std4);
		System.out.println(std4.passedoutYear());
		
		System.out.println();
		Student5 std5=spring.getBean(Student5.class);
		System.out.println(std5);
		System.out.println(std5.passedoutYear());
		
		System.out.println();
		Student6 std6=spring.getBean(Student6.class);
		System.out.println(std6);
		System.out.println(std6.passedoutYear());
		
		System.out.println();
		Student7 std7=spring.getBean(Student7.class);
		System.out.println(std7);
		System.out.println(std7.passedoutYear());
		
		System.out.println();
		Student8 std8=spring.getBean(Student8.class);
		System.out.println(std8);
		System.out.println(std8.passedoutYear());

		System.out.println();
		Student9 std9=spring.getBean(Student9.class);
		System.out.println(std9);
		System.out.println(std9.passedoutYear());
		
		System.out.println();
		Student10 std10=spring.getBean(Student10.class);
		System.out.println(std10);
		System.out.println(std10.passedoutYear());
		
		System.out.println();
		Student11 std11=spring.getBean(Student11.class);
		System.out.println(std11);
		System.out.println(std11.passedoutYear());
		
		System.out.println();
		Student12 std12=spring.getBean(Student12.class);
		System.out.println(std12);
		System.out.println(std12.passedoutYear());
		
		System.out.println();
		Student13 std13=spring.getBean(Student13.class);
		System.out.println(std13);
		System.out.println(std13.passedoutYear());
	}
}
