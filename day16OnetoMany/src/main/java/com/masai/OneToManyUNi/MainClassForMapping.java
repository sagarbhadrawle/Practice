package com.masai.OneToManyUNi;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceException;

/**
 * Hello world!
 *
 */
public class MainClassForMapping 
{
	static EntityManagerFactory emf;
	
	static {
		emf=Persistence.createEntityManagerFactory("1toM");
	}
	
	
	static void addCollageWithStudent()
	{
		
	    Collage c1 = new Collage("mbks", "rajmohalla",new HashSet<Student>());
	    Collage c2 = new Collage("vaishnav", "gumasta",new HashSet<Student>());
	    Student s1 = new Student("sagar", "34343434", "s@gmail", c1);
	    Student s2 = new Student("lakhan", "65656", "a@gmail", c1);
	    Student s3 = new Student("abhi", "2343434", "b@gmail", c1);
	    Student s4 = new Student("jomesh", "34434", "r@gmail", c1);

	    c1.getStudent().add(s1);
	    c1.getStudent().add(s2);
	    c1.getStudent().add(s3);
	    c1.getStudent().add(s4);
	    
	    s1.setCollage(c1);
	    s2.setCollage(c1);
	    s3.setCollage(c1);
	    s4.setCollage(c1);
	    

	    Student s5 = new Student("nesi", "34343434", "s@gmail", c2);
	    Student s6 = new Student("joy", "65656", "a@gmail", c2);
	    Student s7 = new Student("rock", "2343434", "b@gmail", c2);
	    Student s8 = new Student("roman", "34434", "r@gmail", c2);

	    c2.getStudent().add(s5);
	    c2.getStudent().add(s6);
	    c2.getStudent().add(s7);
	    c2.getStudent().add(s8);
	    
	    s5.setCollage(c2);
	    s6.setCollage(c2);
	    s7.setCollage(c2);
	    s8.setCollage(c2);
	    

	    EntityManager em = null;
	    EntityTransaction et = null;

	    try {
	        em = emf.createEntityManager();
	        et = em.getTransaction();
	        et.begin();
	        em.persist(c1);
	        em.persist(c2);
	        et.commit();
	    } catch (Exception e) {
	        System.out.println(e.getMessage());
	        if (et != null && et.isActive()) {
	            et.rollback();
	        }
	    } finally {
	        if (em != null) {
	            em.close();
	        }
	    }
	}
		
	
	
	
    public static void main( String[] args )
    {
     
    	 Stack<Integer> s1 = new Stack<>();
    	
    	addCollageWithStudent();
    	
    }
}



