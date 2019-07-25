package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0059_SpiralMatrixIITest {

	private A0059_SpiralMatrixII problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0059_SpiralMatrixII();
	}

	@Test
	public void testGenerateMatrix() throws Exception {
		{
			final int[][] result = problem.generateMatrix(3);
			assertEquals(3, result.length);
			assertArrayEquals(new int[] { 1, 2, 3 }, result[0]);
			assertArrayEquals(new int[] { 8, 9, 4 }, result[1]);
			assertArrayEquals(new int[] { 7, 6, 5 }, result[2]);
		}

		{
			final int[][] result = problem.generateMatrix(4);
			assertEquals(4, result.length);
			assertArrayEquals(new int[] { 1, 2, 3, 4 }, result[0]);
			assertArrayEquals(new int[] { 12, 13, 14, 5 }, result[1]);
			assertArrayEquals(new int[] { 11, 16, 15, 6 }, result[2]);
			assertArrayEquals(new int[] { 10, 9, 8, 7 }, result[3]);
		}
	}

}
