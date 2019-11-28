package com.tyss.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.jpawithhibernate.onetoone.Person;
import com.tyss.jpawithhibernate.onetoone.VoterCard;

public class TestOneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VoterCard vc=new VoterCard();
		vc.setVid(10);
		vc.setNumber(1234567);
		
		Person p=new Person();
		p.setPid(1);
		p.setPname("Ram");
		p.setCard(vc);
		
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		
		try {
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("test");
			entityManager=entityManagerFactory.createEntityManager();
			 entityTransaction=entityManager.getTransaction();
				entityTransaction.begin();
//				entityManager.persist(p);
				VoterCard voterCard=entityManager.find(VoterCard.class, 10);
				System.out.println("person name ="+voterCard.getPerson().getPname());
				System.out.println("person id="+voterCard.getPerson().getPid());
				System.out.println("voter id="+voterCard.getVid());
				System.out.println("voter number="+voterCard.getNumber());
//				System.out.println("Record saved");
				entityTransaction.commit();
				}catch (Exception e) {
					e.printStackTrace();
					entityTransaction.rollback();
					
				}
				entityManager.close();
			
			
		} 		
		
		
	}


