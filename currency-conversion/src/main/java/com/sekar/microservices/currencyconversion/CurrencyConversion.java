package com.sekar.microservices.currencyconversion;

import org.springframework.stereotype.Component;

@Component
public class CurrencyConversion {
	
	private int id;	
    private String from;	
    private String to;	
    private double conversionMultiple;
    private int quantity;
    private double totalCalculatedAmount;
    private String Environment;
    
    public CurrencyConversion() {
    	
    }
	public CurrencyConversion(int id, String from, String to, double conversionMultiple, int quantity,
			String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
		this.quantity = quantity;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getEnvironment() {
		return Environment;
	}
	public void setEnvironment(String environment) {
		Environment = environment;
	}
	public double getTotalCalculatedAmount() {
		return totalCalculatedAmount;
	}
	public void setTotalCalculatedAmount(double totalCalculatedAmount) {
		this.totalCalculatedAmount = totalCalculatedAmount;
	}

    

}
