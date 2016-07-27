package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0008_StringToIntegerTest {

	private A0008_StringToInteger problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0008_StringToInteger();
	}

	@Test
	public void testMyAtoi() throws Exception {
		assertEquals(Integer.MIN_VALUE, problem.myAtoi("-2147483648"));
		assertEquals(-2147483647, problem.myAtoi("-2147483647"));
		assertEquals(-1234, problem.myAtoi("-1234"));
		assertEquals(-1, problem.myAtoi("-1"));
		assertEquals(0, problem.myAtoi("0"));
		assertEquals(1, problem.myAtoi("1"));
		assertEquals(1234, problem.myAtoi("1234"));
		assertEquals(Integer.MAX_VALUE, problem.myAtoi("2147483647"));

		assertEquals(1, problem.myAtoi("+1"));
		assertEquals(1234, problem.myAtoi("+1234"));
		assertEquals(Integer.MAX_VALUE, problem.myAtoi("+2147483647"));

		assertEquals(Integer.MIN_VALUE, problem.myAtoi("-2147483649"));
		assertEquals(Integer.MAX_VALUE, problem.myAtoi("2147483648"));

		assertEquals(10, problem.myAtoi("    010"));
		assertEquals(-123, problem.myAtoi("-123  	"));

		assertEquals(0, problem.myAtoi("+-2112"));
		assertEquals(0, problem.myAtoi("++2112"));
		assertEquals(22, problem.myAtoi("22abc"));
	}

}
