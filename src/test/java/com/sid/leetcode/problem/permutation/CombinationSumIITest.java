package com.sid.leetcode.problem.permutation;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.permutation.CombinationSumII;

public class CombinationSumIITest {

	private CombinationSumII problem;

	@Before
	public void setUp() throws Exception {
		problem = new CombinationSumII();
	}

	@Test
	public void testCombinationSum2() throws Exception {
		{
			List<List<Integer>> combinations = problem.combinationSum2(new int[] { 2, 3, 6, 7 }, 7);
			assertEquals(1, combinations.size());
			assertEquals(Arrays.asList(7), combinations.get(0));
		}

		assertTrue(problem.combinationSum2(new int[] { 2, 3, 6, 7 },  1).isEmpty());
		assertTrue(problem.combinationSum2(new int[] { 1, 2 }, 4).isEmpty());
		assertTrue(problem.combinationSum2(new int[] { 7, 3, 2 }, 18).isEmpty());

		{
			List<List<Integer>> combinations = problem.combinationSum2(new int[] { 1, 2 }, 3);
			assertEquals(1, combinations.size());
			assertEquals(Arrays.asList(1, 2), combinations.get(0));
		}

		{
			List<List<Integer>> combinations = problem.combinationSum2(new int[] { 10, 1, 2, 7, 6, 1, 5 }, 8);
			assertEquals(4, combinations.size());
			assertEquals(Arrays.asList(1, 1, 6), combinations.get(0));
			assertEquals(Arrays.asList(1, 2, 5), combinations.get(1));
			assertEquals(Arrays.asList(1, 7), combinations.get(2));
			assertEquals(Arrays.asList(2, 6), combinations.get(3));
		}
	}

}
