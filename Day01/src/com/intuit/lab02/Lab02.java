package com.intuit.lab02;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
//		int[] arr = {};
//		System.out.println(arr.length);
//		
//		String str = "java";
//		System.out.println(str.length());
//		
//		int j = 10;
//		String s = j + "";
//		
		
		int[] numbers = new int[3];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter a number");
			numbers[i] = scanner.nextInt();
		}
		square(numbers);
		increment(numbers);
		doubleIt(numbers);
		for (int num : numbers) {
			System.out.println(num);
		}
		scanner.close();
		
	}
	//BAD WAY TO WRITE CODE
	static void print(String operation, int[] numbers) {
		String output = "***" + operation;
		output += "(";
		for (int num : numbers) {
			output += num + ", ";
		}
		output = output.substring(0, output.length() - 2);
		output += ")";
		System.out.println(output);
	}
	
	private static void square(int[] numArr) {
		print("squaring", numArr);
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] *= numArr[i];
		}
	}
	
	private static void increment(int[] numArr) {
		print("incrementing", numArr);
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] += 1;
		}
	}
	
	private static void doubleIt(int[] numArr) {
		print("doubling", numArr);
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] *= 2;
		}
	}

}
