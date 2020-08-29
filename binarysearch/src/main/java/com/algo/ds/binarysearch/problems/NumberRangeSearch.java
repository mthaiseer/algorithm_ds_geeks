package com.algo.ds.binarysearch.problems;

public class NumberRangeSearch {

	public int[] findIndexes(int[] arr, int data) {
		
		int[] result = {-1, -1};
		
		if( arr == null || arr.length ==0) {
			return result;
		}
	
		result[0] = binarySearch(arr, data,  false);
		if(result[0] != -1) {
			result [1] = binarySearch(arr, data,  true); 
		}
		return result;
	}
	
	private int binarySearch(int[] arr, int data, boolean isSecondPass) {
		
		int findIndex = -1;
		
		int start = 0;
		int end = arr.length-1;
		
		while(start <= end) {
			
			int mid = (start + end)/2;
			
			if( data < arr[mid]) {
				 end = mid-1;
			}else if(data > arr[mid]) {
				start = mid+1;
			}else {
				findIndex = mid;
				if(!isSecondPass) {
					end = mid-1;
				}else {
					start = mid+1;
				}
			}
		}
		return findIndex;
	}
}
