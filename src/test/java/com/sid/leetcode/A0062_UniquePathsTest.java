package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0062_UniquePathsTest {

	private A0062_UniquePaths problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0062_UniquePaths();
	}

	@Test
	public void testUniquePaths() throws Exception {
		assertEquals(3, problem.uniquePaths(3, 2));
		assertEquals(28, problem.uniquePaths(7, 3));
	}

}
