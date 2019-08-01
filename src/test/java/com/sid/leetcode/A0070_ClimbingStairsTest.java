package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0070_ClimbingStairsTest {

	private A0070_ClimbingStairs problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0070_ClimbingStairs();
	}

	@Test
	public void testClimbStairs() throws Exception {
		assertEquals(1, problem.climbStairs(1));
		assertEquals(2, problem.climbStairs(2));
		assertEquals(3, problem.climbStairs(3));
		assertEquals(5, problem.climbStairs(4));
	}

}
