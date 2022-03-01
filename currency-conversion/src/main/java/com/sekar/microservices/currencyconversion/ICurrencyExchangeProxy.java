package com.sekar.microservices.currencyconversion;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name="currency-exchange",url="localhost:8002")
@FeignClient(name="currency-exchange")
public interface ICurrencyExchangeProxy {
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyConversion getExchangeValue(@PathVariable String from, @PathVariable String to);
		
	

}
