package com.sid.leetcode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.data.ListNode;

public class A0061_RotateListTest {

	private A0061_RotateList problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0061_RotateList();
	}

	@Test
	public void testRotateRight() throws Exception {
		assertNull(problem.rotateRight(null, 1));
		assertEquals("4>5>1>2>3", problem.rotateRight(new ListNode(1, 2, 3, 4, 5), 2).toString());
		assertEquals("2>0>1", problem.rotateRight(new ListNode(0, 1, 2), 4).toString());
	}

}
