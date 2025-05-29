package demo.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from Spring boot";
	}
	
	@GetMapping("/hi")
	public String sayHi() {
		return "Hi from Spring boot";
	}
	
	@GetMapping("/bye")
	public String sayBye() {
		return "Bye from Spring boot";
	}
} // User name user, password is generated on the console
