package com.testyantra.stockmanagement.service;

import java.util.List;

import com.testyantra.stockmanagement.dto.OrderInfo;
import com.testyantra.stockmanagement.dto.ProductInfo;

public interface ProductService {

	public boolean addproduct(ProductInfo info);
	public ProductInfo searchproduct(String name);
	public List<ProductInfo> searchProductByCategory(String category);
	public boolean updateProduct(ProductInfo info);
	public boolean orderProduct(OrderInfo info);
}
