package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0020_ValidParenthesesTest {

	private A0020_ValidParentheses problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0020_ValidParentheses();
	}

	@Test
	public void testIsValid() throws Exception {
		assertTrue(problem.isValid(""));
		assertTrue(problem.isValid("()"));
		assertTrue(problem.isValid("()[]{}"));
		assertFalse(problem.isValid(")"));
		assertFalse(problem.isValid("))"));
		assertFalse(problem.isValid("(]"));
		assertFalse(problem.isValid("([)]"));
		assertFalse(problem.isValid("()[]("));
	}

}
