package com.xworkz.crudoperation.repository;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.xworkz.crudoperation.dto.SockDTO;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SockRepoImpl implements SockRepo {
	
	private Collection<SockDTO> list;
	
	public boolean save(SockDTO dto) {
		return list.add(dto);
	}

}
