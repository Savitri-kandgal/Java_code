package com.xworkz.contactdata.service;

import com.xworkz.contactdata.dto.ContactDataDTO;

public interface ContactDataService {

	boolean validateAndSave(ContactDataDTO dto);
}
