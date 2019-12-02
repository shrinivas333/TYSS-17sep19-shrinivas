package com.tyss.shoppingcart.DAO;


import com.tyss.shoppingcart.DTO.Order;
import com.tyss.shoppingcart.DTO.Product;
import com.tyss.shoppingcart.DTO.Retailer;

public interface RetailerDAO {

	public Retailer login(String email,String password);
	public int register(Retailer bean);
	public Product searchProduct(int id);
	public boolean changePassword(int id, String password);
	public Order placeOrder(Order beaOrder);
	
}
