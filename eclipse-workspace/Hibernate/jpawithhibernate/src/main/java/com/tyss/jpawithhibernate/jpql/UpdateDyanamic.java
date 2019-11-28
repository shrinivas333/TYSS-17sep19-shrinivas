package com.tyss.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDyanamic {

	public static void main(String[] args) {
		

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			String jpql="update Product set pname=:name where pid=:id";
			
			Query query=entityManager.createQuery(jpql);
			query.setParameter("name", "Bike");	
			query.setParameter("id", 102);
			int i=query.executeUpdate();
			
			entityTransaction.commit();
			System.out.println(i+" Row Updated");
		} catch (Exception e) {
			
			entityTransaction.rollback();
			e.printStackTrace();
		}finally {
			entityManager.close();
		}
		
	}
}
