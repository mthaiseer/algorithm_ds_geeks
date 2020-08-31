package com.algo.ds.sorting.problems;

public class HeapSorter {

	public int[] sort(int[] arr) {
		
		buildHeap(arr);
		int size = arr.length-1;
		
		while(size > 0) {
			
			int temp = arr[size];
			arr[size] =   arr[0];
			arr[0] = temp;
			
			size--;
			heapify(arr, 0, size);
			
		}
		return arr;
	}
	
	private  void  buildHeap(int[] arr) {
		
		for(int i=arr.length/2; i>=0; i--) {
			heapify(arr, i, arr.length-1);
		}
		
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
