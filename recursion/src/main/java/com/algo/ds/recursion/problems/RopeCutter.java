package com.algo.ds.recursion.problems;

public class RopeCutter {

	public int cut(int rope, int j, int k, int l) {
		
		if(rope <= 0) {
			return rope;
		}
		

		int result  =  Math.max(
					cut(rope-j, j, k, l ),
				Math.max(
					cut(rope-k, j, k, l),
					cut(rope-l, j, k, l )
		));
		
		if(result>=0) {
			return 1+ result;
		}
		
		return -1;
	}

}
