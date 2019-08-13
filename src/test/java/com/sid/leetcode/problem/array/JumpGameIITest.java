package com.sid.leetcode.problem.array;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.array.JumpGameII;

public class JumpGameIITest {

	private JumpGameII problem;

	@Before
	public void setUp() throws Exception {
		problem = new JumpGameII();
	}

	@Test
	public void testJump() throws Exception {
		assertEquals(2, problem.jump(new int[] { 2, 3, 1, 1, 4 }));
	}

}
