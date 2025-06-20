package com.salesSavvy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import com.salesSavvy.repository.OrderRepository;
import com.salesSavvy.service.CartService;
import com.salesSavvy.service.PaymentService;
import com.salesSavvy.service.UsersService;

@RestController
@CrossOrigin("*")
public class PaymentController {
    @Autowired PaymentService  payService;
    @Autowired UsersService    usersService;
    @Autowired CartService     cartService;
    @Autowired OrderRepository orderRepo;
}
