package com.xworkz.contactdata.service;

import java.util.List;

import com.xworkz.contactdata.dto.ContactDataDTO;
import com.xworkz.contactdata.entity.ContactDataEntity;

public interface ContactDataService {

	boolean validateAndSave(ContactDataDTO dto);
	
	List<ContactDataDTO> findAll();
}
