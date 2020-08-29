package com.algo.ds.binarysearch.problems;

/**
 * 
 * Binary search handles both asc/desc order elements
 * 
 * @author mohamed Thaiseer
 *
 */
public class OrderAgnosticBinarySearcher {

	public int search(int[] arr, int searchItem) {
		
		if(arr == null || arr.length ==0) {
			return -1;
		}
		
		int start = 0;
		int end = arr.length-1;
		boolean isAsc = arr[start]< arr[end];
		
		while(start <= end) {
			
			int mid = (end + (end-start))/2;
			if(arr[mid] == searchItem) {
				return mid;
			}
			
			if(isAsc) {
				
				if(searchItem < arr[mid]) {
					end = mid-1;
				}else {
					start = mid+1;
				}
				
			}else {
				
				if(searchItem < arr[mid]) {
					start  = mid+1;
				}else {
					end = mid-1;
				}
				
			}
			
		}
		
		return -1;
	}

}
