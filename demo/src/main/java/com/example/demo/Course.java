package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Course {
	@Value("${name}")
	String name;
	@Value("${duration}")
	int duration;
	
	@Autowired //0-param constructor is called for object creation. Value is not set 
	Mentor m;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("0 Parameterized constructor");
	}
	
	// during object creation Only I want to set the value and injection to be done then we can use constructor injection
/*	
	 @Autowired
	 	public Course(Mentor m) {
		super();
		this.m = m;
		
		System.out.println("Parameterized constructor");
	}
*/	
	
	public Course(String name, int duration, Mentor m) {
		super();
		this.name = name;
		this.duration = duration;
		this.m = m;
		
		System.out.println("Parameterized constructor");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Mentor getM() {
		return m;
	}

	//@Autowired // If we want the setter method to be called for doing autowiring then annotation is given here otherwise 0 param constructor is used
	/* ALlows dependencies to be modified r set after object creation, making it ideal for optional dependencies. COnstructor injection ensures all mandatory dependencies are provided at object creation*/
	public void setM(Mentor m) {
		this.m = m;
		System.out.println("setter");
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", duration=" + duration + ", m=" + m + "]";
	}
}
