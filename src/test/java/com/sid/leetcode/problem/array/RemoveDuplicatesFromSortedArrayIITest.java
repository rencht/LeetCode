package com.sid.leetcode.problem.array;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.array.RemoveDuplicatesFromSortedArrayII;

public class RemoveDuplicatesFromSortedArrayIITest {

	private RemoveDuplicatesFromSortedArrayII problem;

	@Before
	public void setUp() throws Exception {
		problem = new RemoveDuplicatesFromSortedArrayII();
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
