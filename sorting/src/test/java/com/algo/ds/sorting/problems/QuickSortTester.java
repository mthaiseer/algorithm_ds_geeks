package com.algo.ds.sorting.problems;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class QuickSortTester {
	
	private QuickSorter quickSorter;
	
	@BeforeEach
	void init() {
		quickSorter = new QuickSorter();
	}
	
	@Test
	void testQuickSortSuccess() {
		
		int[] arr = {2, 10, 35, 5, 25};
		int [] actual =  quickSorter.sort(arr);
		
		int[] expected  = {2,5,10,25, 35};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void testQuickSortSuccess3() {
		
		int[] arr = {2, 10, 35, 5, 25, 8,90,1,88};
		int [] actual =  quickSorter.sort(arr);
		
		int[] expected  = {1, 2,5,8, 10,25, 35, 88, 90};
		assertArrayEquals(expected, actual);
		
	}

}
