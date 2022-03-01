package com.sekar.microservices.currencyexchange;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity(name="currency_exchange")
public class Currency {
	@Id
    private int id;
	
	@Column(name="currency_from")
    private String from;
	
	@Column(name="currency_to")
    private String to;
	@Column
    private double conversionMultiple;
	
	@Transient
    private String Environment;

    public Currency(){}
    public Currency(int id, String from, String to, double conversionMultiple, String environment) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.conversionMultiple = conversionMultiple;
        Environment = environment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getConversionMultiple() {
        return conversionMultiple;
    }

    public void setConversionMultiple(double conversionMultiple) {
        this.conversionMultiple = conversionMultiple;
    }

    public String getEnvironment() {
        return Environment;
    }

    public void setEnvironment(String environment) {
        Environment = environment;
    }
}
