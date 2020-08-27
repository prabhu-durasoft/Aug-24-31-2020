package com.intuit.lab06;

public class PremiumCurrentAccount extends CurrentAccount {
	public PremiumCurrentAccount(String name, double initialBalance) {
		super(name, initialBalance);
	}
	
	public int getWithdrawLimit() {
		return 100;
	}
	
	public double getMaxWithdrawAmount() {
		return 1000000;
	}
	
}
