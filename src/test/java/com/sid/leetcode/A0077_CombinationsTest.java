package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class A0077_CombinationsTest {

	private A0077_Combinations problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0077_Combinations();
	}

	@Test
	public void testCombine() throws Exception {
		assertEquals(
				Arrays.asList(
						Arrays.asList(1, 2),
						Arrays.asList(1, 3),
						Arrays.asList(2, 3),
						Arrays.asList(1, 4),
						Arrays.asList(2, 4),
						Arrays.asList(3, 4)),
				problem.combine(4, 2));
	}

}
