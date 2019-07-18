package com.sid.leetcode;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class A0046_PermutationsTest {

	private A0046_Permutations problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0046_Permutations();
	}

	@Test
	public void testPermute() throws Exception {
		assertNull(problem.permute(null));

		{
			final List<List<Integer>> result = problem.permute(new int[] { 1 });
			assertEquals(1, result.size());
			assertEquals(Arrays.asList(1), result.get(0));
		}

		{
			final List<List<Integer>> result = problem.permute(new int[] { 1, 2, 3 });
			assertEquals(6, result.size());
			assertEquals(Arrays.asList(1, 2, 3), result.get(0));
			assertEquals(Arrays.asList(1, 3, 2), result.get(1));
			assertEquals(Arrays.asList(2, 1, 3), result.get(2));
			assertEquals(Arrays.asList(2, 3, 1), result.get(3));
			assertEquals(Arrays.asList(3, 1, 2), result.get(4));
			assertEquals(Arrays.asList(3, 2, 1), result.get(5));
		}
	}

}
