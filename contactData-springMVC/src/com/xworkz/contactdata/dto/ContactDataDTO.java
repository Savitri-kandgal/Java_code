package com.xworkz.contactdata.dto;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class ContactDataDTO {

	private String name;
	private String email;
	private long mobileNo;
	private String comments;
	private String fileName;
	private String originalFileName;
	private String contentType;
	private long fileSize;
	
	public ContactDataDTO(){
		log.info("Created: "+this.getClass().getSimpleName());
	}
}
