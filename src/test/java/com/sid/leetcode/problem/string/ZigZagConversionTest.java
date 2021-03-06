package com.sid.leetcode.problem.string;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.string.ZigZagConversion;

public class ZigZagConversionTest {

	private ZigZagConversion problem;

	@Before
	public void setUp() throws Exception {
		problem = new ZigZagConversion();
	}

	@Test
	public void testConvert() throws Exception {
		assertEquals("A", problem.convert("A", 1));
		assertEquals("AB", problem.convert("AB", 1));
		assertEquals("A", problem.convert("A", 3));
		assertEquals("ACBD", problem.convert("ABCD", 2));
		assertEquals("PAHNAPLSIIGYIR", problem.convert("PAYPALISHIRING", 3));
		assertEquals("PINALSIGYAHRPI", problem.convert("PAYPALISHIRING", 4));
	}

}
