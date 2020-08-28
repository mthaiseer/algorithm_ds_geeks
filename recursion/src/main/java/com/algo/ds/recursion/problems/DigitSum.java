package com.algo.ds.recursion.problems;

public class DigitSum {

	public Long sum(Long digit) {

		return digit <=0 ? 0L : digit%10+ sum(digit/10);
		
	}

}
