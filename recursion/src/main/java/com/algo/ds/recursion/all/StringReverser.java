package com.algo.ds.recursion.all;

public class StringReverser {
	
	
	public String reverse(String word) {
		
		if(word == null || word.isEmpty() || word.isBlank()) {
			return "";
		}
		return reverse(word.toCharArray(), 0, word.length()-1);
		
	}
	
	private  String reverse(char[] word, int start, int end) {

		if(start >= end) {
			return new String(word);
		}
		swap(word, start, end);
		
		return reverse(word, start+1, end-1);
	}
	
	private void swap(char[] word, int start, int end) {
		char temp  = word[start];
		word[start] = word[end];
		word[end] = temp;
	}
	


}
