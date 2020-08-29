package com.algo.ds.binarysearch.problems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CelingNumberFinderTest {
	
	private CelingNumberFinder ceiler;
	
	@BeforeEach 
	void test() {
		ceiler = new CelingNumberFinder();
	}
	
	@Test 
	void cielSuccessTest() {
		int[] arr = {1,3, 8, 10, 15};
		int actual = ceiler.ciel(arr, 12);
		assertThat(actual).isEqualTo(15);
		
		actual = ceiler.ciel(arr, 3);
		assertThat(actual).isEqualTo(3);
		
		actual = ceiler.ciel(arr, 15);
		assertThat(actual).isEqualTo(15);
		
		actual = ceiler.ciel(arr, 9);
		assertThat(actual).isEqualTo(10);
	}
	
	@Test 
	void cielOutofRangeShouldReturnMinus() {
		int[] arr = {1,3, 8, 10, 15};
		int actual = ceiler.ciel(arr, 100);
		assertThat(actual).isEqualTo(-1);
	}

}
