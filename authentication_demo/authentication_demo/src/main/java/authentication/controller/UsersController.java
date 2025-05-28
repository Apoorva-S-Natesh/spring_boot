package authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import authentication.entities.UserLoginData;
import authentication.entities.Users;
import authentication.service.UserService;

@Controller
public class UsersController {
	@Autowired
	UserService service;
	
	@GetMapping("/open_signUp")
	public String open_signUp() {
		return "sign_up";
	}
	
	@GetMapping("/open_signIn")
	public String open_sigIn() {
		return "sign_in";
	}
	
	@PostMapping("/signUp")
	public String signUp(@ModelAttribute Users user) {
		String username = user.getUsername();
		
		boolean usernameExist = service.usernameExist(username);
		
		if(usernameExist == false)
			service.signUp(user);
		else
			System.out.println("User already exists!");
		return "index";
	}
	
	@PostMapping("/signIn")
	public String signIn(@ModelAttribute UserLoginData data) {
		
		Users dbUser = service.getUser(data.getUsername());
		if(dbUser != null) {
			if(data.getPassword().equals(dbUser.getPassword()))
				return "success";	
		}
		return "fail";
	}
}
