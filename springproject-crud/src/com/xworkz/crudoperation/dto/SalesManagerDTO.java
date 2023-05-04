package com.xworkz.crudoperation.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalesManagerDTO implements Serializable, Comparable<SalesManagerDTO>{

	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String Salary;
	
	@Override
	public int compareTo(SalesManagerDTO o) {
		return name.compareTo(o.getName());
	}
	
	

	
}
