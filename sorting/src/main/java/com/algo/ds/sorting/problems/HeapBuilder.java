package com.algo.ds.sorting.problems;

public class HeapBuilder {

	public int[] buildHeap(int[] arr) {
		
		for(int i=arr.length/2; i>=0; i--) {
			heapify(arr, i, arr.length-1);
		}
		return arr;
		
	}

	private void heapify(int[] arr, int index, int size) {
	
		//Find left and right indexes
		int left = 2* index+1;
		int right  = 2* index+2;
		
		//make max as current index (bottom to top)
		int max = index;
		
		//if left > top then need to swap
		if(left <= size && arr[left] > arr[max]) {
			max = left;
		}
		
		//if right node > top then need to swap 
		if(right <= size && arr[right] > arr[max]) {
			max = right;
		}
		
		//any of left/right nodes are greater then swap and heapify again 
		if(max != index) {
			int temp = arr[max];
			arr[max] = arr[index];
			arr[index] = temp;
			
			heapify(arr, max, size);
		}
		
		
	}

}
