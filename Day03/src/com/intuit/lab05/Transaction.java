package com.intuit.lab05;

import java.time.LocalDate;

public class Transaction {
	private double amount;
	private String type;
	private LocalDate date;
	
	public Transaction(double theAmount, String theType) {
		amount = theAmount;
		type = theType;
		date = LocalDate.now();
	}

	public double getAmount() {
		return amount;
	}

	public String getType() {
		return type;
	}

	public LocalDate getDate() {
		return date;
	}
}
