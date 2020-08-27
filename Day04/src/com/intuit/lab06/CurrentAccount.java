package com.intuit.lab06;

public class CurrentAccount extends Account {
	private String name;

	public CurrentAccount(String theName, double initialBalance) {
		super(initialBalance);
		name = theName;
	}
	
	public String getName() {
		return name;
	}
	
	public int getWithdrawLimit() {
		return 10;
	}
	
	public double getMaxWithdrawAmount() {
		return 100000;
	}
	
	public void withdraw(double amount) {
		if(amount > getMaxWithdrawAmount()) {
			throw new RuntimeException("Withdrawal limit cannot exceed " + getMaxWithdrawAmount());
		}
		super.withdraw(amount);
	}
	
}
