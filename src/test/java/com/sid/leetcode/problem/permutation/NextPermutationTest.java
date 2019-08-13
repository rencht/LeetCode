package com.sid.leetcode.problem.permutation;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.permutation.NextPermutation;

public class NextPermutationTest {

	private NextPermutation problem;

	@Before
	public void setUp() throws Exception {
		problem = new NextPermutation();
	}

	@Test
	public void testNextPermutation() throws Exception {
		{
			int[] nums = { 1, 2, 3 };
			problem.nextPermutation(nums);
			assertArrayEquals(new int[] { 1, 3, 2 }, nums);
		}

		{
			int[] nums = { 3, 2, 1 };
			problem.nextPermutation(nums);
			assertArrayEquals(new int[] { 1, 2, 3 }, nums);
		}

		{
			int[] nums = { 1, 1, 5 };
			problem.nextPermutation(nums);
			assertArrayEquals(new int[] { 1, 5, 1 }, nums);
		}

		{
			int[] nums = { 1, 4, 3, 2, 0, 0 };
			problem.nextPermutation(nums);
			assertArrayEquals(new int[] { 2, 0, 0, 1, 3, 4 }, nums);
		}
	}

}
