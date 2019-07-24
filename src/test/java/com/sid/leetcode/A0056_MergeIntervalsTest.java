package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0056_MergeIntervalsTest {

	private A0056_MergeIntervals problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0056_MergeIntervals();
	}

	@Test
	public void testMerge() throws Exception {
		{
			final int[][] result = problem.merge(new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } });
			assertEquals(3, result.length);
			assertArrayEquals(new int[] { 1, 6 }, result[0]);
			assertArrayEquals(new int[] { 8, 10 }, result[1]);
			assertArrayEquals(new int[] { 15, 18 }, result[2]);
		}

		{
			final int[][] result = problem.merge(new int[][] { { 1, 4 }, { 4, 5 } });
			assertEquals(1, result.length);
			assertArrayEquals(new int[] { 1, 5 }, result[0]);
		}

		{
			final int[][] result = problem.merge(new int[][] { { 4, 5 }, { 1, 4 } });
			assertEquals(1, result.length);
			assertArrayEquals(new int[] { 1, 5 }, result[0]);
		}

		{
			final int[][] result = problem.merge(new int[][] { { 1, 5 }, { 1, 4 } });
			assertEquals(1, result.length);
			assertArrayEquals(new int[] { 1, 5 }, result[0]);
		}

		{
			final int[][] result = problem.merge(new int[][] { { 1, 4 }, { 1, 5 } });
			assertEquals(1, result.length);
			assertArrayEquals(new int[] { 1, 5 }, result[0]);
		}

		{
			final int[][] result = problem.merge(new int[][] { { 1, 5 } });
			assertEquals(1, result.length);
			assertArrayEquals(new int[] { 1, 5 }, result[0]);
		}

		{
			final int[][] result = problem.merge(new int[][] { { 1, 4 }, { 2, 3 } });
			assertEquals(1, result.length);
			assertArrayEquals(new int[] { 1, 4 }, result[0]);
		}
	}

}
