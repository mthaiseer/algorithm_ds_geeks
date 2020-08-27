package com.algo.ds.recursion.all;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CountOfDigitTest {
	
	DigitCounter digitCounter;
	
	@BeforeEach
	public void init() {
		digitCounter = new DigitCounter();
	}
	
	@Test
	public void testDigitCountSuccess() {
		
		Long digit = 123L;
		Long actual  = digitCounter.count(digit);
		assertThat(actual).isEqualTo(3);
		
	}
	
	@Test
	public void testDigitCountZeroLength() {
		
		Long digit = 1L;
		Long actual  = digitCounter.count(digit);
		assertThat(actual).isEqualTo(1);
		
	}
	
	@Test
	public void testDigitCountMaxLength() {
		
		Long digit = 123456789123456789L;
		Long actual  = digitCounter.count(digit);
		assertThat(actual).isEqualTo(18);
		
	}

}
