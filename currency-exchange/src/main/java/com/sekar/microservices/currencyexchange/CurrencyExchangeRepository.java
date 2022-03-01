
package com.sekar.microservices.currencyexchange;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface CurrencyExchangeRepository extends CrudRepository<Currency, Integer> {
	
	Currency findByFromAndTo(String from,String to);
}