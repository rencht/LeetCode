package com.sid.leetcode.problem.sum;

import static org.junit.Assert.*;

import org.junit.*;

import com.sid.leetcode.problem.sum.TwoSum;

public class TwoSumTest {

	private TwoSum problem;

	@Before
	public void setUp() throws Exception {
		problem = new TwoSum();
	}

	@Test
	public void testTwoSum() throws Exception {
		assertArrayEquals(new int[] { 0, 1 }, problem.twoSum(new int[] { 2, 7, 11, 15 }, 9));
		assertArrayEquals(new int[] { 0, 3 }, problem.twoSum(new int[] { 1, 2, 2, 1 }, 2));

		assertNull(problem.twoSum(new int[] { 2, 7, 11, 15 }, 1));
	}

}
