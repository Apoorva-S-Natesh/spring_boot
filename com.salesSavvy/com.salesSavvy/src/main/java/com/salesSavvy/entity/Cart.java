package com.salesSavvy.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@OneToOne
	Users user;

	@OneToMany
	List<Product> productsList;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(Long id, Users user, List<Product> productsList) {
		super();
		this.id = id;
		this.user = user;
		this.productsList = productsList;
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

	public List<Product> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<Product> productsList) {
		this.productsList = productsList;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", user=" + user + ", productsList=" + productsList + "]";
	}
}