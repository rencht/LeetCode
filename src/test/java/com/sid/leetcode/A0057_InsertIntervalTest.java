package com.sid.leetcode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0057_InsertIntervalTest {

	private A0057_InsertInterval problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0057_InsertInterval();
	}

	@Test
	public void testInsert() throws Exception {
		{
			final int[][] result = problem.insert(new int[][] {}, new int[] { 2, 5 });
			assertEquals(1, result.length);
			assertArrayEquals(new int[] { 2, 5 }, result[0]);
		}

		{
			final int[][] result = problem.insert(new int[][] { { 1, 3 }, { 6, 9 } }, new int[] { 2, 5 });
			assertEquals(2, result.length);
			assertArrayEquals(new int[] { 1, 5 }, result[0]);
			assertArrayEquals(new int[] { 6, 9 }, result[1]);
		}

		{
			final int[][] result = problem.insert(new int[][] { { 1, 2 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } }, new int[] { 4, 8 });
			assertEquals(3, result.length);
			assertArrayEquals(new int[] { 1, 2 }, result[0]);
			assertArrayEquals(new int[] { 3, 10 }, result[1]);
			assertArrayEquals(new int[] { 12, 16 }, result[2]);
		}
	}

}
