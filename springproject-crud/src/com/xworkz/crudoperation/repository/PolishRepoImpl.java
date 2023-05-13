package com.xworkz.crudoperation.repository;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.crudoperation.dto.PolishDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class PolishRepoImpl implements PolishRepo{

	private Collection<PolishDTO> dtoList;
	
	public boolean save(PolishDTO dto) {
		return dtoList.add(dto);
	}
}
