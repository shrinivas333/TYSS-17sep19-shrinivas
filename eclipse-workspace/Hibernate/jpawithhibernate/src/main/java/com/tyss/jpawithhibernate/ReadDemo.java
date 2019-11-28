package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.dto.Product;

public class ReadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Product productDetail=entityManager.find(Product.class,101);
		System.out.println("Product Id= "+productDetail.getPid() );	
		System.out.println("Product Name= "+productDetail.getPname() );
		System.out.println("Product Quantity= "+productDetail.getQuantity() );
	
		entityManager.close();
	}//end of main method

}//end of class
