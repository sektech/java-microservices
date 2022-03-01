package com.sekar.microservices.currencyconversion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private ICurrencyExchangeProxy proxy;	
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/quantity/{quantity}")
	public CurrencyConversion getConversion(@PathVariable String from, @PathVariable String to, @PathVariable int quantity) {
		
		CurrencyConversion exchangeValue = proxy.getExchangeValue(from, to);
		exchangeValue.setQuantity(quantity);
		exchangeValue.setTotalCalculatedAmount(quantity* exchangeValue.getConversionMultiple());
		//exchangeValue.setEnvironment(environment.getProperty("local.server.port"));
		return exchangeValue;
	}

}
