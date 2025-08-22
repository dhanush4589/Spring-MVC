package com.mvc.sdb.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mvc.sdb.entity.Student;

@Repository
public class StudentRepository {
	@Autowired
	private EntityManagerFactory factory;
	
	public void saveStudent(Student student) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
			et.begin();
			em.persist(student);
			et.commit();
		}
		catch(Exception e) {
			if(et.isActive()) et.rollback();
			e.printStackTrace();
		}
		finally {
			em.close();
		}
	}
}
