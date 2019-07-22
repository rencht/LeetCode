package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0052_NQueensIITest {

	private A0052_NQueensII problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0052_NQueensII();
	}

	@Test
	public void testTotalNQueens() throws Exception {
		assertEquals(2, problem.totalNQueens(4));
		assertEquals(10, problem.totalNQueens(5));
		assertEquals(92, problem.totalNQueens(8));
	}

}
