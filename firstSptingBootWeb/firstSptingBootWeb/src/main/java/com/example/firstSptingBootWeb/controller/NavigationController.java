package com.example.firstSptingBootWeb.controller; // this is a package in the main package with .controller extension.

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // To specify that this is controller
public class NavigationController {
	
	//Mapping (when java or python is looked for)
	@GetMapping("/java")
	public String openJava() {
		return "java"; //name of the html page we want to return
	}
	//At the lowest level, this is an API.(methods)
	
	@GetMapping("/python")
	public String openPython() {
		return "python"; // If instead of @Controller, @RestController was used the n "python" is treated as a simple string 
	}
}
