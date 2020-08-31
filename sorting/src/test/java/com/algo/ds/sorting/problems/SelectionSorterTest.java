package com.algo.ds.sorting.problems;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SelectionSorterTest {
	
	private SelectionSorter sorter;
	
	@BeforeEach
	void init() {
		sorter = new SelectionSorter();
	}
	
	@Test
	void testSelectionSortSuccess() {
		
		int[] arr = {4,6,3,1,2};
		int [] actual = sorter.sort(arr);
		
		int expected[] =  {1,2,3,4,6};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void testSelectionSortSuccessEmpty() {
		
		int[] arr = {};
		int [] actual = sorter.sort(arr);
		
		int expected[] =  {};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void testSelectionSortSuccessNull() {
		
		int[] arr = null;
		int [] actual = sorter.sort(arr);
		
		int expected[] =  null;
		assertArrayEquals(expected, actual);
		
	}
	
	
	@Test
	void testSelectionSortSuccessOneItem() {
		
		int[] arr = {1};
		int [] actual = sorter.sort(arr);
		
		int expected[] =  {1};
		assertArrayEquals(expected, actual);
		
	}
	
	@Test
	void testSelectionSortSuccessTwoItem() {
		
		int[] arr = {2,1};
		int [] actual = sorter.sort(arr);
		
		int expected[] =  {1,2};
		assertArrayEquals(expected, actual);
		
	}
	
	
	

}
