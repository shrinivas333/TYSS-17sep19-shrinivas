package com.tyss.jpawithhibernate;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.manytomany.Courses;
import com.tyss.jpawithhibernate.manytomany.Student;

public class TestManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Courses c=new Courses();
		c.setCid(1);
		c.setCname("Java");
		
		Courses c1=new Courses();
		c1.setCid(2);
		c1.setCname("sql");
		
		Courses c2=new Courses();
		c2.setCid(3);
		c2.setCname("jdbc");
		
		ArrayList<Courses> arrayList=new ArrayList<Courses>();
		arrayList.add(c);
		arrayList.add(c1);
		arrayList.add(c2);
		
		Student student=new Student();
		student.setSid(10);
		student.setSname("ram");
		student.setCourses(arrayList);
//		
//		Student student1=new Student();
//		student1.setSid(20);
//		student1.setSname("ravi");
//		student1.getCourses(arr);
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager=entityManagerFactory.createEntityManager();
			 entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				entityManager.persist(student);
//				entityManager.persist();
				
				System.out.println("Record saved");
				entityTransaction.commit();
				}catch (Exception e) {
					e.printStackTrace();
					entityTransaction.rollback();
					
				}
				entityManager.close();
		
		
	}

}
