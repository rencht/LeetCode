package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0067_AddBinaryTest {

	private A0067_AddBinary problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0067_AddBinary();
	}

	@Test
	public void testAddBinary() throws Exception {
		assertEquals("100", problem.addBinary("11", "1"));
		assertEquals("100", problem.addBinary("1", "11"));
		assertEquals("11", problem.addBinary("11", "0"));
		assertEquals("10101", problem.addBinary("1010", "1011"));
	}

}
