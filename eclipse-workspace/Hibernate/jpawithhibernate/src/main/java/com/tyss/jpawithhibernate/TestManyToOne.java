package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.manytoone.Pencil;
import com.tyss.jpawithhibernate.manytoone.PencilBox;
import com.tyss.jpawithhibernate.onetoone.VoterCard;

public class TestManyToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PencilBox box=new PencilBox();
		box.setBid(1);
		box.setBname("apsara");
		
		Pencil p= new Pencil();
		p.setColor("blue");
		p.setPid(101);
		p.setPencilBox(box);
		
		Pencil p2=new Pencil();
		p2.setColor("black");
		p2.setPid(102);
		p2.setPencilBox(box);
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager=entityManagerFactory.createEntityManager();
			 entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
				entityManager.persist(p);
				entityManager.persist(p2);
				
				System.out.println("Record saved");
				entityTransaction.commit();
				}catch (Exception e) {
					e.printStackTrace();
					entityTransaction.rollback();
					
				}
				entityManager.close();
			
	}

}
