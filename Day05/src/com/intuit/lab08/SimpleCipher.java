package com.intuit.lab08;

public class SimpleCipher implements Cipher {

	public String encrypt(String word) {
		StringBuilder builder = new StringBuilder();
		int count = 0;
		while(count < word.length()) {
			char ch = word.charAt(count);
			if(ch == 'z' || ch == 'Z') {
				ch = 'a';
			}
			else {
				ch++;
			}
			builder.append(ch);
			count++;
		}
		return builder.toString();
	}

	public String decrypt(String word) {
		StringBuilder builder = new StringBuilder();
		int count = 0;
		while(count < word.length()) {
			char ch = word.charAt(count);
			if(ch == 'a' || ch == 'A') {
				ch = 'z';
			}
			else {
				ch--;
			}
			builder.append(ch);
			count++;
		}
		return builder.toString();
	}

}
