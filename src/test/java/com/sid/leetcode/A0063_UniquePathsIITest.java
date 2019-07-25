package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0063_UniquePathsIITest {

	private A0063_UniquePathsII problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0063_UniquePathsII();
	}

	@Test
	public void testUniquePathsWithObstacles() throws Exception {
		assertEquals(2, problem.uniquePathsWithObstacles(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }));
		assertEquals(0, problem.uniquePathsWithObstacles(new int[][] { { 0, 1 } }));
		assertEquals(0, problem.uniquePathsWithObstacles(new int[][] { { 1, 0 } }));
		assertEquals(0, problem.uniquePathsWithObstacles(new int[][] { { 1 }, { 0 } }));
		assertEquals(0, problem.uniquePathsWithObstacles(new int[][] { { 0 }, { 1 } }));
	}

}
