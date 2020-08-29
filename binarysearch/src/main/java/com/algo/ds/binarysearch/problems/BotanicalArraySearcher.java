package com.algo.ds.binarysearch.problems;

public class BotanicalArraySearcher {
	

	public int search(int[] arr, int data) {
		
		int middle =  botanicalIndex(arr);
		
		if( data == arr[middle]) {
			return middle;
		}
		
		int result = binarySearch(arr, data, 0, middle-1);
		

		if(result != -1) {
			return result;
		}
		
		return binarySearch(arr, data, middle, arr.length-1);
		
	}

	
	
	
	
	private int binarySearch(int[] arr, int data, int start, int end) {
		
		while(start <= end) {
			int mid  = (start + end )/2;
			
			if(arr[mid] == data) {
				return mid;
			}
			
			if(data < arr[mid]) {
				end = mid-1;
			}else {
				start = mid+1;
			}
			
			
		}
		return -1;
	}
	
	private  int botanicalIndex(int[] arr) {
		
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
		
		return start;
	}

}
