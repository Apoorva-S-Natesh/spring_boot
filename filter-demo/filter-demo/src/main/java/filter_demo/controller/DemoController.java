package filter_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/hello")
	public String hello() {
		System.out.println("Inside the controller");
		return "HELLO";
	}
	
	@GetMapping("/hi")
	public String hi() {
		System.out.println("Inside the controller");
		return "HI";
	}
}
