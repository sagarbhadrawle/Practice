//package com.masai.UniManyToOne;
//
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.EntityManagerFactory;
//import jakarta.persistence.EntityTransaction;
//import jakarta.persistence.Persistence;
//
//public class Demo {
//
//	static EntityManagerFactory emf;
//	
//	
//	static {
//		
//		emf = Persistence.createEntityManagerFactory("1toM");
//	}
//	
//	
//	void fun()
//	{
//		Address ad = new Address("INDORE","420020");
//		
//		Student st = new Student("sagar");
//		st.setAddress(ad);
//		
//		EntityManager  em = emf.createEntityManager();
//		EntityTransaction transaction = em.getTransaction();
//		
//		
//		transaction.begin();
//		em.persist(st);
//		transaction.commit();
//	}
//	public static void main(String[] args) {
//			
//		
//		
//		Demo d = new Demo();
//		
//		d.fun();
//		
//		
//	}
//	
//}
