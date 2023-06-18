package com.xworkz.contactdata.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xworkz.contactdata.entity.ContactDataEntity;
import lombok.extern.slf4j.Slf4j;

//@Repository
@Component
@Slf4j
public class ContactDataRepoImpl implements ContactDataRepo {

	@Autowired
	private EntityManagerFactory factory; //migrated jpa with spring hence spring gave the factory bean
	
//	private EntityManagerFactory factory = JPAUtil.getFactory(); //getting factory from JPAUtil class
	
	public ContactDataRepoImpl() {
		log.info("Created: " + this.getClass().getSimpleName());
	}
//	private List<ContactDataEntity> list = new ArrayList<ContactDataEntity>();

	@Override
	public boolean save(ContactDataEntity entity) {
		log.info("Repo: running save()");

		EntityManager entityManager = factory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		try {
			transaction.begin();
			entityManager.persist(entity);  //Persisting/saving a data into relational database.
			transaction.commit();  //closing the transaction
			return true;
		} catch (PersistenceException e) {
			e.printStackTrace();
			transaction.rollback();
		} finally {
		//	factory.close();
		entityManager.close();
		}
		return false;
}
	
	public List<ContactDataEntity> findAll() {
		
		log.info("running findAll()");
		EntityManager entityManager = factory.createEntityManager();
		try {
			Query query = entityManager.createNamedQuery("findAll");
			List list = query.getResultList();
			return list;
		} catch (PersistenceException e) {
			e.printStackTrace();
		} finally {
		entityManager.close();
		}
		return null;
	}
	

		
}

	