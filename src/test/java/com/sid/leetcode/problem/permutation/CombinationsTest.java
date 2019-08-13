package com.sid.leetcode.problem.permutation;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.permutation.Combinations;

public class CombinationsTest {

	private Combinations problem;

	@Before
	public void setUp() throws Exception {
		problem = new Combinations();
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
