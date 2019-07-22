package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0050_PowTest {

	private A0050_Pow problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0050_Pow();
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
