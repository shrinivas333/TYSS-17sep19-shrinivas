package com.testyantra.stockmanagement.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.testyantra.stockmanagement.dto.OrderInfo;
import com.testyantra.stockmanagement.dto.ProductInfo;

@Repository
public class ProductDaoImpl implements ProductDao {

	@PersistenceUnit
	private EntityManagerFactory factory;
	
	@Override
	public boolean addproduct(ProductInfo info) {
		
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		try {
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	
	}//end of add products

	@Override
	public ProductInfo searchproduct(String name) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from ProductInfo where name=:name";
			TypedQuery<ProductInfo> typedQuery = manager.createQuery(jpql,ProductInfo.class);
			typedQuery.setParameter("name", name);
			ProductInfo product = typedQuery.getSingleResult();
			if(product != null){
				return product; 
			}else {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
		
		
	}

	@Override
	public List<ProductInfo> searchProductByCategory(String category) {
		EntityManager manager = factory.createEntityManager();
		try {
			String jpql = "from ProductInfo where category=:category";
			TypedQuery<ProductInfo> typedQuery = manager.createQuery(jpql,ProductInfo.class);
			typedQuery.setParameter("category", category);
			List<ProductInfo> product = typedQuery.getResultList();
			if(product != null){
				return product; 
			}else {
				return null;
			}
		} catch (Exception e) {
			return null;
		}
		

	}

	@Override
	public boolean updateProduct(ProductInfo info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		try {
			if(info != null) {
				transaction.begin();
				ProductInfo info2 = manager.find(ProductInfo.class, info.getId());
				info2.setCategory(info.getCategory());
				info2.setCompany(info.getCompany());
				info2.setName(info.getName());
				info2.setPrice(info.getPrice());
				info2.setQuantity(info.getQuantity());
				transaction.commit();
				return true;
			}else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
		
	}

	@Override
	public boolean orderProduct(OrderInfo info) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		ArrayList<ProductInfo> list =new ArrayList<ProductInfo>();
		try {
			transaction.begin();
			manager.persist(info);
			transaction.commit();
			return true;
		}catch(Exception e) {
			return false;
		}
		
	}

}
