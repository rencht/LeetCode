package com.sid.leetcode.problem.sum;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.sum.FourSum;

public class FourSumTest {

	private FourSum problem;

	@Before
	public void setUp() throws Exception {
		problem = new FourSum();
	}

	@Test
	public void testFourSum() throws Exception {
		assertTrue(problem.fourSum(new int[] { -1, 0 }, 1).isEmpty());
		assertTrue(problem.fourSum(new int[] { 0, 0, 0, 0, 2, 2 }, -1).isEmpty());

		{
			List<List<Integer>> fourSums = problem.fourSum(new int[] { 1, 0, -1, 0, -2, -2, 2 }, 0);
			assertEquals(3, fourSums.size());
			assertTrue(fourSums.contains(Arrays.asList(-1, 0, 0, 1)));
			assertTrue(fourSums.contains(Arrays.asList(-2, -1, 1, 2)));
			assertTrue(fourSums.contains(Arrays.asList(-2, 0, 0, 2)));
		}

		{
			List<List<Integer>> fourSums = problem.fourSum(new int[] { -2, -2, -1, 0, 0, 0, 0 }, 0);
			assertEquals(1, fourSums.size());
			assertTrue(fourSums.contains(Arrays.asList(0, 0, 0, 0)));
		}

		{
			List<List<Integer>> fourSums = problem.fourSum(new int[] { 0, 0, 0, 0, 0, 0, 0 }, 0);
			assertEquals(1, fourSums.size());
			assertTrue(fourSums.contains(Arrays.asList(0, 0, 0, 0)));
		}

		{
			List<List<Integer>> fourSums = problem.fourSum(new int[] { 0, 0, 0, 1, 1, 1, 1, 1, 1 }, 1);
			assertEquals(1, fourSums.size());
			assertTrue(fourSums.contains(Arrays.asList(0, 0, 0, 1)));
		}

		{
			List<List<Integer>> fourSums = problem.fourSum(new int[] { 1, -2, -5, -4, -3, 3, 3, 5 }, -11);
			assertEquals(1, fourSums.size());
			assertTrue(fourSums.contains(Arrays.asList(-5, -4, -3, 1)));
		}
	}

}
