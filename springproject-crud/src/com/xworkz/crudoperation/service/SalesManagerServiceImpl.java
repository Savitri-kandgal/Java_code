package com.xworkz.crudoperation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.crudoperation.dto.SalesManagerDTO;
import com.xworkz.crudoperation.repository.SalesManagerRepo;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalesManagerServiceImpl implements SalesManagrService {

	private Validator validator;
	private SalesManagerRepo repo;

	@Override
	public boolean validateAndSave(SalesManagerDTO dto) {
		if (dto != null) {
			System.out.println("dto is not null");
			Set<ConstraintViolation<SalesManagerDTO>> cv = validator.validate(dto);
			if (cv != null && !cv.isEmpty()) {
				System.out.println("No. of Violations: " + cv.size());
				cv.forEach(c -> System.out.println(c.getPropertyPath() + " " + c.getMessage()));
			} else {
				System.out.println("No Constraint Violation");
				boolean status = repo.save(dto);
				return status;
			}

		} else {
			System.err.println("dot is null");
		}
		return false;
	}
}
