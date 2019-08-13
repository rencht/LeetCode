package com.sid.leetcode.problem.puzzle;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.puzzle.NQueens;

public class NQueensTest {

	private NQueens problem;

	@Before
	public void setUp() throws Exception {
		problem = new NQueens();
	}

	@Test
	public void testSolveNQueens() throws Exception {
		{
			final List<List<String>> result = problem.solveNQueens(4);
			assertEquals(2, result.size());
			assertEquals(Arrays.asList(".Q..", "...Q", "Q...", "..Q."), result.get(0));
			assertEquals(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."), result.get(1));
		}
	}

}
