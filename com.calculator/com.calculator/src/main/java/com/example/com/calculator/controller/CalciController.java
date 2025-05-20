package com.example.com.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.com.calculator.services.calciServices;

@Controller
public class CalciController {
	@Autowired
	calciServices cs; 
	
	@GetMapping("/calc")
	public String calc(
			@RequestParam int num1, 
			@RequestParam int num2, 
			@RequestParam String operation,
			Model m)
	{
		//System.out.println(num1 + " " + operation + " " + num2);
		//System.out.println("request received");
		int res = 0;
		switch (operation) {
			case "add":
				res = cs.add(num1, num2);
				break;
			case "sub":
				res = cs.sub(num1, num2);
				break;
			case "mul":
				res = cs.mul(num1, num2);
				break;
			case "div":
				res = cs.div(num1, num2);
				break;
		}
		m.addAttribute("num1",num1);
		m.addAttribute("num2", num2);
		m.addAttribute("operation", operation);
		m.addAttribute("result", res);
		return "result";
	}
}
