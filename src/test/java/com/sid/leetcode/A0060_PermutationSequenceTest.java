package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0060_PermutationSequenceTest {

	private A0060_PermutationSequence problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0060_PermutationSequence();
	}

	@Test
	public void testGetPermutation() throws Exception {
		assertEquals("213", problem.getPermutation(3, 3));
		assertEquals("2314", problem.getPermutation(4, 9));
	}

}
