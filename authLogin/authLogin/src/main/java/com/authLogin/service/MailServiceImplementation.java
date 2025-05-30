package com.authLogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authLogin.repository.MailRepo;

@Service
public class MailServiceImplementation implements MailService{
	@Autowired
	MailRepo repo;
}
