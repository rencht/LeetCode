package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class A0078_SubsetsTest {

	private A0078_Subsets problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0078_Subsets();
	}

	@Test
	public void testSubsets() throws Exception {
		assertEquals(
				Arrays.asList(
						Arrays.asList(),
						Arrays.asList(1),
						Arrays.asList(2),
						Arrays.asList(1, 2)),
				problem.subsets(new int[] { 1, 2 }));

		assertEquals(
				Arrays.asList(
						Arrays.asList(),
						Arrays.asList(1),
						Arrays.asList(2),
						Arrays.asList(1, 2),
						Arrays.asList(3),
						Arrays.asList(1, 3),
						Arrays.asList(2, 3),
						Arrays.asList(1, 2, 3)),
				problem.subsets(new int[] { 1, 2, 3 }));
	}

}
