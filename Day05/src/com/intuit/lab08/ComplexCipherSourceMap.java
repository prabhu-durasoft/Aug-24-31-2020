package com.intuit.lab08;

public class ComplexCipherSourceMap {

	private String originalWord;
	private String jumbledWord;
	public ComplexCipherSourceMap(String originalWord, String jumbledWord) {
		this.originalWord = originalWord;
		this.jumbledWord = jumbledWord;
	}
	public String getOriginalWord() {
		return originalWord;
	}
	public String getJumbledWord() {
		return jumbledWord;
	}
	
}
