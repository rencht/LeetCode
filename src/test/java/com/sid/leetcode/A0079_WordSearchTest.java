package com.sid.leetcode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class A0079_WordSearchTest {

	private A0079_WordSearch problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0079_WordSearch();
	}

	@Test
	public void testExistCharArrayArrayString() throws Exception {
		assertFalse(problem.exist(new char[][] {}, "A"));

		final char[][] board = new char[][] { "ABCE".toCharArray(), "SFCS".toCharArray(), "ADEE".toCharArray() };
		assertTrue(problem.exist(board, "ABCCED"));
		assertTrue(problem.exist(board, "SEE"));
		assertFalse(problem.exist(board, "ABCB"));
		assertFalse(problem.exist(board, "BFB"));
		assertTrue(problem.exist(board, "SE"));
		assertFalse(problem.exist(board, "ECE"));
	}

}
