package com.algo.ds.binarysearch.problems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BotanicalArraySearcherTest {
	
	
	BotanicalArraySearcher searcher;
	
	@BeforeEach
	void init() {
		searcher = new BotanicalArraySearcher();
	}
	
	@Test
	void testBotanicArraySuccess() {
		
		int[] arr= {1,4,6,7,12,3,2};
		int actual  =  searcher.search(arr, 4);
		
		assertThat(actual).isEqualTo(1);
		
	}
	
	@Test
	void testBotanicArraySuccess2() {
		
		int[] arr= {1,4,6,7,12,3,2};
		int actual  =  searcher.search(arr, 3);
		
		assertThat(actual).isEqualTo(5);
		
	}
	
	
	@Test
	void testBotanicArraySuccess3() {
		
		int[] arr= {1,4,6,7,12,3,2};
		int actual  =  searcher.search(arr, 12);
		
		assertThat(actual).isEqualTo(4);
		
	}

}
