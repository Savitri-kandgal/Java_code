package com.xworkz.crudoperation.repository;

import com.xworkz.crudoperation.dto.PolishDTO;

public interface PolishRepo {

	default boolean save(PolishDTO dto) {
		return false;
	}
}
