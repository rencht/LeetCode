package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0081_SearchInRotatedSortedArrayIITest {

	private A0081_SearchInRotatedSortedArrayII problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0081_SearchInRotatedSortedArrayII();
	}

	@Test
	public void testSearchIntArrayInt() throws Exception {
		assertTrue(problem.search(new int[] { 2, 5, 6, 0, 0, 1, 2 }, 0));
		assertFalse(problem.search(new int[] { 2, 5, 6, 0, 0, 1, 2 }, 3));
		assertTrue(problem.search(new int[] { 1, 1, 3, 1 }, 3));
		assertTrue(problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 4));
		assertTrue(problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 5));
		assertTrue(problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 6));
		assertTrue(problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 7));
		assertTrue(problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 0));
		assertTrue(problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 1));
		assertTrue(problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 2));
		assertFalse(problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 3));
		assertTrue(problem.search(new int [] { 5, 1, 3 }, 5));
		assertTrue(problem.search(new int [] { 5, 1, 3 }, 1));
		assertTrue(problem.search(new int [] { 5, 1, 3 }, 3));
		assertFalse(problem.search(new int [] { 5, 1, 3 }, 4));
		assertTrue(problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 4));
		assertTrue(problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 5));
		assertTrue(problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 6));
		assertTrue(problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 7));
		assertTrue(problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 8));
		assertTrue(problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 1));
		assertTrue(problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 2));
		assertTrue(problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 3));
		assertFalse(problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 9));
		assertTrue(problem.search(new int[] { 8, 1, 2, 3, 4, 5, 6 }, 2));
	}

}
