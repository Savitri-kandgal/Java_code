package com.xworkz.crudoperation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.crudoperation.dto.PolishDTO;
import com.xworkz.crudoperation.repository.PolishRepo;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PolishServiceImpl implements PolishService {

	private Validator validator;
	private PolishRepo repo;

	@Override
	public boolean validateAndSave(PolishDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");

			Set<ConstraintViolation<PolishDTO>> cv = validator.validate(dto);
			if (cv != null && !cv.isEmpty()) {
				System.err.println("No. of Constraint Violation: " + cv.size());
				cv.forEach(c -> System.out.println(c.getPropertyPath() + " " + c.getMessage()));
			} else {
				System.out.println("No Constraint Violation");
				boolean status=repo.save(dto);
				return status;
			}
		}else {
			System.out.println("dto is null");
		}
		return false;
	}

}
