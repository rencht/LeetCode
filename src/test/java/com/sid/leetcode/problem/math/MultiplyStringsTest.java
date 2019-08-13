package com.sid.leetcode.problem.math;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.math.MultiplyStrings;

public class MultiplyStringsTest {

	private MultiplyStrings problem;

	@Before
	public void setUp() throws Exception {
		problem = new MultiplyStrings();
	}

	@Test
	public void testMultiply() throws Exception {
		assertEquals("0", problem.multiply("0", "123"));
		assertEquals("0", problem.multiply("123", "0"));
		assertEquals("123", problem.multiply("1", "123"));
		assertEquals("123", problem.multiply("123", "1"));
		assertEquals("6", problem.multiply("2", "3"));
		assertEquals("56088", problem.multiply("123", "456"));
		assertEquals("10000", problem.multiply("100", "100"));
		assertEquals("998001", problem.multiply("999", "999"));
		assertEquals("1000", problem.multiply("100", "10"));
	}

}
