package com.xworkz.jdbctemplateexample.repo;

import com.xworkz.jdbctemplateexample.dto.EmployeeDTO;

public interface EmployeeRepo {

	public boolean save(EmployeeDTO dto);
	
	default EmployeeDTO findById(int id) {
		return null;
	}
	
}
