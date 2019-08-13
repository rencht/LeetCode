package com.sid.leetcode.problem.math;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.math.AddBinary;

public class AddBinaryTest {

	private AddBinary problem;

	@Before
	public void setUp() throws Exception {
		problem = new AddBinary();
	}

	@Test
	public void testAddBinary() throws Exception {
		assertEquals("100", problem.addBinary("11", "1"));
		assertEquals("100", problem.addBinary("1", "11"));
		assertEquals("11", problem.addBinary("11", "0"));
		assertEquals("10101", problem.addBinary("1010", "1011"));
	}

}
