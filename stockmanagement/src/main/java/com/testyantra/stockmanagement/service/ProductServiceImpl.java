package com.testyantra.stockmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.testyantra.stockmanagement.dao.ProductDao;
import com.testyantra.stockmanagement.dto.OrderInfo;
import com.testyantra.stockmanagement.dto.ProductInfo;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao dao;
	@Override
	public boolean addproduct(ProductInfo info) {
			dao.addproduct(info);
		return true;
	}

	@Override
	public ProductInfo searchproduct(String name) {
		// TODO Auto-generated method stub
		return dao.searchproduct(name);
	}

	@Override
	public List<ProductInfo> searchProductByCategory(String category) {
		// TODO Auto-generated method stub
		return dao.searchProductByCategory(category);
	}

	@Override
	public boolean updateProduct(ProductInfo info) {
		dao.updateProduct(info);
		return true;
	}

	@Override
	public boolean orderProduct(OrderInfo info) {
		dao.orderProduct(info);
		return true;
	}

}
