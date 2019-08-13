package com.sid.leetcode.problem.regex;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.regex.WildcardMatching;

public class WildcardMatchingTest {

	private WildcardMatching problem;

	@Before
	public void setUp() throws Exception {
		problem = new WildcardMatching();
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
