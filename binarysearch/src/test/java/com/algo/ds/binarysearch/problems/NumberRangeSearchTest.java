package com.algo.ds.binarysearch.problems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NumberRangeSearchTest {
	
	private NumberRangeSearch numberRangeSearch;
	
	@BeforeEach
	void init() {
		numberRangeSearch = new NumberRangeSearch();
	}
	
	@Test 
	void testRangesSuccess() {
		
		int[] arr = {1,6,6,6,6,12};
		int[] actual = numberRangeSearch.findIndexes(arr, 6);
		assertThat(actual).isEqualTo(new int[] {1, 4});
		
	}
	
	@Test 
	void testRangesFail() {
		
		int[] arr = {1,6,6,6,6,12};
		int[] actual = numberRangeSearch.findIndexes(arr, 10);
		assertThat(actual).isEqualTo(new int[] {-1, -1});
		
	}
	
	@Test 
	void testRangesNullFail() {
		
		int[] arr = null;
		int[] actual = numberRangeSearch.findIndexes(arr, 10);
		assertThat(actual).isEqualTo(new int[] {-1, -1});
		
	}
	@Test 
	void testRangesEmptyFail() {
		
		int[] arr = null;
		int[] actual = numberRangeSearch.findIndexes(arr, 10);
		assertThat(actual).isEqualTo(new int[] {-1, -1});
		
	}

}
