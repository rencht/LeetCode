package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0072_EditDistanceTest {

	private A0072_EditDistance problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0072_EditDistance();
	}

	@Test
	public void testMinDistance() throws Exception {
		assertEquals(3, problem.minDistance("horse", "ros"));
		assertEquals(5, problem.minDistance("intention", "execution"));
	}

}
