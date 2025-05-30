package com.authLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.authLogin.entity.Mail;

public interface MailRepo extends JpaRepository<Mail, Integer>{

}
