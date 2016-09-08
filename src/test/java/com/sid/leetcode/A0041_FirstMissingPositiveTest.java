package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0041_FirstMissingPositiveTest {

	private A0041_FirstMissingPositive problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0041_FirstMissingPositive();
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
