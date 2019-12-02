package com.tyss.shoppingcart.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.tyss.shoppingcart.DTO.Product;
import com.tyss.shoppingcart.DTO.Retailer;

@Repository
public class RetailerDAOImpl implements RetailerDAO {

	@PersistenceUnit // spring ORM annotation, works just like autowired
	private EntityManagerFactory factory;
	@Override
	public Retailer login(String email, String password) {

		String jpql = "from Retailer where email =:email and password =:pass";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<Retailer> query = manager.createQuery(jpql,Retailer.class);
		query.setParameter("email",email);
		query.setParameter("pass", password);
		try {
			Retailer bean = query.getSingleResult();
			return bean;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

	}

	@Override
	public int register(Retailer bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return bean.getId();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}

	@Override
	public Product searchProduct(int id) {
		EntityManager manager = factory.createEntityManager();
		return manager.find(Product.class, id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		Retailer bean = manager.find(Retailer.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

	@Override
	public int placeOrder(int quantity) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(quantity);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
	}


	}

}
