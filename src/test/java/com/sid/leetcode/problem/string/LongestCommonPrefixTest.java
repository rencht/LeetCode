package com.sid.leetcode.problem.string;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.string.LongestCommonPrefix;

public class LongestCommonPrefixTest {

	private LongestCommonPrefix problem;

	@Before
	public void setUp() throws Exception {
		problem = new LongestCommonPrefix();
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
