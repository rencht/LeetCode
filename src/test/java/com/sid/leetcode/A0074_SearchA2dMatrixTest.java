package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0074_SearchA2dMatrixTest {

	private A0074_SearchA2dMatrix problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0074_SearchA2dMatrix();
	}

	@Test
	public void testSearchMatrix() throws Exception {
		assertFalse(problem.searchMatrix(null, 3));
		assertFalse(problem.searchMatrix(new int[][] {}, 3));
		assertTrue(problem.searchMatrix(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } }, 3));
		assertFalse(problem.searchMatrix(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } }, 13));
	}

}
