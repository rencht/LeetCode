package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0014_LongestCommonPrefixTest {

	private A0014_LongestCommonPrefix problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0014_LongestCommonPrefix();
	}

	@Test
	public void testLongestCommonPrefix() throws Exception {
		assertEquals("", problem.longestCommonPrefix(new String[] {}));
		assertEquals("abcde", problem.longestCommonPrefix(new String[] { "abcde" }));
		assertEquals("a", problem.longestCommonPrefix(new String[] { "a", "ab", "abc" }));
		assertEquals("ab", problem.longestCommonPrefix(new String[] { "abc", "abx", "abc" }));
		assertEquals("ab", problem.longestCommonPrefix(new String[] { "abc", "abddd", "abcss" }));
	}

}
