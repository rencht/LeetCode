package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0069_SqrtTest {

	private A0069_Sqrt problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0069_Sqrt();
	}

	@Test
	public void testMySqrt() throws Exception {
		assertEquals(0, problem.mySqrt(0));
		assertEquals(2, problem.mySqrt(4));
		assertEquals(2, problem.mySqrt(8));
	}

}
