package com.masai.BiDireciOneToOne;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Demo3 {


	static EntityManagerFactory emf;
	
	
	static {
		
		emf = Persistence.createEntityManagerFactory("1toM");
	}
		
	void fun()
	{
		EntityManager em  = emf.createEntityManager();
		EntityTransaction tc = em.getTransaction();
		tc.begin();
		 Citizen c = new Citizen();
         c.setCname("Manu Manjunatha");

         Passport passport = new Passport();
         passport.setPnumber("123456");

         // ASSOCIATE CITIZEN WITH PASSPORT
         passport.setCitizen(c);

         // ASSOCIATE PASSPORT WITH CITIZEN
         c.setPassport(passport);

         em.persist(passport);

         em.getTransaction().commit();
	}
	
	
	public static void main(String[] args) {
		
		Demo3 d = new Demo3();
		d.fun();
		
	}
	
	
}
