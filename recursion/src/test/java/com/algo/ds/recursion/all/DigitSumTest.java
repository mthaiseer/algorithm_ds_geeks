package com.algo.ds.recursion.all;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.algo.ds.recursion.problems.DigitSum;

public class DigitSumTest {
	
	DigitSum digitSum;
	
	@BeforeEach
	public void init() {
		digitSum = new DigitSum();
	}
	
	@Test
    void testDigitSumSuccess() {
		
		Long digit = 123L;
		Long actual  = digitSum.sum(digit);
		assertThat(actual).isEqualTo(6);
		
	}
	
	@Test
    void testDigitSumOne() {
		
		Long digit = 1L;
		Long actual  = digitSum.sum(digit);
		assertThat(actual).isEqualTo(1);
		
	}
	
	
	@Test
    void testDigitSumBig() {
		
		Long digit = 123456789L;
		Long actual  = digitSum.sum(digit);
		assertThat(actual).isEqualTo(45);
	
		
	}

}
