package com.intuit.lab08;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your word");
		String word = scanner.nextLine().trim();
		
		Cipher simple = new SimpleCipher();
		Cipher complex = new ComplexCipher();
		
		String encryptedWord = encrypt(simple, word); 
		System.out.println("Encryption using Simple Cipher: " + encryptedWord);
		String decryptedWord = decrypt(simple, encryptedWord);
		System.out.println("Decryption using Simple Cipher: " + decryptedWord);
		
		System.out.println();
		
		String complexEncryptedWord = encrypt(complex, word);
		System.out.println("Encryption using Complex Cipher: " + complexEncryptedWord);
		String complexDecryptedWord = decrypt(complex, complexEncryptedWord);
		System.out.println("Decryption using Complex Cipher: " + complexDecryptedWord);

		scanner.close();
	}

	private static String encrypt(Cipher cipher, String word) {
		return cipher.encrypt(word);
	}
	
	private static String decrypt(Cipher cipher, String encryptedWord) {
		return cipher.decrypt(encryptedWord);
	}

}
