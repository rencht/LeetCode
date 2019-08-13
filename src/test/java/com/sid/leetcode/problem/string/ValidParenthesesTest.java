package com.sid.leetcode.problem.string;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.string.ValidParentheses;

public class ValidParenthesesTest {

	private ValidParentheses problem;

	@Before
	public void setUp() throws Exception {
		problem = new ValidParentheses();
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
