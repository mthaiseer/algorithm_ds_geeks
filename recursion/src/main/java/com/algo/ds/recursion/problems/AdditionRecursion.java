package com.algo.ds.recursion.problems;

public class AdditionRecursion {

	public int findSum(int[] arr, int i) {
		
		if( i < 0) {
			return 0;
		}
		
		return arr[i]+ findSum(arr, i-1);
	}

}
