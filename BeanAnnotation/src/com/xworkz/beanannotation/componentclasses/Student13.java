package com.xworkz.beanannotation.componentclasses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student13 {

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

	
	public Student13(@Value("13") int id, @Value("Praveen") String name, @Value("5.5f") float height,
			@Value("50.5") double weight, @Value("M") char gender, @Value("8756432987")long phNo, @Value("B.TECH") String qualification,
			@Value("E.city") String address, @Value("Praveen@gmail.com") String email,
			@Value("80.48") double percentange, @Value("IS") String stream, @Value("false") boolean isMarried,
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
		return 2014;
	}

	
	@Override
	public String toString() {
		return "Student13 [id=" + id + ", name=" + name + ", height=" + height + ", weight=" + weight + ", gender="
				+ gender + ", phNo=" + phNo + ", qualification=" + qualification + ", address=" + address + ", email=" + email
				+ ", percentange=" + percentange + ", stream=" + stream + ", isMarried=" + isMarried + ", Nationality="
				+ Nationality + ", univercity=" + univercity + ", collage=" + collage + "]";
	}

}

