package com.intuit.lab05;

public class AccountUser {

	public static void main(String[] args) {
		Account acc = new Account(20000);
		acc.deposit(2000);
		acc.deposit(2000);
		acc.withdraw(100);
		acc.withdraw(100);
		acc.withdraw(100);
		acc.withdraw(100);
		acc.withdraw(100);
		acc.withdraw(100);
		String statement = acc.getAccountStatement();
		System.out.println(statement);
		System.out.println("Balance: " + acc.getBalance());
		
		Account acc2 = new Account(1000);
		acc.withdraw(28394789334d);
	}

}
