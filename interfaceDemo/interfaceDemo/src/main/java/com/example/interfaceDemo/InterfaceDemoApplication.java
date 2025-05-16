package com.example.interfaceDemo;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo.AppConfig;

@SpringBootApplication
public class InterfaceDemoApplication {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Appconfig.class);
		Course c = ctx.getBean(Course.class);
		System.out.println(c);
	}
}
