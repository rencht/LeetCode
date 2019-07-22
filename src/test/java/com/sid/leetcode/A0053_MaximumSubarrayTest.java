package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0053_MaximumSubarrayTest {

	private A0053_MaximumSubarray problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0053_MaximumSubarray();
	}

	@Test
	public void testMaxSubArray() throws Exception {
		assertEquals(6, problem.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}

}
