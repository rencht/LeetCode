package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0034_SearchForARangeTest {

	private A0034_SearchForARange problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0034_SearchForARange();
	}

	@Test
	public void testSearchRangeIntArrayInt() throws Exception {
		assertArrayEquals(new int[] { -1, -1 }, problem.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 1));
		assertArrayEquals(new int[] { 0, 0 }, problem.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 5));
		assertArrayEquals(new int[] { 1, 2 }, problem.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 7));
		assertArrayEquals(new int[] { 3, 4 }, problem.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 8));
		assertArrayEquals(new int[] { 5, 5 }, problem.searchRange(new int[] { 5, 7, 7, 8, 8, 10 }, 10));

		assertArrayEquals(new int[] { 0, 4 }, problem.searchRange(new int[] { 7, 7, 7, 7, 7 }, 7));
		assertArrayEquals(new int[] { 3, 3 }, problem.searchRange(new int[] { 7, 7, 7, 8, 9, 9, 9 }, 8));
	}

}
