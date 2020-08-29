package com.algo.ds.binarysearch.problems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BotanicArraySearcherTest {
	
	private BotanicArraySearcher searcher;
	
	@BeforeEach
	void init() {
		searcher = new BotanicArraySearcher();
		
	}
	
	@Test
	void testBotanicArraySuccess() {
		
		int[] arr = {1,2,3,4,3,2,1};
		int actaul =  searcher.search(arr);
		
		assertThat(actaul).isEqualTo(4);
		
	}
	
	
	@Test
	void testBotanicArraySuccess2() {
		
		int[] arr = {1,2,3,4};
		int actaul =  searcher.search(arr);
		
		assertThat(actaul).isEqualTo(4);
		
	}

}
