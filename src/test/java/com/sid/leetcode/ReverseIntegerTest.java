package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseIntegerTest {

	private ReverseInteger problem;

	@Before
	public void setUp() throws Exception {
		problem = new ReverseInteger();
	}

	@Test
	public void testReverse() throws Exception {
		assertEquals(ReverseInteger.OVERFLOW, problem.reverse(Integer.MIN_VALUE));
		assertEquals(ReverseInteger.OVERFLOW, problem.reverse(-Integer.MAX_VALUE));
		assertEquals(-1463847412, problem.reverse(-2147483641));
		assertEquals(ReverseInteger.OVERFLOW, problem.reverse(-1463847413));
		assertEquals(-2147483641, problem.reverse(-1463847412));
		assertEquals(-987654321, problem.reverse(-1234567890));
		assertEquals(-987654321, problem.reverse(-123456789));
		assertEquals(-321, problem.reverse(-123));
		assertEquals(-1, problem.reverse(-10));
		assertEquals(-8, problem.reverse(-8));

		assertEquals(0, problem.reverse(0));

		assertEquals(8, problem.reverse(8));
		assertEquals(1, problem.reverse(10));
		assertEquals(321, problem.reverse(123));
		assertEquals(987654321, problem.reverse(123456789));
		assertEquals(987654321, problem.reverse(1234567890));
		assertEquals(2147483641, problem.reverse(1463847412));
		assertEquals(ReverseInteger.OVERFLOW, problem.reverse(1463847413));
		assertEquals(1463847412, problem.reverse(2147483641));
		assertEquals(ReverseInteger.OVERFLOW, problem.reverse(Integer.MAX_VALUE));
	}

}
