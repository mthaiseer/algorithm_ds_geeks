package com.algo.ds.sorting.problems;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HeapBuilderTest {
	
	HeapBuilder builder;

	@BeforeEach
	void init() {
		builder = new HeapBuilder();
	}
	
	@Test
	void testHeapify() {
		
		int[] arr = {10, 20, 30};
		int[] actual  =  builder.buildHeap(arr);
		
		int[] expected = {30, 20, 10};
		
		assertArrayEquals(expected, actual);
		
	}
}
