package com.salesSavvy.entity;

public class CartData {
	Long productId;
	String username;
	int quantity;
	
	public CartData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CartData(Long productId, String username, int quantity) {
		super();
		this.productId = productId;
		this.username = username;
		this.quantity = quantity;
	}
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "CartData [productId=" + productId + ", username=" + username + ", quantity=" + quantity + "]";
	}
}
