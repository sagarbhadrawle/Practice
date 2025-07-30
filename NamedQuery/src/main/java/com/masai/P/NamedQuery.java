package com.masai.P;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class NamedQuery {
	
	static {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("named");
	
	}
	
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("named");
			EntityManager entityManager = entityManagerFactory.createEntityManager();

			Query query = entityManager.createNamedQuery("find by employee by id");
			query.setParameter("id", 1203)
			em.createNativequery("select * from customer",Customer.class)
			
			
		
		
	}
}
