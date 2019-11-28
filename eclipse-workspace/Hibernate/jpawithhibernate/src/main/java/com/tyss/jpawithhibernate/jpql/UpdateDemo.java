package com.tyss.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager = entityManagerFactory.createEntityManager();
			entityTransaction=entityManager.getTransaction();
			entityTransaction.begin();
			
			String jpql="update Product set pname='watch' where pid=101";
			
			Query query=entityManager.createQuery(jpql);
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
