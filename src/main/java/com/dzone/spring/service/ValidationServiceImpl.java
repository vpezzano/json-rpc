package com.dzone.spring.service;

import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService {

	@Override
	public String validate(String message) {
		System.out.println("Validating message: " + message);
		return "OK";
	}
}
