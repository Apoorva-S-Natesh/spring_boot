package com.example.com.calculator.services;

import org.springframework.stereotype.Service;

@Service
public class CalciServiceImplementation implements calciServices{

	@Override
	public int add(int num1, int num2) {
		return num1+num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1 > num2 ? num1 - num2 : num2 - num1;
;
	}

	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		try {
			return num1 > num2 ? num1 / num2 : num2 / num1;
		}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
}
