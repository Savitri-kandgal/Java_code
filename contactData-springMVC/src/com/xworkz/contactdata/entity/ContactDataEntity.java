package com.xworkz.contactdata.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
@Table(name="contact_details")
public class ContactDataEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String mobileNo;
	private String comments;
	private String fileName;
	private String originalFileName;
	private String contentType;
	private long fileSize;
	
	public ContactDataEntity(){
		log.info("Created: "+this.getClass().getSimpleName());
	}

}
