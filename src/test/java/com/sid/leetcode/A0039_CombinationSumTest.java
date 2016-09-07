package com.sid.leetcode;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class A0039_CombinationSumTest {

	private A0039_CombinationSum problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0039_CombinationSum();
	}

	@Test
	public void testCombinationSum1() throws Exception {
		{
			List<List<Integer>> combinations = problem.combinationSum1(new int[] { 2, 3, 6, 7 }, 7);
			assertEquals(2, combinations.size());
			assertEquals(Arrays.asList(2, 2, 3), combinations.get(0));
			assertEquals(Arrays.asList(7), combinations.get(1));
		}

		assertTrue(problem.combinationSum1(new int[] { 2, 3, 6, 7 },  1).isEmpty());

		{
			List<List<Integer>> combinations = problem.combinationSum1(new int[] { 1, 2 }, 4);
			assertEquals(3, combinations.size());
			assertEquals(Arrays.asList(1, 1, 1, 1), combinations.get(0));
			assertEquals(Arrays.asList(1, 1, 2), combinations.get(1));
			assertEquals(Arrays.asList(2, 2), combinations.get(2));
		}

		{
			List<List<Integer>> combinations = problem.combinationSum1(new int[] { 1, 2 }, 3);
			assertEquals(2, combinations.size());
			assertEquals(Arrays.asList(1, 1, 1), combinations.get(0));
			assertEquals(Arrays.asList(1, 2), combinations.get(1));
		}

		{
			List<List<Integer>> combinations = problem.combinationSum1(new int[] { 7, 3, 2 }, 18);
			assertEquals(7, combinations.size());
			assertEquals(Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2), combinations.get(0));
			assertEquals(Arrays.asList(2, 2, 2, 2, 2, 2, 3, 3), combinations.get(1));
			assertEquals(Arrays.asList(2, 2, 2, 2, 3, 7), combinations.get(2));
			assertEquals(Arrays.asList(2, 2, 2, 3, 3, 3, 3), combinations.get(3));
			assertEquals(Arrays.asList(2, 2, 7, 7), combinations.get(4));
			assertEquals(Arrays.asList(2, 3, 3, 3, 7), combinations.get(5));
			assertEquals(Arrays.asList(3, 3, 3, 3, 3, 3), combinations.get(6));
		}
	}

	@Test
	public void testCombinationSum2() throws Exception {
		{
			List<List<Integer>> combinations = problem.combinationSum2(new int[] { 2, 3, 6, 7 }, 7);
			assertEquals(2, combinations.size());
			assertEquals(Arrays.asList(2, 2, 3), combinations.get(0));
			assertEquals(Arrays.asList(7), combinations.get(1));
		}

		assertTrue(problem.combinationSum2(new int[] { 2, 3, 6, 7 },  1).isEmpty());

		{
			List<List<Integer>> combinations = problem.combinationSum2(new int[] { 1, 2 }, 4);
			assertEquals(3, combinations.size());
			assertEquals(Arrays.asList(1, 1, 1, 1), combinations.get(0));
			assertEquals(Arrays.asList(1, 1, 2), combinations.get(1));
			assertEquals(Arrays.asList(2, 2), combinations.get(2));
		}

		{
			List<List<Integer>> combinations = problem.combinationSum2(new int[] { 1, 2 }, 3);
			assertEquals(2, combinations.size());
			assertEquals(Arrays.asList(1, 1, 1), combinations.get(0));
			assertEquals(Arrays.asList(1, 2), combinations.get(1));
		}

		{
			List<List<Integer>> combinations = problem.combinationSum2(new int[] { 7, 3, 2 }, 18);
			assertEquals(7, combinations.size());
			assertEquals(Arrays.asList(2, 2, 2, 2, 2, 2, 2, 2, 2), combinations.get(0));
			assertEquals(Arrays.asList(2, 2, 2, 2, 2, 2, 3, 3), combinations.get(1));
			assertEquals(Arrays.asList(2, 2, 2, 2, 3, 7), combinations.get(2));
			assertEquals(Arrays.asList(2, 2, 2, 3, 3, 3, 3), combinations.get(3));
			assertEquals(Arrays.asList(2, 2, 7, 7), combinations.get(4));
			assertEquals(Arrays.asList(2, 3, 3, 3, 7), combinations.get(5));
			assertEquals(Arrays.asList(3, 3, 3, 3, 3, 3), combinations.get(6));
		}
	}

}
