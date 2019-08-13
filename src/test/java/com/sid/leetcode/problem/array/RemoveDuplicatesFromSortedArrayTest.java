package com.sid.leetcode.problem.array;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.array.RemoveDuplicatesFromSortedArray;

public class RemoveDuplicatesFromSortedArrayTest {

	private RemoveDuplicatesFromSortedArray problem;

	@Before
	public void setUp() throws Exception {
		problem = new RemoveDuplicatesFromSortedArray();
	}

	@Test
	public void testRemoveDuplicates() throws Exception {
		assertEquals(0, problem.removeDuplicates(null));
		assertEquals(0, problem.removeDuplicates(new int[] {}));

		{
			int[] ints = new int[] { 1, 2, 3 };
			assertEquals(3, problem.removeDuplicates(ints));
			assertArrayEquals(new int[] { 1, 2, 3 }, ints);
		}

		{
			int[] ints = new int[] { 1, 1, 2 };
			assertEquals(2, problem.removeDuplicates(ints));
			assertArrayEquals(new int[] { 1, 2, 2 }, ints);
		}
	}

}
