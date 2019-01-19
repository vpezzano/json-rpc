package com.dzone.spring.service;

import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

	@Override
	public String send(String message) {
		System.out.println("Sending message: " + message);
		return "OK";
	}
}
