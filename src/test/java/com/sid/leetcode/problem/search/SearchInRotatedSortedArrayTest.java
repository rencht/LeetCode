package com.sid.leetcode.problem.search;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.search.SearchInRotatedSortedArray;

public class SearchInRotatedSortedArrayTest {

	private SearchInRotatedSortedArray problem;

	@Before
	public void setUp() throws Exception {
		problem = new SearchInRotatedSortedArray();
	}

	@Test
	public void testSearchIntArrayInt() throws Exception {
		assertEquals(0, problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 4));
		assertEquals(1, problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 5));
		assertEquals(2, problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 6));
		assertEquals(3, problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 7));
		assertEquals(4, problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 0));
		assertEquals(5, problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 1));
		assertEquals(6, problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 2));
		assertEquals(-1, problem.search(new int [] { 4, 5, 6, 7, 0, 1, 2 }, 3));

		assertEquals(0, problem.search(new int [] { 5, 1, 3 }, 5));
		assertEquals(1, problem.search(new int [] { 5, 1, 3 }, 1));
		assertEquals(2, problem.search(new int [] { 5, 1, 3 }, 3));
		assertEquals(-1, problem.search(new int [] { 5, 1, 3 }, 4));

		assertEquals(0, problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 4));
		assertEquals(1, problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 5));
		assertEquals(2, problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 6));
		assertEquals(3, problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 7));
		assertEquals(4, problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 8));
		assertEquals(5, problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 1));
		assertEquals(6, problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 2));
		assertEquals(7, problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 3));
		assertEquals(-1, problem.search(new int[] { 4, 5, 6, 7, 8, 1, 2, 3 }, 9));

		assertEquals(2, problem.search(new int[] { 8, 1, 2, 3, 4, 5, 6 }, 2));
	}

}
