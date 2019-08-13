package com.sid.leetcode.problem.maze;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.maze.MinimumPathSum;

public class MinimumPathSumTest {

	private MinimumPathSum problem;

	@Before
	public void setUp() throws Exception {
		problem = new MinimumPathSum();
	}

	@Test
	public void testMinPathSum() throws Exception {
		assertEquals(7, problem.minPathSum(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } }));
	}

}
