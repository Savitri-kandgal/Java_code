package com.xworkz.crudoperation.repository;

import org.springframework.stereotype.Component;

import com.xworkz.crudoperation.dto.SockDTO;

@Component
public interface SockRepo {

	default boolean save(SockDTO dto) {
		return false;
	}
}
