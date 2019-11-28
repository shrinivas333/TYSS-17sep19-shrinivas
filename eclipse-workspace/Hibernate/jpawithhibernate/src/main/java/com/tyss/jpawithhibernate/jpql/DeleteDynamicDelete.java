package com.tyss.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class DeleteDynamicDelete {
public static void main(String[] args) {
	


	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		String jpql="delete from Product where pid=:id";
		Query query=entityManager.createQuery(jpql);
	
		query.setParameter("id", 102);
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
