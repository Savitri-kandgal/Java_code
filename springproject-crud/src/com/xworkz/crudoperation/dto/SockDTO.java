package com.xworkz.crudoperation.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SockDTO implements Serializable, Comparable<SockDTO>{

	private static final long serialVersionUID = 1L;
	private int id;
	private String brand;
	private String color;
	
	@Override
	public int compareTo(SockDTO o) {
		return color.compareTo(o.getColor());
	}
	
	

	
}
