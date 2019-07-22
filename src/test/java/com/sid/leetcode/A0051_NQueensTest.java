package com.sid.leetcode;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class A0051_NQueensTest {

	private A0051_NQueens problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0051_NQueens();
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
