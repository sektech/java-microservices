package com.sekar.microservices.currencyexchange;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class CurrencyExchangeApplication implements CommandLineRunner{
	
	@Autowired
	private CurrencyExchangeRepository repo;

	public static void main(String[] args){
		SpringApplication.run(CurrencyExchangeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		repo.save(new Currency(1001,"USD","INR",65.00,"") );
		repo.save(new Currency(1002,"GBP","INR",100.00,"") );
	}

}
