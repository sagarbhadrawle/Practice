package com.masai.UnitOneToMany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Demo1 {

static EntityManagerFactory emf;
	
	
	static {
		
		emf = Persistence.createEntityManagerFactory("1toM");
	}
	
	
	void fun()
	{
		Phone p1 = new Phone("samsung",1212121);
		Phone p2 = new Phone("iphone",1212121);
		Phone p3 = new Phone("nokia",1212121);
		
		List<Phone> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		
		
		User1 us = new User1("sagar@gka9","sagar");
		us.setPhoneTables(list);;
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tc = em.getTransaction();
		tc.begin();
		em.persist(us);
		tc.commit();
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		Demo1 d1 = new Demo1();
		
//		d1.fun();
		
	}
	
	
}
