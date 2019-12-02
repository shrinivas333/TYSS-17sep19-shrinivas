package com.tyss.shoppingcart.service;

import com.tyss.shoppingcart.DTO.Product;
import com.tyss.shoppingcart.DTO.Retailer;

public interface RetailerService {

	public Retailer login(String email,String password);
	public int register(Retailer bean);
	public Product searchProduct(int id);
	public boolean changePassword(int id, String password);
}
