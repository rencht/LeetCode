package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0064_MinimumPathSumTest {

	private A0064_MinimumPathSum problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0064_MinimumPathSum();
	}

	@Test
	public void testMinPathSum() throws Exception {
		assertEquals(7, problem.minPathSum(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } }));
	}

}
