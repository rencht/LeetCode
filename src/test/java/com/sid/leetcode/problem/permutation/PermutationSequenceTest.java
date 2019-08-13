package com.sid.leetcode.problem.permutation;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.permutation.PermutationSequence;

public class PermutationSequenceTest {

	private PermutationSequence problem;

	@Before
	public void setUp() throws Exception {
		problem = new PermutationSequence();
	}

	@Test
	public void testGetPermutation() throws Exception {
		assertEquals("213", problem.getPermutation(3, 3));
		assertEquals("2314", problem.getPermutation(4, 9));
	}

}
