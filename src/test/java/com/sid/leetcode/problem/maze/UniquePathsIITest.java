package com.sid.leetcode.problem.maze;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.maze.UniquePathsII;

public class UniquePathsIITest {

	private UniquePathsII problem;

	@Before
	public void setUp() throws Exception {
		problem = new UniquePathsII();
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
