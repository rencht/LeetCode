package com.sid.leetcode;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0080_RemoveDuplicatesFromSortedArrayIITest {

	private A0080_RemoveDuplicatesFromSortedArrayII problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0080_RemoveDuplicatesFromSortedArrayII();
	}

	@Test
	public void testRemoveDuplicates() throws Exception {
		assertEquals(0, problem.removeDuplicates(new int[] {}));

		{
			final int[] nums = new int[] { 1, 1, 1, 2, 2, 3 };
			assertEquals(5, problem.removeDuplicates(nums));
			assertArrayEquals(new int[] { 1, 1, 2, 2, 3, 3 }, nums);
		}

		{
			final int[] nums = new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
			assertEquals(7, problem.removeDuplicates(nums));
			assertArrayEquals(new int[] { 0, 0, 1, 1, 2, 3, 3, 3, 3 }, nums);
		}
	}

}
