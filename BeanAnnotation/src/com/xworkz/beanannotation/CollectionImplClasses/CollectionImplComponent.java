package com.xworkz.beanannotation.CollectionImplClasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CollectionImplComponent {

	public CollectionImplComponent() {
		System.out.println("CollectionImplComponent is running...");
	}

	@Bean("arrayList")
	public List<String> arrayList() {
		List<String> names = new ArrayList<>();
		names.add("Savitri");
		names.add("Siddu");
		names.add("Sanvi");
		names.add("Sathvik");
		names.add("Nakshatra");
		return names;
	}

	@Bean("linkedList")
	public List<Integer> linkedList() {
		List<Integer> ages = new LinkedList<Integer>();
		ages.add(29);
		ages.add(30);
		ages.add(31);
		ages.add(32);
		ages.add(33);
		return ages;
	}
	
	@Bean("hashSet")
	public Set<Byte> hashSet() {
		Set<Byte> rollNos = new HashSet<Byte>();
		rollNos.add((byte) 101);
		rollNos.add((byte) 102);
		rollNos.add((byte) 103);
		rollNos.add((byte) 104);
		rollNos.add((byte) 105);
		return rollNos;
	}
	
	@Bean("linkedHashSet")
	public Set<String> linkedHashSet() {
		Set<String> genders=new LinkedHashSet<String>();
		genders.add("Female");
		genders.add("Male");
		genders.add("Female");
		genders.add("Male");
		genders.add("Other");
		return genders;
	}
	
	@Bean("treeSet")
	public Set<Short> treeSet() {
		Set<Short> numbers=new TreeSet<Short>();
		numbers.add((short) 55);
		numbers.add((short) 58);
		numbers.add((short) 20);
		numbers.add((short) 86);
		numbers.add((short) 18);
		return numbers;
	}
}
