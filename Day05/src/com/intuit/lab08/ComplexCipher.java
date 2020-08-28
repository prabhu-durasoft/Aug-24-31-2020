package com.intuit.lab08;

import java.util.ArrayList;

public class ComplexCipher implements Cipher {

	private ArrayList<ComplexCipherSourceMap> sourceMapStore;
	
	public ComplexCipher() {
		sourceMapStore = new ArrayList<>();
	}
	
	public String encrypt(String word) {
		StringBuilder builder = new StringBuilder();
		String[] letters = word.split("");
		int count = 0;
		while(count < letters.length)  {
			int randomIndex = (int)(Math.random() * letters.length);
			if(letters[randomIndex] != null) {
				String letter = letters[randomIndex];
				builder.append(letter);
				letters[randomIndex] = null;
				count++;
			}
		}
		String jumbledWord = builder.toString();
		ComplexCipherSourceMap map = new ComplexCipherSourceMap(word, jumbledWord);
		sourceMapStore.add(map);
		return jumbledWord;
	}

	public String decrypt(String jumbledWord) {
		String sourceWord = null;
		for (int i = 0; i < sourceMapStore.size(); i++) {
			ComplexCipherSourceMap map = sourceMapStore.get(i);
			if(map.getJumbledWord().equals(jumbledWord)) {
				sourceWord = map.getOriginalWord();
				break;
			}
		}
		return sourceWord;
	}

}
