package com.xworkz.contactdata.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {

	private static EntityManagerFactory factory=null;
	
	public static EntityManagerFactory factory() {
		return factory;
	}
	static {
		factory=Persistence.createEntityManagerFactory("contactData");
	}
}
