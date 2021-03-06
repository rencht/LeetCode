package com.sid.leetcode.problem.array;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.array.ContainerWithMostWater;

public class ContainerWithMostWaterTest {

	private ContainerWithMostWater problem;

	@Before
	public void setUp() throws Exception {
		problem = new ContainerWithMostWater();
	}

	@Test
	public void testMaxArea() throws Exception {
		assertEquals(0, problem.maxArea(new int[] { 0, 1 }));
		assertEquals(4, problem.maxArea(new int[] { 0, 1, 2, 3, 2, 1 }));
	}

}
