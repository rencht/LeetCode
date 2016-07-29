package com.sid.leetcode;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class A0017_LetterCombinationsOfAPhoneNumberTest {

	private A0017_LetterCombinationsOfAPhoneNumber problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0017_LetterCombinationsOfAPhoneNumber();
	}

	@Test
	public void testLetterCombinations() throws Exception {
		assertTrue(problem.letterCombinations(null).isEmpty());
		assertTrue(problem.letterCombinations("").isEmpty());
		assertEquals(Arrays.asList("a", "b", "c"), problem.letterCombinations("2"));
		assertEquals(Arrays.asList("ad", "bd", "cd", "ae", "be", "ce", "af", "bf", "cf"), problem.letterCombinations("23"));
	}

}
