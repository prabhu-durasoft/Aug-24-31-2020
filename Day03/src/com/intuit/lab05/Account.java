package com.intuit.lab05;

import java.util.ArrayList;

public class Account {
	private double balance;
	private int withdrawCount;
	private ArrayList<Transaction> transactions;

	public Account(double initialBalance) {
		if(initialBalance > 10000) {
			balance = initialBalance;
		}
		else {
			throw new RuntimeException("Minimum balance should be 10000");
		}
		transactions = new ArrayList<>();
	}
	
	public double getBalance() {
		return balance;
	}
	
	private void addToTransactions(double amount, String type) {
		Transaction txn = new Transaction(amount, type);
		transactions.add(txn);
	}
	
	public void deposit(double amount) {
		balance += amount;
		addToTransactions(amount, "Deposit");
	}
	
	public void withdraw(double amount) {
		if(balance < amount) {
			throw new RuntimeException("Insufficient balance");
		}
		withdrawCount++;
		balance -= amount;
		addToTransactions(amount, "Withdraw");
		if(withdrawCount > 3) {
			double fee = amount * 0.005;
			balance -= fee;
			addToTransactions(fee, "Withdrawal Fee");
		}
	}
	
	public String getAccountStatement() {
		StringBuffer statement = new StringBuffer("");
		for (int i = 0; i < transactions.size(); i++) {
			Transaction txn = transactions.get(i);
			statement.append("Amount: ");
			statement.append(txn.getAmount());
			statement.append(", ");
			statement.append("Type: ");
			statement.append(txn.getType());
			statement.append(" on ");
			statement.append(txn.getDate().toString());
			statement.append("\n");
			//System.out.println(statement);
		}
		return statement.toString();
	}
	
}










