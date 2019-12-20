package com.testyantra.stockmanagement.controller;

import java.util.List;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.testyantra.stockmanagement.dto.OrderInfo;
import com.testyantra.stockmanagement.dto.ProductInfo;
import com.testyantra.stockmanagement.dto.Response;
import com.testyantra.stockmanagement.service.ProductService;

@RestController
@RequestMapping("product")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class productController {

	@Autowired
	private ProductService service;
	
	@PostMapping(path = "/add",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response addproduct(@RequestBody ProductInfo info) {
		
		Response response = new Response();
		if(service.addproduct(info)) {
			response.setMessage("added sucessfully");
			response.setStatusCode(201);
		}else {
			response.setMessage("fail to add");
			response.setStatusCode(401);
		}
		return response;
	}//end of addproduct


	@GetMapping(path = "/get/{name}",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response searchproduct(@PathVariable("name") String name){
		Response response = new Response();
		ProductInfo info =  service.searchproduct(name);
		if(info != null) {
			response.setMessage("data found");
			response.setInfo(info);
		}else {
			response.setMessage("data not found");
		}
		return response;
	}


	@GetMapping(path = "/getcategory/{category}",consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response searchProductByCategory(@PathVariable("category") String category){
		Response response = new Response();
		List<ProductInfo> info = (List<ProductInfo>) service.searchProductByCategory(category);
		if(info != null) {
			response.setMessage("data found");
			response.setInfos(info);
		}else {
			response.setMessage("data not found");
		}
		return response;
	}//end of search
	
	@PutMapping(path = "/modify",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response modifyAssest(@RequestBody ProductInfo info) {

		Response response = new Response();
		if(service.updateProduct(info)) {
			response.setStatusCode(201);
			response.setMessage("Data modified in the database");
		}else {
			response.setStatusCode(401);
			response.setMessage("failed to modify the data");
		}
		
		return response;

	
	}
	@PostMapping(path = "/order",
			consumes = MediaType.APPLICATION_JSON_VALUE,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public Response orderProduct(@RequestBody List<ProductInfo> info, double totalprice, double priceWithgst) {
		
		Response response = new Response();
		OrderInfo info1 = new OrderInfo();
		info1.setInfos(info);
		info1.setTotalPrice(totalPrice);
		info1.setTotalPriceWithgst(totalPriceWithgst);
		
		if(service.orderProduct(info)) {
			response.setMessage("order sucessfully");
			response.setStatusCode(201);
		}else {
			response.setMessage("fail to add");
			response.setStatusCode(401);
		}
		return response;
	}//end of addp
}//end of controller
