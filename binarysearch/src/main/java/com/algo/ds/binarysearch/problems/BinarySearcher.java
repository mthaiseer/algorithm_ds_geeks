package com.algo.ds.binarysearch.problems;

public class BinarySearcher {

	/**
	 * Iterative solution
	 * 
	 * @param arr
	 * @param e
	 * @return
	 */
	public int search(int[] arr, int e) {
		
		if(arr == null) {
			return -1;
		}
		
		int start =0;
		int end = arr.length-1;
		
		while(start <= end) {
			
			int mid = (end + (end-start))/2;
			
			if(arr[mid] ==  e) {
				return mid;
			}
			
			if(e > arr[mid]) {
				start = mid+1;
				continue;
			}
			end = mid-1;
		}
		return -1;
	}
	
	/**
	 * Recursive implementation
	 * 
	 * @param arr
	 * @param e
	 * @return
	 */
	public int searchRecursion(int[] arr, int e) {
		if(arr == null) {
			return -1;
		}
		return searchRecursion(arr, e, 0, arr.length-1);
		
	}

	private int searchRecursion(int[] arr, int e, int start, int end) {
		
		if(start > end) {
			return -1;
		}
		
		int mid = (end + (end-start))/2;
		
		if(arr[mid] == e) {
			return mid;
		}
		
		return e> arr[mid]? searchRecursion(arr, e, mid+1, end) :  searchRecursion(arr, e,start, mid-1);
	}

}
