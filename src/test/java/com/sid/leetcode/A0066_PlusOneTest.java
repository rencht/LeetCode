package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0066_PlusOneTest {

	private A0066_PlusOne problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0066_PlusOne();
	}

	@Test
	public void testPlusOne() throws Exception {
		assertArrayEquals(new int[] { 1, 2, 4 }, problem.plusOne(new int[] { 1, 2, 3 }));
		assertArrayEquals(new int[] { 4, 3, 2, 2 }, problem.plusOne(new int[] { 4, 3, 2, 1 }));
		assertArrayEquals(new int[] { 1, 0 }, problem.plusOne(new int[] { 9 }));
	}

}
