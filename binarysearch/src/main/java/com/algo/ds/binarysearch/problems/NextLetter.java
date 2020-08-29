package com.algo.ds.binarysearch.problems;

public class NextLetter {

	public char find(char[] chars, char searchChar) {
		
		if(chars == null || chars.length ==0) {
			return '\0';
		}
		
		int start =0;
		int end = chars.length-1;
		
		while(start <= end) {
			
			int mid = (end + (end- start))/2;
			
			if(searchChar < chars[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
			
		}
		return chars[start % chars.length];
	}

}
