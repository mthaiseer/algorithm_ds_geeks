package com.algo.ds.recursion.all;

public class DigitCounter {

	public Long count(Long digit) {
		
		return digit == 0? digit : 1+ count(digit/10);
		
	}

}