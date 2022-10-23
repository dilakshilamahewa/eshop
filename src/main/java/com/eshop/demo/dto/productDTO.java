package com.eshop.demo.dto;

public class productDTO {
	
	int productId;
	String productName;
	String brand;
	String category;
	int status;
	int cost;
	int listPrice;
	int discount;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public int getListPrice() {
		return listPrice;
	}
	public void setListPrice(int listPrice) {
		this.listPrice = listPrice;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public productDTO(int productId, String productName, String brand, String category, int status, int cost,
			int listPrice, int discount) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.category = category;
		this.status = status;
		this.cost = cost;
		this.listPrice = listPrice;
		this.discount = discount;
	}
	
	
	

}
