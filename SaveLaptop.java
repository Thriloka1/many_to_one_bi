package org.jsp.one_to_many.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.many_to_one.entityclasses.Laptop;

public class SaveLaptop {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et = em.getTransaction();
	
		Laptop l=new Laptop();
		l.setName("hp");
	
		et.begin();
		em.persist(l);
		et.commit();
		em.close();
		System.out.println("done!...");
	}
}
