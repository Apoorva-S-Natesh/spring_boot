package com.salesSavvy.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

// One product in user's cart
@Entity
public class CartItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Users user;
	
	@ManyToOne
	private Product product;

	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartItem(Long id, Users user, Product product) {
		super();
		this.id = id;
		this.user = user;
		this.product = product;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "CartItem [id=" + id + ", user=" + user + ", product=" + product + "]";
	}	
}
