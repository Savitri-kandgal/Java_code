package com.xworkz.crudoperation.repository;

import java.util.Collection;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.stereotype.Component;

import com.xworkz.crudoperation.dto.SalesManagerDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SalesManagerRepoImpl implements SalesManagerRepo {

	private Collection<SalesManagerDTO> list;

	public boolean save(SalesManagerDTO dto) {

		return list.add(dto);
	}

}
