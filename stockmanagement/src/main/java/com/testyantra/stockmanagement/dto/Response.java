package com.testyantra.stockmanagement.dto;

import java.util.List;

public class Response {

	private String message;
	private int statusCode;
	private List<ProductInfo> infos;
	private ProductInfo info;
	public ProductInfo getInfo() {
		return info;
	}
	public void setInfo(ProductInfo info) {
		this.info = info;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public List<ProductInfo> getInfos() {
		return infos;
	}
	public void setInfos(List<ProductInfo> infos) {
		this.infos = infos;
	}
}
