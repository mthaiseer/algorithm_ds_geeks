package com.algo.ds.binarysearch.problems;

public class CelingNumberFinder {

	public int ciel(int[] arr, int searchItem) {
		
		if(arr==null || arr.length==0) {
			return -1;
		}
		
		int start =0;
		int end = arr.length-1;
		
		if(searchItem > arr[end]) {
			return -1;
		}
		
		while(start <= end) {
			
			int mid = (end + (end-start))/2;
			if(arr[mid] == searchItem) {
				return arr[mid];
			}
			
			if(searchItem < arr[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
		}
		return arr[start];
	}

}
