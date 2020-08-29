package com.algo.ds.binarysearch.problems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InfinitArraySearcherTest {
	
	private InfinitArraySearcher infinitArraySearcher;
	
	@BeforeEach
	void init() {
		infinitArraySearcher = new InfinitArraySearcher();
	}
	
	@Test
	void testInfinitSuccess() {
		int[] arr = {1,2,3,4,5,6,7,8,9,11,12,13, 14, 15, 16};
		int expected = infinitArraySearcher.search(arr,9 );
		assertThat(expected).isEqualTo(8);
		
		expected = infinitArraySearcher.search(arr,1 );
		assertThat(expected).isEqualTo(0);
		
		expected = infinitArraySearcher.search(arr,15 );
		assertThat(expected).isEqualTo(13);
		
		
	}

}
