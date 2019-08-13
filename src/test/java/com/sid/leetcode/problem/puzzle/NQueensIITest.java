package com.sid.leetcode.problem.puzzle;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.puzzle.NQueensII;

public class NQueensIITest {

	private NQueensII problem;

	@Before
	public void setUp() throws Exception {
		problem = new NQueensII();
	}

	@Test
	public void testTotalNQueens() throws Exception {
		assertEquals(2, problem.totalNQueens(4));
		assertEquals(10, problem.totalNQueens(5));
		assertEquals(92, problem.totalNQueens(8));
	}

}
