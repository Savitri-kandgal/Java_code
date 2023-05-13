package com.xworkz.jdbctemplateexample.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import org.springframework.stereotype.Component;

import com.xworkz.jdbctemplateexample.dto.EmployeeDTO;
import com.xworkz.jdbctemplateexample.repo.EmployeeRepo;

//import lombok.AllArgsConstructor;

@Component
//@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

	private Validator validator;
	private EmployeeRepo repo;

	public EmployeeServiceImpl(Validator validator, EmployeeRepo repo) {
		super();
		this.validator = validator;
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(EmployeeDTO dto) {

		if (dto != null) {
			System.out.println("DTO is not null");
			Set<ConstraintViolation<EmployeeDTO>> cv = validator.validate(dto);
			if (cv != null && !cv.isEmpty()) {
				System.err.println("No. of Constraint Violation/s: "+cv.size());
				cv.forEach(c -> System.err.println("* "+c.getPropertyPath() + " " + c.getMessage()));
				return false;
			} else {
				System.out.println("No Constraint Violation found");
				return repo.save(dto);
			}
		} else {
			System.out.println("DTO is null");
		}
		return false;
	}
	
	public EmployeeDTO findById(int id) {
		return repo.findById(id);
	}

}
