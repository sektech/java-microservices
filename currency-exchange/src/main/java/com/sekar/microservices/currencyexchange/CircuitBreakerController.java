package com.sekar.microservices.currencyexchange;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {
	
	private Logger logger = LoggerFactory.getLogger(CircuitBreakerController.class);
	
	@GetMapping("/sample-api")
	@Retry(name="sample-api", fallbackMethod = "handleSampleResponse")
	public String getData() {
		logger.info("This is from getSampleData()");
		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080", String.class);
		return forEntity.getBody();
		
	}
	
	public String handleSampleResponse(Exception ex) {
		return "Handle Fallback Response Method";
	}

}
