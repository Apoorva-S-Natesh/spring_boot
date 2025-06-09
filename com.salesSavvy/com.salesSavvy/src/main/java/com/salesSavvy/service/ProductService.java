package com.salesSavvy.service;

import com.salesSavvy.entity.Product;

public interface ProductService {
	String addProduct(Product product);
	Product searchProduct(int id);
	Product searchProduct(String name);
	String updateProduct(Product product);
	String deleteProduct(int id);
	String deleteProduct(String name);
}
