package com.algo.ds.binarysearch.problems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderAgnosticBinarySearcherTest {
	
	private OrderAgnosticBinarySearcher searcher;
	
	@BeforeEach
	public void init() {
		searcher = new OrderAgnosticBinarySearcher();
	}
	
	
	@Test
	void testSearchAscendingSuccess() {
		
		int[] ascData = {1,2,3,4,5};
		int index = searcher.search(ascData, 2);
		assertThat(index).isEqualTo(1);
		
		index = searcher.search(ascData, 1);
		assertThat(index).isEqualTo(0);
		
		index = searcher.search(ascData, 5);
		assertThat(index).isEqualTo(4);
		
		index = searcher.search(ascData, 100);
		assertThat(index).isEqualTo(-1);
		
	}
	
	@Test
	void testSearchDescendingSuccess() {
		
		int[] ascData = {5,4,3,2,1};
		int index = searcher.search(ascData, 2);
		assertThat(index).isEqualTo(3);
		
		index = searcher.search(ascData, 5);
		assertThat(index).isEqualTo(0);
		
		index = searcher.search(ascData, 1);
		assertThat(index).isEqualTo(4);
		
		index = searcher.search(ascData, 100);
		assertThat(index).isEqualTo(-1);
		
	}
	
	@Test
	void testSearchNull() {
		int[] ascData = null;
		int index = searcher.search(ascData, 2);
		assertThat(index).isEqualTo(-1);
		
	}
	
	@Test
	void testSearchEmpty() {
		int[] ascData = {};
		int index = searcher.search(ascData, 2);
		assertThat(index).isEqualTo(-1);
		
	}



}
