package com.xworkz.contactdata.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Slf4j
public class ContactDataDTO implements Comparable<ContactDataDTO> {

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

	@Override
	public int compareTo(ContactDataDTO o) {
		return name.compareTo(o.getName());
	}
}
