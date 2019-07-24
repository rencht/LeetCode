package com.sid.leetcode;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class A0055_JumpGameTest {

	private A0055_JumpGame problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0055_JumpGame();
	}

	@Test
	public void testCanJump() throws Exception {
		assertTrue(problem.canJump(new int[] { 0 }));
		assertFalse(problem.canJump(new int[] { 0, 4 }));
		assertFalse(problem.canJump(new int[] { 0, 2, 3 }));
		assertTrue(problem.canJump(new int[] { 2, 3, 1, 1, 4 }));
		assertFalse(problem.canJump(new int[] { 3, 2, 1, 0, 4 }));
	}

}
