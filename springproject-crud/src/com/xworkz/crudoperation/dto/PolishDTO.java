package com.xworkz.crudoperation.dto;

import java.io.Serializable;

import javax.validation.constraints.*;
import lombok.*;

@Data
@AllArgsConstructor
public class PolishDTO implements Serializable, Comparable<PolishDTO>{
	private static final long serialVersionUID = 1L;
	
	@Min(value=1)
	@Max(value=10)
	private int id;
	@NonNull
	@NotEmpty
	@Size(min=3, max=20)
	private String brand;
	@Min(value=50)
	@Max(value=500)
	private int price;
	
	@Override
	public int compareTo(PolishDTO o) {
		return brand.compareTo(o.getBrand());
	}

}
