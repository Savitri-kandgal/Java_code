package com.xworkz.beanannotation.componentclasses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student1 {

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
	
	 
	public Student1(@Value("1")int id, @Value("Suma")String name, @Value("5.1f")float height, 
			@Value("50.5")double weight, @Value("F")char gender, @Value("8756432987")long phNo,
			@Value("BE")String qualification, @Value("Rajajinagar")String address, 
			@Value("suma@gmail.com")String email, @Value("70.48")double percentange, 
			@Value("CS")String stream, @Value("false")boolean isMarried, @Value("Indian")String nationality,
			@Value("VTU")String univercity, @Value("BIET")String collage) {
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
		return 2015;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Student1 [id=" + id + ", name=" + name + ", height=" + height + ", weight=" + weight + ", gender="
				+ gender + ", phNo=" + phNo + ", qualification=" + qualification + ", address=" + address + ", email="
				+ email + ", percentange=" + percentange + ", stream=" + stream + ", isMarried=" + isMarried
				+ ", Nationality=" + Nationality + ", univercity=" + univercity + ", collage=" + collage + "]";
	}
	
	
	
	
}
