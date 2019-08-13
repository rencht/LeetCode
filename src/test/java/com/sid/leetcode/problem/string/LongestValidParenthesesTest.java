package com.sid.leetcode.problem.string;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.string.LongestValidParentheses;

public class LongestValidParenthesesTest {

	private LongestValidParentheses problem;

	@Before
	public void setUp() throws Exception {
		problem = new LongestValidParentheses();
	}

	@Test
	public void testLongestValidParentheses() throws Exception {
		assertEquals(0, problem.longestValidParentheses(""));
		assertEquals(2, problem.longestValidParentheses("(()"));
		assertEquals(4, problem.longestValidParentheses(")()())"));
		assertEquals(6, problem.longestValidParentheses("(()))))((()))"));
		assertEquals(6, problem.longestValidParentheses("()(())"));
		assertEquals(8, problem.longestValidParentheses("((()((())((((())))"));
		assertEquals(14, problem.longestValidParentheses("((()((())((((()))))"));
	}

	@Test
	public void testLongestValidParenthesesStack() throws Exception {
		assertEquals(0, problem.longestValidParenthesesStack(""));
		assertEquals(2, problem.longestValidParenthesesStack("(()"));
		assertEquals(4, problem.longestValidParenthesesStack(")()())"));
		assertEquals(6, problem.longestValidParenthesesStack("(()))))((()))"));
		assertEquals(6, problem.longestValidParenthesesStack("()(())"));
		assertEquals(8, problem.longestValidParenthesesStack("((()((())((((())))"));
		assertEquals(14, problem.longestValidParenthesesStack("((()((())((((()))))"));
	}

}
