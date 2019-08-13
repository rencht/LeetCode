package com.sid.leetcode.problem.maze;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.maze.UniquePaths;

public class UniquePathsTest {

	private UniquePaths problem;

	@Before
	public void setUp() throws Exception {
		problem = new UniquePaths();
	}

	@Test
	public void testUniquePaths() throws Exception {
		assertEquals(3, problem.uniquePaths(3, 2));
		assertEquals(28, problem.uniquePaths(7, 3));
	}

}
