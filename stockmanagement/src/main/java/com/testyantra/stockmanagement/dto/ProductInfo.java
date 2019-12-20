package com.testyantra.stockmanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

@Entity
@Table(name = "product_info")
public class ProductInfo {

	@Id
	@GeneratedValue
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String category;
	@Column
	private String company;
	@Column
	private int quantity;
	@Column
	private int price;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Order_Histroy_Info" ,
	joinColumns = @JoinColumn(name="order_id"),
	inverseJoinColumns = @JoinColumn(name="product_id"))
	private List<OrderInfo> infos;
	
	
	public List<OrderInfo> getInfos() {
		return infos;
	}
	public void setInfos(List<OrderInfo> infos) {
		this.infos = infos;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
