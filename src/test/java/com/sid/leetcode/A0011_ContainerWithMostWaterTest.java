package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0011_ContainerWithMostWaterTest {

	private A0011_ContainerWithMostWater problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0011_ContainerWithMostWater();
	}

	@Test
	public void testMaxArea() throws Exception {
		assertEquals(0, problem.maxArea(new int[] { 0, 1 }));
		assertEquals(4, problem.maxArea(new int[] { 0, 1, 2, 3, 2, 1 }));
	}

}
