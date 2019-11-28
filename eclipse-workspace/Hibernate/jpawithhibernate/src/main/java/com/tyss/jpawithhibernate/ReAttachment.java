package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Product;

public class ReAttachment {

	public static void main(String[] args) {
		
		EntityManager entityManager=null;
		 EntityTransaction entityTransaction=null;
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		Product product=entityManager.find(Product.class, 101);
		boolean check=entityManager.contains(product);
		System.out.println(check);
		entityManager.detach(product);
		System.out.println(entityManager.contains(product));
		Product product2= entityManager.merge(product);
		
		product2.setPname("pencil");
		System.out.println("record updated");
		entityTransaction.commit();
		
		}catch (Exception e) {
			e.printStackTrace();
			entityTransaction.rollback();
		}
		entityManager.close();
	
		
		
	}//end of main method
	
}//end of the class
