package com.xworkz.beanannotation.componentclasses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student12 {

	private int id;
	private String name;
	private float height;
	private double weight;
	private char gender;
	private long phNo;
	private String qualification;
	private String address;
	private String email;
	private double percentange;
	private String stream;
	private boolean isMarried;
	private String Nationality;
	private String univercity;
	private String collage;

	
	public Student12(@Value("12") int id, @Value("Ramesh") String name, @Value("5.5f") float height,
			@Value("50.5") double weight, @Value("M") char gender, @Value("8756432987")long phNo, @Value("B.TECH") String qualification,
			@Value("E.city") String address, @Value("Janani@gmail.com") String email,
			@Value("48.48") double percentange, @Value("Civil") String stream, @Value("True") boolean isMarried,
			@Value("Indian") String nationality, @Value("Bangalore") String univercity,
			@Value("BLD") String collage) {
		super();
		this.id = id;
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
		this.phNo = phNo;
		this.qualification = qualification;
		this.address = address;
		this.email = email;
		this.percentange = percentange;
		this.stream = stream;
		this.isMarried = isMarried;
		Nationality = nationality;
		this.univercity = univercity;
		this.collage = collage;
	}
	
	public int passedoutYear() {
		System.out.print("Passed of year:");
		return 2012;
	}
 
	@Override
	public String toString() {
		return "Student12 [id=" + id + ", name=" + name + ", height=" + height + ", weight=" + weight + ", gender="
				+ gender + ", phNo=" + phNo + ", qualification=" + qualification + ", address=" + address + ", email=" + email
				+ ", percentange=" + percentange + ", stream=" + stream + ", isMarried=" + isMarried + ", Nationality="
				+ Nationality + ", univercity=" + univercity + ", collage=" + collage + "]";
	}

}

