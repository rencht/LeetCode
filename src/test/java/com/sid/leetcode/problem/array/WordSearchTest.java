package com.sid.leetcode.problem.array;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.array.WordSearch;

public class WordSearchTest {

	private WordSearch problem;

	@Before
	public void setUp() throws Exception {
		problem = new WordSearch();
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
