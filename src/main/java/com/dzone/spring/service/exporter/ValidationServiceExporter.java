package com.dzone.spring.service.exporter;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.dzone.spring.service.ValidationService;
import com.googlecode.jsonrpc4j.spring.JsonServiceExporter;

@Component
public class ValidationServiceExporter {
	
	private ValidationService validationService;
	
	private ValidationServiceExporter(ValidationService validationService) {
		this.validationService = validationService;
	}
	
	@Bean(name = "/rpc/validationservice")
	public JsonServiceExporter jsonServiceExporter() {
		JsonServiceExporter exporter = new JsonServiceExporter();
		exporter.setService(validationService);
		exporter.setServiceInterface(ValidationService.class);
		return exporter;
	}
}
