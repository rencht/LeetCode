package com.sid.leetcode.problem.array;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.array.SortColors;

public class SortColorsTest {

	private SortColors problem;

	@Before
	public void setUp() throws Exception {
		problem = new SortColors();
	}

	@Test
	public void testSortColors() throws Exception {
		{
			final int[] nums = new int[] { 2, 0, 2, 1, 1, 0 };
			problem.sortColors(nums);
			assertArrayEquals(new int[] { 0, 0, 1, 1, 2, 2 }, nums);
		}
	}

}
