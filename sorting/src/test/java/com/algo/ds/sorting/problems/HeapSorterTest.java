package com.algo.ds.sorting.problems;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HeapSorterTest {
	
	HeapSorter heapSorter;
	
	@BeforeEach
	void init() {
		heapSorter = new HeapSorter();
	}
	
	@Test 
	void testHeapSort() {
		
		int[] arr = {20, 10, 30};
		int[] actual  = heapSorter.sort(arr);
		int[] expected = {10, 20, 30};
		assertArrayEquals(expected, actual);
		
		
	}
	
	@Test 
	void testHeapSort2() {
		
		int[] arr = {20, 10, 30, 50, 70, 3,5,6,7,12};
		
		int[] actual  = heapSorter.sort(arr);
		
		for(int a: actual) {
			System.out.print(a +" ");
		}
		
		int[] expected = {3,5,6,7,10,12, 20,30,50,70};
		
		assertArrayEquals(expected, actual);
		
		
	}

}
