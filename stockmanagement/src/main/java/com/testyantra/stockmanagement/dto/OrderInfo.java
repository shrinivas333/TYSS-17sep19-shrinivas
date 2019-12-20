package com.testyantra.stockmanagement.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "oderinfo")
public class OrderInfo {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private double totalPrice;
	@Column
	private double totalPriceWithgst;
	@ManyToMany( cascade = CascadeType.ALL,mappedBy = "infos")
	List<ProductInfo> infos;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public double getTotalPriceWithgst() {
		return totalPriceWithgst;
	}
	public void setTotalPriceWithgst(double totalPriceWithgst) {
		this.totalPriceWithgst = totalPriceWithgst;
	}
	public List<ProductInfo> getInfos() {
		return infos;
	}
	public void setInfos(List<ProductInfo> infos) {
		this.infos = infos;
	}
}
