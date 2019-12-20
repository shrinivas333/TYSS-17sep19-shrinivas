package com.testyantra.stockmanagement.dao;

import java.util.List;

import com.testyantra.stockmanagement.dto.OrderInfo;
import com.testyantra.stockmanagement.dto.ProductInfo;

public interface ProductDao {

	public boolean addproduct(ProductInfo info);
	public ProductInfo searchproduct(String name);
	public List<ProductInfo> searchProductByCategory(String category);
	public boolean updateProduct(ProductInfo info);
	public boolean orderProduct(OrderInfo info);
}
