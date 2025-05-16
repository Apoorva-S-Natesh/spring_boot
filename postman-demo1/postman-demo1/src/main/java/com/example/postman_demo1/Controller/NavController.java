package com.example.postman_demo1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NavController {

	// Simple request
	@GetMapping("/greet")
	public String Greet() {
			System.out.println("Request Received");
			return("Welcome to Potman Demo");
	}
	
	// Request with data sent along with it
	@GetMapping("/acceptData")
	public String acceptData(@RequestParam String data) {
		System.out.println("Request received with data : " + data);
		return "Data received : " + data;
	}
	/* Open Postman and give key the name of data variable and data in the value and check*/
}
