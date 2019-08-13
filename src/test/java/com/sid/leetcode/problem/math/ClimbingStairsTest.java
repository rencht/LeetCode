package com.sid.leetcode.problem.math;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.math.ClimbingStairs;

public class ClimbingStairsTest {

	private ClimbingStairs problem;

	@Before
	public void setUp() throws Exception {
		problem = new ClimbingStairs();
	}

	@Test
	public void testClimbStairs() throws Exception {
		assertEquals(1, problem.climbStairs(1));
		assertEquals(2, problem.climbStairs(2));
		assertEquals(3, problem.climbStairs(3));
		assertEquals(5, problem.climbStairs(4));
	}

}
