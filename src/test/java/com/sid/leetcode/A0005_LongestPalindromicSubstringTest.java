package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0005_LongestPalindromicSubstringTest {

	private A0005_LongestPalindromicSubstring problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0005_LongestPalindromicSubstring();
	}

	@Test
	public void testLongestPalindromeString() throws Exception {
		assertEquals("a", problem.longestPalindrome("a"));
		assertEquals("abcba", problem.longestPalindrome("abcba"));
		assertEquals("abccba", problem.longestPalindrome("abccba"));
		assertEquals("aaaaaaaa", problem.longestPalindrome("aaaaaaaa"));
		assertEquals("aaaa", problem.longestPalindrome("aaaabbbccc"));
	}

}
