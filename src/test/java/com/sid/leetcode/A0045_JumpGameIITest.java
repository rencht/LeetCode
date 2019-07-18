package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0045_JumpGameIITest {

	private A0045_JumpGameII problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0045_JumpGameII();
	}

	@Test
	public void testJump() throws Exception {
		assertEquals(2, problem.jump(new int[] { 2, 3, 1, 1, 4 }));
	}

}
