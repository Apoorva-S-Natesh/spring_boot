package filter_demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/hello")
	public String hello() {
		System.out.println("controller Executing");
		return "HELLO";
	}
	
	@GetMapping("/hi")
	public String hi() {
		System.out.println("Controller Executing");
		return "HI";
	}
}
