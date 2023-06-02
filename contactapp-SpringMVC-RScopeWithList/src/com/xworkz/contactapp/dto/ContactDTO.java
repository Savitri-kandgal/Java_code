package com.xworkz.contactapp.dto;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
@EqualsAndHashCode
public class ContactDTO implements Serializable, Comparable<ContactDTO> {

	private String name;
	private String email;
	private String country;
	private long mobile;
	private String type;
	private String description;
	
	public ContactDTO() {
		System.out.println("Created ContactDTO...");
	}
	@Override
	public int compareTo(ContactDTO o) {
		return name.compareTo(o.getName());
	}

}
