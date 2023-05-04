package com.xworkz.crudoperation.repository;

import com.xworkz.crudoperation.dto.SalesManagerDTO;

public interface SalesManagerRepo {

	default boolean save(SalesManagerDTO dto) {
		return false;
	}
}
