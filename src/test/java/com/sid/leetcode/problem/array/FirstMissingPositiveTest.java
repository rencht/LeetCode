package com.sid.leetcode.problem.array;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.array.FirstMissingPositive;

public class FirstMissingPositiveTest {

	private FirstMissingPositive problem;

	@Before
	public void setUp() throws Exception {
		problem = new FirstMissingPositive();
	}

	@Test
	public void testFirstMissingPositive() throws Exception {
		assertEquals(2, problem.firstMissingPositive(new int[] { 1, 1 }));
		assertEquals(3, problem.firstMissingPositive(new int[] { 1, 2, 0 }));
		assertEquals(2, problem.firstMissingPositive(new int[] { 3, 4, -1, 1 }));
		assertEquals(2, problem.firstMissingPositive(new int[] { 3, 5, -1, 1 }));
		assertEquals(4, problem.firstMissingPositive(new int[] { 1, 2, 3 }));
	}

}
