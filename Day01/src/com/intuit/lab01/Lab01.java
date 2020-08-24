package com.intuit.lab01;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guessing Game. Enter a number between 1 and 100");
		int target = (int)(Math.random() * 100); //0...0.1
		int attempts = 0;
		Scanner scanner = new Scanner(System.in);
		int guess = -1;
		while(guess != target) {
			guess = scanner.nextInt();
//			String guessText = scanner.nextLine();
//			try {
//				guess = Integer.parseInt(guessText);				
//			}
//			catch(Exception ex) {
//				System.out.println("Invalid input");
//			}

			attempts++;
			if(guess > target) {
				System.out.println("Aim Lower");
			}
			else if(guess < target) {
				System.out.println("Aim Higher");
			}
			else {
				System.out.println("You've got it in " + attempts + " attempts");
			}
		}
		scanner.close();
	}

}
