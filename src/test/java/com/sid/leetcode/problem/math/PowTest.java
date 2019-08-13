package com.sid.leetcode.problem.math;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.math.Pow;

public class PowTest {

	private Pow problem;

	@Before
	public void setUp() throws Exception {
		problem = new Pow();
	}

	@Test
	public void testMyPow() throws Exception {
		assertEquals(1, problem.myPow(2.00000, 0), 0);
		assertEquals(2.00000, problem.myPow(2.00000, 1), 0);
		assertEquals(0.50000, problem.myPow(2.00000, -1), 0);
		assertEquals(1024.00000, problem.myPow(2.00000, 10), 0);
		assertEquals(9.26100, problem.myPow(2.10000, 3), 0.00001);
		assertEquals(0.25000, problem.myPow(2.00000, -2), 0);
		assertEquals(0.12500, problem.myPow(2.00000, -3), 0);
	}

}
