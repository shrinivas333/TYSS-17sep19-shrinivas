package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Product;

public class GetReference {

	public static void main(String[] args) {
		

		EntityManager entityManager=null;
		
		

			
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager=entityManagerFactory.createEntityManager();
			/*it will hit to database if we are not using object reference */
//			Product productDetail=entityManager.find(Product.class, 101);
		
		Product productDetail=entityManager.getReference(Product.class, 101);
			System.out.println("Product Id= "+productDetail.getPid() );	
			System.out.println("Product Name= "+productDetail.getPname() );
			System.out.println("Product Quantity= "+productDetail.getQuantity() );
		
			entityManager.close();
			
	
		}//end of main method
	}//end of class

