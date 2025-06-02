package com.authLogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.authLogin.entity.Mail;
import com.authLogin.repository.MailRepo;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailServiceImplementation implements MailService{
	@Autowired
	MailRepo repo;
	
	@Autowired
	JavaMailSender sender; //Predefined class in order to get the object of this class use Autowired
	public void sendMail(Mail mail) {
		MimeMessage msg = sender.createMimeMessage();
		MimeMessageHelper mmh = new MimeMessageHelper(msg, "utf-8");
		try {
			mmh.setTo(mail.getReceiver());
			mmh.setSubject(mail.getSubject());
			mmh.setText(mail.getBody());
			
			sender.send(msg);
			repo.save(mail);
		}
		catch (MessagingException e) {
			e.printStackTrace();
		}
	}
}
