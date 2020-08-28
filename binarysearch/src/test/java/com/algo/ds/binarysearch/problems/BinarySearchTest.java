package com.algo.ds.binarysearch.problems;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
	
	BinarySearcher  binarySearch;
	
	@BeforeEach
	void init() {
		binarySearch = new BinarySearcher();
	}
	
	@Test
	void testBinarySearchSuccess() {
		
		int[] arr = {1,2,3,4,5, 8, 10};
		
		int actualIndex = binarySearch.search(arr, 5);
		assertThat(actualIndex).isEqualTo(4);
		
		actualIndex = binarySearch.search(arr, 10);
		assertThat(actualIndex).isEqualTo(6);
		
		actualIndex = binarySearch.search(arr, 1);
		assertThat(actualIndex).isEqualTo(0);
		
	}
	
	@Test
	void testBinarySearchNegetive() {
		
		int[] arr = {1,2,3,4,5, 8, 10};
		
		int actualIndex = binarySearch.search(arr, 100);
		assertThat(actualIndex).isEqualTo(-1);
		
	}
	
	@Test
	void testBinarySearchNull() {

		int[] arr = null;
		int actualIndex = binarySearch.search(arr, 100);
		assertThat(actualIndex).isEqualTo(-1);
		
	}
	
	@Test
	void testBinarySearchLongArray() {

		int[] arr = {1,2,3,4,5, 8, 10,12,15, 18, 22, 50, 54, 77,88, 90, 92, 94, 96, 99, 100, 101,  110, 140, 158, 178, 188, 200};
		Arrays.sort(arr);
		int actualIndex = binarySearch.search(arr, 200);
		assertThat(actualIndex).isEqualTo(27);
		
		actualIndex = binarySearch.search(arr, 50);
		assertThat(actualIndex).isEqualTo(11);
		
	}
	

	@Test
	void testBinarySearchRecursionSuccess() {
		
		int[] arr = {1,2,3,4,5, 8, 10};
		
		int actualIndex = binarySearch.searchRecursion(arr, 5);
		assertThat(actualIndex).isEqualTo(4);
		
		actualIndex = binarySearch.search(arr, 10);
		assertThat(actualIndex).isEqualTo(6);
		
		actualIndex = binarySearch.search(arr, 1);
		assertThat(actualIndex).isEqualTo(0);
		
	}
	
	@Test
	void testBinarySearchRecusrsionNull() {

		int[] arr = null;
		int actualIndex = binarySearch.searchRecursion(arr, 100);
		assertThat(actualIndex).isEqualTo(-1);
		
	}
	
	@Test
	void testBinarySearchRecursionLongArray() {

		int[] arr = {1,2,3,4,5, 8, 10,12,15, 18, 22, 50, 54, 77,88, 90, 92, 94, 96, 99, 100, 101,  110, 140, 158, 178, 188, 200};
		Arrays.sort(arr);
		int actualIndex = binarySearch.searchRecursion(arr, 200);
		assertThat(actualIndex).isEqualTo(27);
		
		actualIndex = binarySearch.search(arr, 50);
		assertThat(actualIndex).isEqualTo(11);
		
	}
	


}
