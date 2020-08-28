package com.algo.ds.recursion.all;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.algo.ds.recursion.problems.RopeCutter;

public class MaxRopeCutterTest {
	
	RopeCutter cutter;
	
	@BeforeEach
	void init() {
		cutter = new RopeCutter();
	}
	
	@Test
	void testRopCutterSuccess() {
		
		int expected  =  cutter.cut(10, 8, 2, 6);
		assertThat(expected).isEqualTo(5);
		
	}
	
	@Test
	void testRopCutterSuccess2() {
		
		int expected  =  cutter.cut(5, 2, 1, 5);
		assertThat(expected).isEqualTo(5);
		
	}
	
	@Test
	void testRopCutterSuccess3() {
		
		int expected  =  cutter.cut(23, 11,9,12);
		assertThat(expected).isEqualTo(2);
		
	}
	
	@Test
	void testRopCutterNotValid() {
		
		int expected  =  cutter.cut(5, 4,2,6);
		assertThat(expected).isEqualTo(-1);
		
	}



}
