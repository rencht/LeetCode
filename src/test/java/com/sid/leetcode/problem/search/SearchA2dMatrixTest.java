package com.sid.leetcode.problem.search;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.search.SearchA2dMatrix;

public class SearchA2dMatrixTest {

	private SearchA2dMatrix problem;

	@Before
	public void setUp() throws Exception {
		problem = new SearchA2dMatrix();
	}

	@Test
	public void testSearchMatrix() throws Exception {
		assertFalse(problem.searchMatrix(null, 3));
		assertFalse(problem.searchMatrix(new int[][] {}, 3));
		assertTrue(problem.searchMatrix(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } }, 3));
		assertFalse(problem.searchMatrix(new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } }, 13));
	}

}
