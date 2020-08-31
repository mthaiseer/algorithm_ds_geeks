package com.algo.ds.sorting.problems;

public class SelectionSorter {

	public int[] sort(int[] arr) {
		
		if(arr == null) {
			return null;
		}
		
		for(int i=0; i <arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] > arr[j]) {
					swap(arr, i, j);
				}
				
			}
		}
		
		return arr;
	}

	private void swap(int[] arr, int start, int end) {
		int temp = arr[start];
		arr[start] = arr[end];
		arr[end]= temp;
	}

}
