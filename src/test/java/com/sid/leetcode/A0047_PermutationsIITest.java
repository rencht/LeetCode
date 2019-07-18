package com.sid.leetcode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class A0047_PermutationsIITest {

	private A0047_PermutationsII problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0047_PermutationsII();
	}

	@Test
	public void testPermute() throws Exception {
		assertNull(problem.permuteUnique(null));

		{
			final List<List<Integer>> result = problem.permuteUnique(new int[] { 1 });
			assertEquals(1, result.size());
			assertEquals(Arrays.asList(1), result.get(0));
		}

		{
			final List<List<Integer>> result = problem.permuteUnique(new int[] { 1, 1, 2 });
			assertEquals(3, result.size());
			assertEquals(Arrays.asList(1, 1, 2), result.get(0));
			assertEquals(Arrays.asList(1, 2, 1), result.get(1));
			assertEquals(Arrays.asList(2, 1, 1), result.get(2));
		}
	}

}
