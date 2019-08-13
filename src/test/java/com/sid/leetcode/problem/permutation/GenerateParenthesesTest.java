package com.sid.leetcode.problem.permutation;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.permutation.GenerateParentheses;

public class GenerateParenthesesTest {

	private GenerateParentheses problem;

	@Before
	public void setUp() throws Exception {
		problem = new GenerateParentheses();
	}

	@Test
	public void testGenerateParenthesis() throws Exception {
		assertTrue(problem.generateParenthesis(0).isEmpty());
		assertEquals(Arrays.asList("()"), problem.generateParenthesis(1));
		assertEquals(Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()"), problem.generateParenthesis(3));
		assertEquals(Arrays.asList("(((())))", "((()()))", "((())())", "((()))()", "(()(()))", "(()()())", "(()())()", "(())(())", "(())()()", "()((()))", "()(()())", "()(())()", "()()(())", "()()()()"), problem.generateParenthesis(4));
	}

}
