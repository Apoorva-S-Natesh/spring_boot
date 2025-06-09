package com.salesSavvy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.salesSavvy.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	ProductService service;
}
