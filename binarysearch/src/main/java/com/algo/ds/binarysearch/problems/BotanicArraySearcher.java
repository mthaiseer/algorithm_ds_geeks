package com.algo.ds.binarysearch.problems;

public class BotanicArraySearcher {

	public int search(int[] arr) {
	
		int start =0;
		int end = arr.length-1;
		
		while(start < end) {
			
			int mid = (start +end)/2;
			
			if(arr[mid] > arr[mid+1]) {
				end = mid;
			}else {
				start = mid+1;
			}
			
		}
		
		return arr[start];
	}

}
