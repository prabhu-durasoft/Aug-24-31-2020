package com.intuit.lab03;

public class Lab03 {

	public static void main(String[] args) {
		style1();
		style2();
	}

	private static void style2() {
		String input = "p5 m1 p9 p5 m7 p5 m3 p2 m4 p6 p8";
		String[] items = input.split(" ");
		int output = 0;
		for (String item : items) {
			if(item.contains("p")) { //p5
				output += Integer.parseInt(item.substring(1)); //output = output + 5
			}
			else if(item.contains("m")) { //m1
				output -= Integer.parseInt(item.substring(1));  // output = output - 1
			}
		}
		System.out.println(output);
	}

	private static void style1() {
		String input = "+5 -1 +9 +5 -7 +5 -3 +2 -4 +6 +8";
		String[] items = input.split(" ");
		int output = 0;
		for (String item : items) {
			output += Integer.parseInt(item);
		}
		System.out.println(output);
	}

}
