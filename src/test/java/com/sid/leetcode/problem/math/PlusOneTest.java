package com.sid.leetcode.problem.math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.math.PlusOne;

public class PlusOneTest {

	private PlusOne problem;

	@Before
	public void setUp() throws Exception {
		problem = new PlusOne();
	}

	@Test
	public void testPlusOne() throws Exception {
		assertArrayEquals(new int[] { 1, 2, 4 }, problem.plusOne(new int[] { 1, 2, 3 }));
		assertArrayEquals(new int[] { 4, 3, 2, 2 }, problem.plusOne(new int[] { 4, 3, 2, 1 }));
		assertArrayEquals(new int[] { 1, 0 }, problem.plusOne(new int[] { 9 }));
	}

}
