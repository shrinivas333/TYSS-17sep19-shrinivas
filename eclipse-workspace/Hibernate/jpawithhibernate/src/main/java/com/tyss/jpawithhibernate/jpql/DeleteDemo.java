package com.tyss.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDemo {

	public static void main(String[] args) {
		

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			String jpql="delete from Product where pid=101";
			
			Query query=entityManager.createQuery(jpql);
			int i=query.executeUpdate();
			
			entityTransaction.commit();
			System.out.println(i+" Row deleted");
		} catch (Exception e) {
			
			entityTransaction.rollback();
			e.printStackTrace();
		}finally {
			entityManager.close();
		}
		
	}
}
