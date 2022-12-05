package com.jsp.student.course.mapping;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("pratik");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Student student=new Student();
	student.setName("Pratik");
	student.setGmail("pratik@gmail.com");
	student.setCno(988917900);
	
	Course c1=new Course();
	c1.setSubject("Java");
	c1.setTeacher("Neeraj");
	c1.setStudent(student);
	
	Course c2=new Course();
	c2.setSubject("Adv Java");
	c2.setTeacher("Neeraj");
	c2.setStudent(student);
	
	Course c3=new Course();
	c3.setSubject("Java");
	c3.setTeacher("Nuthan");
	c3.setStudent(student);
	
	List<Course> c=new ArrayList();
	c.add(c1);
	c.add(c2);
	c.add(c3);
	
	student.setCourse(c);
	
	entityTransaction.begin();
	entityManager.persist(c1);
	entityManager.persist(c2);
	entityManager.persist(c3);
	entityManager.persist(student);
	entityTransaction.commit();
	System.out.println("All Good");
	
}
}
