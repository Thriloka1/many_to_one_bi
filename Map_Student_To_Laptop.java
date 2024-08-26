package org.jsp.one_to_many.controllers;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.jsp.many_to_one.entityclasses.Laptop;
import org.jsp.many_to_one.entityclasses.Student;

public class Map_Student_To_Laptop {
	public static void main(String[] args) {
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student s1 = em.find(Student.class, 1);
		
		Laptop l1 = em.find(Laptop.class, 1);
		Laptop l2 = em.find(Laptop.class, 2);
		
		l1.setS(s1);
		l2.setS(s1);
		et.begin();
		em.merge(l1);
		em.merge(l2);
		et.commit();
		em.close();
		System.out.println("done!");
		
		
		
		
		
	}
}
