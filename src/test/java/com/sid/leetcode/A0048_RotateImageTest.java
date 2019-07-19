package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0048_RotateImageTest {

	private A0048_RotateImage problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0048_RotateImage();
	}

	@Test
	public void testRotate() throws Exception {
		{
			final int[][] matrix = null;
			problem.rotate(matrix);
			assertNull(matrix);
		}

		{
			final int[][] matrix = new int[1][1];
			matrix[0] = new int[] { 1 };
			problem.rotate(matrix);
			assertArrayEquals(new int[] { 1 }, matrix[0]);
		}

		{
			final int[][] matrix = new int[3][3];
			matrix[0] = new int[] { 1, 2, 3 };
			matrix[1] = new int[] { 4, 5, 6 };
			matrix[2] = new int[] { 7, 8, 9 };
			problem.rotate(matrix);
			assertArrayEquals(new int[] { 7, 4, 1 }, matrix[0]);
			assertArrayEquals(new int[] { 8, 5, 2 }, matrix[1]);
			assertArrayEquals(new int[] { 9, 6, 3 }, matrix[2]);
		}

		{
			final int[][] matrix = new int[4][4];
			matrix[0] = new int[] { 5, 1, 9, 11 };
			matrix[1] = new int[] { 2, 4, 8, 10 };
			matrix[2] = new int[] { 13, 3, 6, 7 };
			matrix[3] = new int[] { 15, 14, 12, 16 };
			problem.rotate(matrix);
			assertArrayEquals(new int[] { 15, 13, 2, 5 }, matrix[0]);
			assertArrayEquals(new int[] { 14, 3, 4, 1 }, matrix[1]);
			assertArrayEquals(new int[] { 12, 6, 8, 9 }, matrix[2]);
			assertArrayEquals(new int[] { 16, 7, 10, 11 }, matrix[3]);
		}
	}

}
