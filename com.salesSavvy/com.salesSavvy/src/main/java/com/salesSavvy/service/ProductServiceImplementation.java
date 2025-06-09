package com.salesSavvy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesSavvy.entity.Product;
import com.salesSavvy.repository.ProductRepository;

@Service
public class ProductServiceImplementation implements ProductService{
	@Autowired
	ProductRepository repo;

	@Override
	public String addProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product searchProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product searchProduct(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProduct(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
