package com.xworkz.contactdata.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.xworkz.contactdata.dto.ContactDataDTO;
import com.xworkz.contactdata.entity.ContactDataEntity;
import com.xworkz.contactdata.repository.ContactDataRepo;

import lombok.extern.slf4j.Slf4j;

//@Service
@Component
@Slf4j
public class ContactDataServiceImpl implements ContactDataService{

	@Autowired
	private ContactDataRepo repo;
	
	public ContactDataServiceImpl() {
		log.info("Created: "+this.getClass().getSimpleName());
	}

	@Override
	public boolean validateAndSave(ContactDataDTO dto) {
		log.info("Service: running validateAndSave()");
		if(dto!=null) {
			log.info("dto is not null");
			ContactDataEntity entity=new ContactDataEntity();
			BeanUtils.copyProperties(dto, entity);
			System.out.println("Service: Entity - "+entity);
			return repo.save(entity);
		}
		log.info("dto is null");
		return false;
	}

}
