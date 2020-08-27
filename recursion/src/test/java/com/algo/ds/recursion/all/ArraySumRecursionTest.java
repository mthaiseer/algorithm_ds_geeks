package com.algo.ds.recursion.all;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArraySumRecursionTest {
	
	
	AdditionRecursion headRecursion;
	
	@BeforeEach
	public void init() {
		headRecursion = new AdditionRecursion();
	}
	
	@Test
	public void testHeadRecursion() {
		int[] arr= {1,2,3};
		
		int sum  =  headRecursion.findSum(arr, arr.length-1);
		assertThat(sum).isEqualTo(6);
	}
	
	@Test
	public void testHeadRecursion_mid() {
		int[] arr= {1,2,3, 4, 5, 7};
		
		int sum  =  headRecursion.findSum(arr, arr.length-1);
		assertThat(sum).isEqualTo(22);
	}
	
	@Test
	public void testHeadRecursion_empty() {
		int[] arr= {};
		
		int sum  =  headRecursion.findSum(arr, arr.length-1);
		assertThat(sum).isEqualTo(0);
	}
	
	@Test
	public void testHeadRecursion_one() {
		int[] arr= {1};
		
		int sum  =  headRecursion.findSum(arr, arr.length-1);
		assertThat(sum).isEqualTo(1);
	}



}
