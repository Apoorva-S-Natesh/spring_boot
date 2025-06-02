package com.authLogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.authLogin.entity.Mail;
import com.authLogin.service.MailService;

@Controller
public class MailController {
	@Autowired
	MailService service;
	
	@PostMapping("/send")
	public String send(@ModelAttribute Mail mail) {
		System.out.println("Sending mail to: " + mail.getReceiver());
		service.sendMail(mail);
		return "index";
	}
}
