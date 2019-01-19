package com.dzone.spring.service.exporter;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.dzone.spring.service.MessageService;
import com.googlecode.jsonrpc4j.spring.JsonServiceExporter;

@Component
public class MessageServiceExporter {
	
	private MessageService messageService;
	
	private MessageServiceExporter(MessageService messageService) {
		this.messageService = messageService;
	}
	
	@Bean(name = "/rpc/messageservice")
	public JsonServiceExporter jsonServiceExporter() {
		JsonServiceExporter exporter = new JsonServiceExporter();
		exporter.setService(messageService);
		exporter.setServiceInterface(MessageService.class);
		return exporter;
	}
}
