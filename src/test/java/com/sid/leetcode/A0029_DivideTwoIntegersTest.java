package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0029_DivideTwoIntegersTest {

	private A0029_DivideTwoIntegers problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0029_DivideTwoIntegers();
	}

	@Test
	public void testDivide() throws Exception {
		assertEquals(0 / 1, problem.divide(0, 1));
		assertEquals(10 / 1, problem.divide(10, 1));
		assertEquals(Integer.MIN_VALUE / Integer.MIN_VALUE, problem.divide(Integer.MIN_VALUE, Integer.MIN_VALUE));
		assertEquals(Integer.MAX_VALUE / Integer.MIN_VALUE, problem.divide(Integer.MAX_VALUE, Integer.MIN_VALUE));
		assertEquals(Integer.MAX_VALUE, problem.divide(Integer.MIN_VALUE, -1));

		assertEquals(10 / -2, problem.divide(10, -2));
		assertEquals(10 / -3, problem.divide(10, -3));
		assertEquals(Integer.MIN_VALUE / 15, problem.divide(Integer.MIN_VALUE, 15));
		assertEquals(Integer.MIN_VALUE / -3, problem.divide(Integer.MIN_VALUE, -3));
		assertEquals(Integer.MIN_VALUE / -15, problem.divide(Integer.MIN_VALUE, -15));
		assertEquals(-1010369383 / Integer.MIN_VALUE, problem.divide(-1010369383, Integer.MIN_VALUE));

		assertEquals(-10 / 2, problem.divide(-10, 2));

		assertEquals(10 / 2, problem.divide(10, 2));
		assertEquals(10 / 3, problem.divide(10, 3));
		assertEquals(Integer.MAX_VALUE / 1, problem.divide(Integer.MAX_VALUE, 1));
		assertEquals(Integer.MAX_VALUE / 128, problem.divide(Integer.MAX_VALUE, 128));
		assertEquals(Integer.MAX_VALUE / 123456, problem.divide(Integer.MAX_VALUE, 123456));
	}

}
