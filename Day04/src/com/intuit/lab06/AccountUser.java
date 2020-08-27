package com.intuit.lab06;

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
		System.out.println();
		
		Account currAcc = new CurrentAccount("Intuit Inc.,", 20000);
		currAcc.deposit(2000);
		currAcc.deposit(2000);
		currAcc.withdraw(100);
		currAcc.withdraw(100);
		currAcc.withdraw(100);
		currAcc.withdraw(100);
		currAcc.withdraw(100);
		currAcc.withdraw(100);
		currAcc.withdraw(100);
		currAcc.withdraw(100);
		currAcc.withdraw(100);
		currAcc.withdraw(100);
		currAcc.withdraw(100);
		currAcc.withdraw(100);
		String currAccStatement = currAcc.getAccountStatement();
		System.out.println(currAccStatement);
		System.out.println("Balance: " + currAcc.getBalance());
		System.out.println();
		
		Account premCurrAcc = new PremiumCurrentAccount("Intuit Inc.,", 20000);
		premCurrAcc.deposit(200000);
		premCurrAcc.deposit(200000);
		for (int i = 0; i < 112; i++) {
			premCurrAcc.withdraw(100);
		}
		String premCurrAccStatement = premCurrAcc.getAccountStatement();
		System.out.println(premCurrAccStatement);
		System.out.println("Balance: " + premCurrAcc.getBalance());		

	}

}
