package com.xworkz.beanannotation.boot;

import java.util.stream.Stream;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.beanannotation.configuration.CollectionImplConfiguration;

public class CollectionImplRunner {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext spring = new AnnotationConfigApplicationContext(CollectionImplConfiguration.class);
		int count = spring.getBeanDefinitionCount();
		System.out.println("No. of beans: " + count);

		String[] beans = spring.getBeanDefinitionNames();
		Stream.of(beans).forEach(System.out::println);
		
		System.out.println();
		System.out.println("Collection Impl Classes");
		System.out.println(spring.getBean("arrayList"));
		System.out.println(spring.getBean("linkedList"));
		System.out.println(spring.getBean("hashSet"));
		System.out.println(spring.getBean("linkedHashSet"));
		System.out.println(spring.getBean("treeSet"));
	}
}

