package com.sid.leetcode.problem.permutation;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.permutation.LetterCombinationsOfAPhoneNumber;

public class LetterCombinationsOfAPhoneNumberTest {

	private LetterCombinationsOfAPhoneNumber problem;

	@Before
	public void setUp() throws Exception {
		problem = new LetterCombinationsOfAPhoneNumber();
	}

	@Test
	public void testLetterCombinations() throws Exception {
		assertTrue(problem.letterCombinations(null).isEmpty());
		assertTrue(problem.letterCombinations("").isEmpty());
		assertEquals(Arrays.asList("a", "b", "c"), problem.letterCombinations("2"));
		assertEquals(Arrays.asList("ad", "bd", "cd", "ae", "be", "ce", "af", "bf", "cf"), problem.letterCombinations("23"));
	}

}
