package com.xworkz.contactdata.repository;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import com.xworkz.contactdata.entity.ContactDataEntity;
import com.xworkz.contactdata.util.JPAUtil;

import lombok.extern.slf4j.Slf4j;

//@Repository
@Component
@Slf4j
public class ContactDataRepoImpl implements ContactDataRepo {

	private EntityManagerFactory factory = JPAUtil.factory();
	private EntityManager manager = factory.createEntityManager();

	public ContactDataRepoImpl() {
		log.info("Created: " + this.getClass().getSimpleName());
	}

	private List<ContactDataEntity> list = new ArrayList<ContactDataEntity>();

	@Override
	public boolean save(ContactDataEntity entity) {
		log.info("Repo: running save()");
		boolean saved = list.add(entity); 
		for (ContactDataEntity contactDataEntity : list) { 
		  System.out.println("Repo: Entity present in list: " + contactDataEntity); 
		  }
		  return saved;
		  
/*		  
		 	EntityTransaction transaction = manager.getTransaction();
			try {
				transaction.begin();
				manager.persist(entity);
				transaction.commit();
				return true;
			} catch (PersistenceException e) {
				e.printStackTrace();
				transaction.rollback();
			} finally {
				factory.close();
				manager.close();
			}
		return false;
	}
*/
	}
}
