package com.xworkz.contactdata.repository;

import com.xworkz.contactdata.entity.ContactDataEntity;

public interface ContactDataRepo {

	boolean save(ContactDataEntity entity);
}
