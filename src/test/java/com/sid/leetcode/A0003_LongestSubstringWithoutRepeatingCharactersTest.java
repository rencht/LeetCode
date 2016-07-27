package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0003_LongestSubstringWithoutRepeatingCharactersTest {

	private A0003_LongestSubstringWithoutRepeatingCharacters problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0003_LongestSubstringWithoutRepeatingCharacters();
	}

	@Test
	public void testLengthOfLongestSubstring() throws Exception {
		assertEquals(3, problem.lengthOfLongestSubstring("abcabcbb"));
		assertEquals(1, problem.lengthOfLongestSubstring("bbbbb"));
		assertEquals(3, problem.lengthOfLongestSubstring("pwwkew"));
		assertEquals(7, problem.lengthOfLongestSubstring("abcdefg"));
		assertEquals(4, problem.lengthOfLongestSubstring("abcdcba"));
		assertEquals(11, problem.lengthOfLongestSubstring("aaaabcdefghijk"));
	}

}
