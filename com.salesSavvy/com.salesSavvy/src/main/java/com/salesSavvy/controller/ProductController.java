package com.salesSavvy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.salesSavvy.entity.CartData;
import com.salesSavvy.entity.CartItem;
import com.salesSavvy.entity.Product;
import com.salesSavvy.entity.Users;
import com.salesSavvy.repository.CartRepository;
import com.salesSavvy.service.ProductService;
import com.salesSavvy.service.UsersService;

@CrossOrigin("*")
@RestController
public class ProductController {
	@Autowired
	ProductService service;
	
	@Autowired
	UsersService uService;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product product) {
		return service.addProduct(product);
	}
	
	@GetMapping("/searchProduct")
	public Product searchProduct(@RequestBody long id) {
		return service.searchProduct(id);
	}
		
	@GetMapping("/updateProduct")
	public String updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	@GetMapping("/deleteProduct")
	public String deleteProduct(@RequestBody long id) {
		return service.deleteProduct(id);
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		return service.getAllProducts();
	}
	
	@PostMapping("/addToCart")
	public ResponseEntity<String> addToCart(@RequestBody CartData data) {
		
		CartRepository cartRepo;
		
		String username = data.getUsername();
		int quantity = data.getQuantity();
		Long productId = data.getProductId();
		
		Users user = uService.getUser(username);
		if (user == null) {
	        return ResponseEntity.badRequest().body("User not found");
	    }
		
		Product prod = service.searchProduct(data.getProductId());
		 if (prod == null) {
		        return ResponseEntity.badRequest().body("Product not found");
		}
		 		
	    return ResponseEntity.ok("Product added to cart");
	}
}
