package com.sid.leetcode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class A0044_WildcardMatchingTest {

	private A0044_WildcardMatching problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0044_WildcardMatching();
	}

	@Test
	public void testIsMatch() throws Exception {
		assertFalse(problem.isMatch(null, "*"));
		assertFalse(problem.isMatch("abc", null));
		assertFalse(problem.isMatch("aa", "a"));
		assertTrue(problem.isMatch("aa", "*"));
		assertFalse(problem.isMatch("cb", "?a"));
		assertTrue(problem.isMatch("adceb", "*a*b"));
		assertFalse(problem.isMatch("acdcb", "a*c?b"));
		assertTrue(problem.isMatch("abc", "abc*"));
	}

}
