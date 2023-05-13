package com.xworkz.jdbctemplateexample.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

//import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
public class EmployeeDTO {

	@Min(value=1)
	@Max(value=20)
	private int id;
	@NonNull
	@NotEmpty
	@Size(min=3, max=25)
	private String fName;
	@NonNull
	@NotEmpty
	@Size(min=3, max=25)
	private String lName;
	@Min(value=10000)
	@Max(value=50000)
	private int salary;
	@NonNull
	@NotEmpty
	@Size(min=3, max=25)
	private String address;
	
	public EmployeeDTO(@Min(1) @Max(20) int id, @NonNull @NotEmpty @Size(min = 3, max = 25) String fName,
			@NonNull @NotEmpty @Size(min = 3, max = 25) String lName, @Min(10000) @Max(50000) int salary,
			@NonNull @NotEmpty @Size(min = 3, max = 25) String address) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.salary = salary;
		this.address = address;
	}

	public EmployeeDTO() {
	}
	
	
}
