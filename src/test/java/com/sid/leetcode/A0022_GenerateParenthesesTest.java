package com.sid.leetcode;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class A0022_GenerateParenthesesTest {

	private A0022_GenerateParentheses problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0022_GenerateParentheses();
	}

	@Test
	public void testGenerateParenthesis() throws Exception {
		assertTrue(problem.generateParenthesis(0).isEmpty());
		assertEquals(Arrays.asList("()"), problem.generateParenthesis(1));
		assertEquals(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"), problem.generateParenthesis(3));
		assertEquals(Arrays.asList("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()"), problem.generateParenthesis(4));
	}

}
