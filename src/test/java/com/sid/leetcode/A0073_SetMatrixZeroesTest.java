package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0073_SetMatrixZeroesTest {

	private A0073_SetMatrixZeroes problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0073_SetMatrixZeroes();
	}

	@Test
	public void testSetZeroes() throws Exception {
		{
			final int[][] matrix = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
			problem.setZeroes(matrix);
			assertEquals(3, matrix.length);
			assertArrayEquals(new int[] { 1, 0, 1 }, matrix[0]);
			assertArrayEquals(new int[] { 0, 0, 0 }, matrix[1]);
			assertArrayEquals(new int[] { 1, 0, 1 }, matrix[2]);
		}

		{
			final int[][] matrix = new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
			problem.setZeroes(matrix);
			assertEquals(3, matrix.length);
			assertArrayEquals(new int[] { 0, 0, 0, 0 }, matrix[0]);
			assertArrayEquals(new int[] { 0, 4, 5, 0 }, matrix[1]);
			assertArrayEquals(new int[] { 0, 3, 1, 0 }, matrix[2]);
		}
	}

}
