package com.tyss.shoppingcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.shoppingcart.DAO.RetailerDAO;
import com.tyss.shoppingcart.DTO.Product;
import com.tyss.shoppingcart.DTO.Retailer;

@Service
public class RetailerServiceImpl implements RetailerService {

	@Autowired
	private RetailerDAO dao;
	
	@Override
	public Retailer login(String email, String password) {
		
		return dao.login(email, password);
	}

	@Override
	public int register(Retailer bean) {
		return dao.register(bean);
	}

	@Override
	public Product searchProduct(int id) {
		return dao.searchProduct(id);
	}

	@Override
	public boolean changePassword(int id, String password) {
		return dao.changePassword(id, password);
	}

}
