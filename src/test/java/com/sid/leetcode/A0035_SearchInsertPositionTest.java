package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0035_SearchInsertPositionTest {

	private A0035_SearchInsertPosition problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0035_SearchInsertPosition();
	}

	@Test
	public void testSearchInsert() throws Exception {
		assertEquals(2, problem.searchInsert(new int[] { 1, 3, 5, 6 }, 5));
		assertEquals(1, problem.searchInsert(new int[] { 1, 3, 5, 6 }, 2));
		assertEquals(4, problem.searchInsert(new int[] { 1, 3, 5, 6 }, 7));
		assertEquals(0, problem.searchInsert(new int[] { 1, 3, 5, 6 }, 0));

		assertEquals(0, problem.searchInsert(new int[] { 1, 3 }, 0));
		assertEquals(0, problem.searchInsert(new int[] { 1, 3 }, 1));
		assertEquals(1, problem.searchInsert(new int[] { 1, 3 }, 2));
		assertEquals(1, problem.searchInsert(new int[] { 1, 3 }, 3));
		assertEquals(2, problem.searchInsert(new int[] { 1, 3 }, 4));

		assertEquals(1, problem.searchInsert(new int[] { 1, 2, 3 }, 2));
	}

}
