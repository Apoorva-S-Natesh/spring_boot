package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mentor {
	@Value("${mentorName}")
	String name;
	@Value("${mentorExperience}")
	int enperience;
	public Mentor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Mentor(String name, int enperience) {
		super();
		this.name = name;
		this.enperience = enperience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnperience() {
		return enperience;
	}
	public void setEnperience(int enperience) {
		this.enperience = enperience;
	}
	@Override
	public String toString() {
		return "Mentor [name=" + name + ", enperience=" + enperience + "]";
	}
}
