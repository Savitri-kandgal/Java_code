package com.xworkz.jdbctemplateexample.service;

import com.xworkz.jdbctemplateexample.dto.EmployeeDTO;

public interface EmployeeService {

	public boolean validateAndSave(EmployeeDTO dto);
	
	default EmployeeDTO findById(int id) {
		return null;
	}
	
}
