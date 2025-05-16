package com.example.interfaceDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SqlMentor implements Mentor {
	@Override
	public void teach() {
		System.out.println("Teaching SQL");
	}
}
