package com.algo.ds.sorting.problems;

public class QuickSorter {

	public int[] sort(int[] arr) {
		return sort(arr, 0, arr.length-1);
	}

	private int[] sort(int[] arr, int start, int end) {
		
		 if(start < end) {
			 
			 int partitionIndex =  partition(arr, start, end);
			 sort(arr, start, partitionIndex-1);
			 sort(arr,partitionIndex+1, end);
		 }
		 
		 return arr;
	}

	private int partition(int[] arr, int start, int end) {
		int pIndex = start;
		int pivot = arr[end];
		
		for( int i=start; i<end; i++ ) {
			
			if(arr[i] < pivot) {
				
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				
				pIndex++;
			}
			
		}
		
		int temp = arr[end];
		arr[end] = arr[pIndex];
		arr[pIndex] = temp;
		
		return pIndex;
	}

}
