package com.salesSavvy.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
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
	private Long id;
	
	@OneToOne
	private Users user;

	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CartItem> cartItems = new ArrayList<>();

	public Cart() {}

	public Long getId() {return id;}
	public void setId(Long id) {this.id = id;}

	public Users getUser() {return user;}
	public void setUser(Users user) {this.user = user;}

	public List<CartItem> getCartItems() {return cartItems;}
	public void setCartItems(List<CartItem> cartItems) 
	{this.cartItems = cartItems;}

	}