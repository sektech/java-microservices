package com.sekar.microservices.currencyexchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;
    
    @Autowired
    private CurrencyExchangeRepository repo;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public Currency getCurrency(@PathVariable String from, @PathVariable String to){
        
    	Currency currency = repo.findByFromAndTo(from, to);
    	if(currency == null)
    		return null;
    	currency.setEnvironment(environment.getProperty("local.server.port"));
        return currency;
    }
}
