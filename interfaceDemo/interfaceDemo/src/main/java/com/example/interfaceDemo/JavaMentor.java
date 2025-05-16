package com.example.interfaceDemo;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary // Which ever Bean we want to prioritize when there are multiple
public class JavaMentor implements Mentor {
	@Override
	public void teach() {
		System.out.println("Teaching Java...");
	}
}
