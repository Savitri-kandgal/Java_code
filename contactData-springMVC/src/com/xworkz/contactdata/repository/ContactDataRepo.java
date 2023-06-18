package com.xworkz.contactdata.repository;

import java.util.List;

import com.xworkz.contactdata.entity.ContactDataEntity;

public interface ContactDataRepo {

	boolean save(ContactDataEntity entity);
	
	List<ContactDataEntity> findAll();
}
