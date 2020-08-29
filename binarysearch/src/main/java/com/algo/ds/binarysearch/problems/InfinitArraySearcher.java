package com.algo.ds.binarysearch.problems;

public class InfinitArraySearcher {

	public int search(int[] arr, int data) {

		int start = 0;
		int end = 1;
		int result = search(arr, data, start, end);
		while (result == -1) {
			end *= 2;
			result = search(arr, data, end / 2, end);
		}
		return result;
	}

	private int search(int[] arr, int data, int start, int end) {
		while (start <= end) {

			int mid = (start + end) / 2;

			if (data == arr[mid]) {
				return mid;
			}
			if (data < arr[mid]) {
				end = mid - 1;

			} else if (data > arr[mid]) {
				start = mid + 1;
			}

		}
		return -1;
	}

}
