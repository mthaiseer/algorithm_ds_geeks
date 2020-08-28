package com.algo.ds.recursion.all;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.algo.ds.recursion.problems.StringPermutator;

public class StringPermutatorTest {
	
	
	StringPermutator permutator;
	
	@BeforeEach
	void init() {
		permutator = new StringPermutator();
	}
	
	@Test
	void testStringPermutation() {
		String word = "ABC";
		
		String[] expected = {"", "C", "B", "BC", "A", "AC", "AB", "ABC"};
		List<String> actual  = permutator.permute(word, 0, word.length(), "", new ArrayList<>());
		assertArrayEquals(expected,actual.toArray());
	}
	
	@Test
	void testStringPermutation2() {
		String word = "ABCDEF";
		List<String> actual  =  permutator.permute(word, 0, word.length(), "", new ArrayList<>());
		assertThat(actual).isNotNull();
		assertThat(actual.size()).isEqualTo(64);
	}
	
	

}
