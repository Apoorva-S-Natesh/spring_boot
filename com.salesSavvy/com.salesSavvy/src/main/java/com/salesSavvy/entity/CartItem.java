package com.salesSavvy.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

// One product in user's cart
@Entity
public class CartItem {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@ManyToOne
	    @JoinColumn(name = "cart_id")
	    @JsonBackReference           // stops CartItem → Cart → CartItem loop
	    private Cart cart;
	
	    @ManyToOne
	    @JsonIgnoreProperties("cart") // in case old Product rows still have cart_id
	    private Product product;

	    private int quantity;

	    /* ignoring fields during Java object serialization, but it also prevents these fields from being persisted when using a JPA framework 
	     * used to indicate that a particular field should not be persistently stored in the database */
	    @Transient
	    private String username;

	    @Transient
	    private Long productId;

	public CartItem() {}
	
	

	public CartItem(Long id, Cart cart, Product product, int quantity, String username, Long productId) {
		super();
		this.id = id;
		this.cart = cart;
		this.product = product;
		this.quantity = quantity;
		this.username = username;
		this.productId = productId;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}
}
