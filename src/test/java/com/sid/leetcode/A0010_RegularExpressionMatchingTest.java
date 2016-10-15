package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0010_RegularExpressionMatchingTest {

	private A0010_RegularExpressionMatching problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0010_RegularExpressionMatching();
	}

	@Test
	public void testIsMatch() throws Exception {
		assertFalse(problem.isMatch(null, ".*"));
		assertFalse(problem.isMatch("abc", null));
		assertFalse(problem.isMatch("aa", "a"));
		assertTrue(problem.isMatch("aa", "aa"));
		assertFalse(problem.isMatch("aaa", "aa"));
		assertTrue(problem.isMatch("aa", "a*"));
		assertTrue(problem.isMatch("aa", ".*"));
		assertTrue(problem.isMatch("ab", ".*"));
		assertTrue(problem.isMatch("aab", "c*a*b"));
		assertTrue(problem.isMatch("ccccaab", "c*a*b"));
		assertTrue(problem.isMatch("caab", "c*a*b"));
		assertFalse(problem.isMatch("caab", "c*a*"));
	}

}
