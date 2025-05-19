package com.example.ClientServerDynamicData.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; // Important
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {
	
	@GetMapping("/greet") // No data transfer so get request
	public String greet(Model m) {
		m.addAttribute("greeting", "Good Morning!"); //Dynamic data
		m.addAttribute("name", "Apoorva");
		return "greet";
	}
}
