package com.sid.leetcode.problem.sum;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.sum.ThreeSum;

public class ThreeSumTest {

	private ThreeSum problem;

	@Before
	public void setUp() throws Exception {
		problem = new ThreeSum();
	}

	@Test
	public void testThreeSum() throws Exception {
		assertTrue(problem.threeSum(new int[] { -1, 0 }).isEmpty());
		assertTrue(problem.threeSum(new int[] { 1, 2, 3 }).isEmpty());
		assertTrue(problem.threeSum(new int[] { -6, -1, -1, -1, -1, 4 }).isEmpty());

		{
			List<List<Integer>> threeSums = problem.threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
			assertEquals(2, threeSums.size());
			assertTrue(threeSums.contains(Arrays.asList(-1, 0, 1)));
			assertTrue(threeSums.contains(Arrays.asList(-1, -1, 2)));
		}

		{
			List<List<Integer>> threeSums = problem.threeSum(new int[] { -1, -1, -1, 0, 0, 0, 1, 1, 1, 1 });
			assertEquals(2, threeSums.size());
			assertTrue(threeSums.contains(Arrays.asList(-1, 0, 1)));
			assertTrue(threeSums.contains(Arrays.asList(0, 0, 0)));
		}

		{
			List<List<Integer>> threeSums = problem.threeSum(new int[] { -6, -2, -1, -1, -1, 3 });
			assertEquals(1, threeSums.size());
			assertTrue(threeSums.contains(Arrays.asList(-2, -1, 3)));
		}
	}

}
