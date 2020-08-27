package com.algo.ds.recursion.all;

import java.util.ArrayList;
import java.util.List;

public class StringPermutator {
	
	/**
	 * 
	 *    ABC            
	 *                     "" 
	 *                  /      \
	 *   			   ""       A
	 *   			 / \       / \
	 *   		    ""   C    A  AB
	 *              /\  / \   /\  /\
	 *             "" B C CB A AC AB ABC
	 *             
	 *               
	 * @param word
	 * @param i
	 * @param length
	 * @param data
	 * @param arrayList 
	 */

	public List<String> permute(String word, int i, int length, String data, ArrayList<String> collector) {
		
		if(i == length) {
			collector.add(data);
			return null;
			
		}
		permute(word, i+1, length, data,collector );
		permute(word,i+1, length, data+=word.charAt(i), collector);
		
		return collector;
		
	}

}
