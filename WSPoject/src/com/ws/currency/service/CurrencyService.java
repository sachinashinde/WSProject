package com.ws.currency.service;

public class CurrencyService {

	public CurrencyService() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCurrency(String country) {
		String currency = null;
		if(country.equalsIgnoreCase("india")){
			currency = "Rs";
		} else 	if(country.equalsIgnoreCase("usa")){
			currency = "Dollar";
		} 	if(country.equalsIgnoreCase("uae")){
			currency = "Dinar";
		}
		return currency;
	}

}
