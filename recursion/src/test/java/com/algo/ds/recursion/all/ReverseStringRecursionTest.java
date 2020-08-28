package com.algo.ds.recursion.all;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.algo.ds.recursion.problems.StringReverser;

public class ReverseStringRecursionTest {
	
	private StringReverser reverser;
	
	@BeforeEach
	public void init() {
		reverser = new StringReverser();
	}
	
	@Test
	public void reverseStringSuccess() {
		
		String word = "Iamawinner";
		String reversedString  =  reverser.reverse(word);
		assertThat(reversedString).isEqualTo("renniwamaI");
		
	}
	
	@Test
	public void reverseStringNull() {
		
		String word =null;
		String reversedString  =  reverser.reverse(word );
		assertThat(reversedString).isEmpty();
		
	}
	
	@Test
	public void reverseStringEmpty() {
		
		String word ="";
		String reversedString  =  reverser.reverse(word );
		assertThat(reversedString).isEmpty();
		
	}
	
	@Test
	public void reverseStringEmpty2() {
		
		String word =" ";
		String reversedString  =  reverser.reverse(word );
		assertThat(reversedString).isEmpty();
		
	}


}
