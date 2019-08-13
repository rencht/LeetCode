package com.sid.leetcode.problem.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.array.MaximumSubarray;

public class MaximumSubarrayTest {

	private MaximumSubarray problem;

	@Before
	public void setUp() throws Exception {
		problem = new MaximumSubarray();
	}

	@Test
	public void testMaxSubArray() throws Exception {
		assertEquals(6, problem.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
	}

}
