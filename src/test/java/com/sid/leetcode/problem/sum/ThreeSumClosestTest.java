package com.sid.leetcode.problem.sum;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.sum.ThreeSumClosest;

public class ThreeSumClosestTest {

	private ThreeSumClosest problem;

	@Before
	public void setUp() throws Exception {
		problem = new ThreeSumClosest();
	}

	@Test
	public void testThreeSumClosest() throws Exception {
		assertEquals(1, problem.threeSumClosest(new int[] { -1, 2 }, 10));
		assertEquals(2, problem.threeSumClosest(new int[] { -1, 2, 1, -4 }, 1));
		assertEquals(2, problem.threeSumClosest(new int[] { -1, 2, 1, -4, -4 }, 1));
		assertEquals(2, problem.threeSumClosest(new int[] { -1, 2, 1, -4 }, 2));
		assertEquals(-5, problem.threeSumClosest(new int[] { -4, -2, 1, 4 }, -100));
		assertEquals(-6, problem.threeSumClosest(new int[] { -4, -2, -2, -2, -2, -2 }, 100));
		assertEquals(-6, problem.threeSumClosest(new int[] { -2, -2, -2, -2, -2, -2 }, -100));
		assertEquals(-12, problem.threeSumClosest(new int[] { -4, -4, -4, -4, -4 }, 100));
	}

}
