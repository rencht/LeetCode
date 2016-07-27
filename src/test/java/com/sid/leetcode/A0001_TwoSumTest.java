package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.*;

public class A0001_TwoSumTest {

	private A0001_TwoSum problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0001_TwoSum();
	}

	@Test
	public void testTwoSum() throws Exception {
		assertArrayEquals(new int[] { 0, 1 }, problem.twoSum(new int[] { 2, 7, 11, 15 }, 9));
		assertArrayEquals(new int[] { 0, 3 }, problem.twoSum(new int[] { 1, 2, 2, 1 }, 2));
	}

}
