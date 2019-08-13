package com.sid.leetcode.problem.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.array.TrappingRainWater;

public class TrappingRainWaterTest {

	private TrappingRainWater problem;

	@Before
	public void setUp() throws Exception {
		problem = new TrappingRainWater();
	}

	@Test
	public void testTrap() throws Exception {
		assertEquals(0, problem.trap(new int[] { 1, 1 }));
		assertEquals(2, problem.trap(new int[] { 2, 0, 0, 1 }));
		assertEquals(6, problem.trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
		assertEquals(7, problem.trap(new int[] { 1, 0, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));
	}

}
