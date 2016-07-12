package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LongestSubstringWithoutRepeatingCharactersTest {

	private LongestSubstringWithoutRepeatingCharacters problem;

	@Before
	public void setUp() throws Exception {
		problem = new LongestSubstringWithoutRepeatingCharacters();
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
