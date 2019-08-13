package com.sid.leetcode.problem.math;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.math.Sqrt;

public class SqrtTest {

	private Sqrt problem;

	@Before
	public void setUp() throws Exception {
		problem = new Sqrt();
	}

	@Test
	public void testMySqrt() throws Exception {
		assertEquals(0, problem.mySqrt(0));
		assertEquals(2, problem.mySqrt(4));
		assertEquals(2, problem.mySqrt(8));
	}

}
