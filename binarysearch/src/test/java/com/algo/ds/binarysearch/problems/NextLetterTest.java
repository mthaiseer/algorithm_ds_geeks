package com.algo.ds.binarysearch.problems;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NextLetterTest {
	
	private NextLetter nextLetter;
	
	@BeforeEach
	void init() {
		nextLetter = new NextLetter();
	}
	
	@Test
	void testNextLetterSuccess() {
		char[] chars = {'a', 'c', 'f','h'};
		char actual = nextLetter.find(chars, 'f');
		assertThat(actual).isEqualTo('h');
		
		 actual = nextLetter.find(chars, 'b');
		 assertThat(actual).isEqualTo('c');
		 
		 actual = nextLetter.find(chars, 'm');
		 assertThat(actual).isEqualTo('a');
		 
		 actual = nextLetter.find(chars, 'h');
		 assertThat(actual).isEqualTo('a');
		
		
	}

}
