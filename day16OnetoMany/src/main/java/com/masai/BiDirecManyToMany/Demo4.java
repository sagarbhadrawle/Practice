package com.masai.BiDirecManyToMany;

import java.util.HashSet;
import java.util.Set;

import com.masai.UniManyToOne.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class Demo4 {
		
static EntityManagerFactory emf;
	
	
	static {
		
		emf = Persistence.createEntityManagerFactory("1toM");
	}
	
	
	void fun()
	{
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tc = em.getTransaction();
		
		tc.begin();
		
		Course c1 = new Course();
        c1.setCname("JAVA");

        Course c2 = new Course();
        c2.setCname("SERVLET");

        Course c3 = new Course();
        c3.setCname("JSP");

        Student1 s1 = new Student1();
        s1.setSname("Manu Manjunatha");

        Student1 s2 = new Student1();
        s2.setSname("Advith Tyagraj");


        Set<Course> sc = new HashSet<>();
        sc.add(c1);
        sc.add(c2);
        sc.add(c3);

        Set<Student1> ss = new HashSet<>();
        ss.add(s1);
        ss.add(s2);

        // ASSOCIATING STUDENT WITH COURSE

        c1.setStudents(ss);
        c2.setStudents(ss);
        c3.setStudents(ss);

        // ASSOCIATING COURSE WITH STUDENT
        s1.setCourses(sc);
        s2.setCourses(sc);	

        em.persist(s1);
        em.persist(s2);

        em.getTransaction().commit();



        em.getTransaction().begin();

		
		
	}
	
	
public static void main(String[] args) {
		
		Demo4 d = new Demo4();
		d.fun();
		
	}
	
	
	
}
