package com.masai.BiOneTOManyANDManytoOne;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Demo2 {
	
	
	static EntityManagerFactory emf;
	
	
	static {
		
		emf = Persistence.createEntityManagerFactory("1toM");
	}
	
	
	void fun()
	{
		Department dp = new Department("marketing");
		
		
		Employee em = new Employee("sagar");

		Employee em1 = new Employee("abhi");
		Employee em2 = new Employee("vaib");
		
		em1.setDeparment(dp);
		em2.setDeparment(dp);
		
		Set<Employee> set = new HashSet<>();
		set.add(em);
	set.add(em1);
		set.add(em2);
		
		dp.setEmployee(set);
		
		EntityManager e  = emf.createEntityManager();
		EntityTransaction tc = e.getTransaction();
		tc.begin();
		e.persist(dp);
		tc.commit();
		
		e.getTransaction().begin();
		Department department = e.find(Department.class,1);
		
		Set<Employee> employee = department.getEmployee();
		
		 for (Employee emp : employee) {

             System.out.println("employee id is " + emp.getEmpi());

             System.out.println("employee name is " + emp.getName());

             

     }

	}
	
	
	public static void main(String[] args) {
		
			Demo2 d = new Demo2();
//			d.fun();
		
		
	}
	
}


