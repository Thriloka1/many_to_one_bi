package org.jsp.one_to_many.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.many_to_one.entityclasses.Student;

public class SaveStudent {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et = em.getTransaction();
	
		Student s=new Student();
		s.setName("raju");
	
		et.begin();
		em.persist(s);
		et.commit();
		em.close();
		System.out.println("done!...");
	}
}
