package com.sid.leetcode.problem.search;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.search.MedianOfTwoSortedArrays;

public class MedianOfTwoSortedArraysTest {

	private MedianOfTwoSortedArrays problem;

	@Before
	public void setUp() throws Exception {
		problem = new MedianOfTwoSortedArrays();
	}

	@Test
	public void testFindMedianSortedArrays() throws Exception {
		assertEquals(2, problem.findMedianSortedArrays(new int[] { 1, 3 },  new int[] { 2 }), 0.01);
		assertEquals(2.5, problem.findMedianSortedArrays(new int[] {},  new int[] { 1, 2, 3, 4 }), 0.01);
		assertEquals(2.5, problem.findMedianSortedArrays(new int[] { 1, 2 },  new int[] { 3, 4 }), 0.01);
		assertEquals(2.5, problem.findMedianSortedArrays(new int[] { 3, 4 },  new int[] { 1, 2 }), 0.01);
		assertEquals(2.5, problem.findMedianSortedArrays(new int[] { 1, 3 },  new int[] { 2, 4 }), 0.01);
		assertEquals(4, problem.findMedianSortedArrays(new int[] { 1, 2, 3 },  new int[] { 4, 5, 6, 7 }), 0.01);
		assertEquals(3, problem.findMedianSortedArrays(new int[] { 1, 2, 3 },  new int[] { 3, 5, 6, 7 }), 0.01);
		assertEquals(4, problem.findMedianSortedArrays(new int[] { 1, 2, 4 },  new int[] { 3, 5, 6, 7 }), 0.01);
		assertEquals(4.5, problem.findMedianSortedArrays(new int[] { 1, 2, 3 },  new int[] { 4, 5, 6, 7, 8 }), 0.01);
		assertEquals(4.5, problem.findMedianSortedArrays(new int[] { 6, 7, 8 },  new int[] { 1, 2, 3, 4, 5 }), 0.01);
		assertEquals(4.5, problem.findMedianSortedArrays(new int[] { 1, 4, 8 },  new int[] { 2, 3, 5, 6, 7 }), 0.01);
		assertEquals(4.5, problem.findMedianSortedArrays(new int[] { 2, 3, 5, 6, 7 }, new int[] { 1, 4, 8 }), 0.01);
		assertEquals(5.5, problem.findMedianSortedArrays(new int[] { 5, 6, 7, 8, 9 },  new int[] { 1, 2, 3, 4, 5, 6, 7 }), 0.01);
		assertEquals(5.5, problem.findMedianSortedArrays(new int[] { 1, 2, 3, 6, 7 }, new int[] { 4, 5, 8, 9, 10 }), 0.01);
	}

}
