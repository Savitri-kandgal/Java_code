package com.xworkz.crudoperation.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.crudoperation.dto.SockDTO;
import com.xworkz.crudoperation.repository.SockRepo;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SockServiceImpl implements SockService{

	private Validator validator;
	private SockRepo repo;
	
	@Override
	public boolean validateAndSave(SockDTO dto) {
		if(dto!=null) {
			System.out.println("dto is not null");
			
			Set<ConstraintViolation<SockDTO>> cv = validator.validate(dto);
			if(cv!=null && !cv.isEmpty()) {
				System.out.println("No. of violations: "+cv.size());
				cv.forEach(c->System.out.println(c.getPropertyPath()+" "+c.getMessage()));
			}else {
				System.out.println("No Constraint Violation");
				boolean status=repo.save(dto);
				return status;
			}
		}
		return false;
	}

}
