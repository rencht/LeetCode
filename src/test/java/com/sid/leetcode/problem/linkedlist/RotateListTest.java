package com.sid.leetcode.problem.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.data.ListNode;
import com.sid.leetcode.problem.linkedlist.RotateList;

public class RotateListTest {

	private RotateList problem;

	@Before
	public void setUp() throws Exception {
		problem = new RotateList();
	}

	@Test
	public void testRotateRight() throws Exception {
		assertNull(problem.rotateRight(null, 1));
		assertEquals("4>5>1>2>3", problem.rotateRight(new ListNode(1, 2, 3, 4, 5), 2).toString());
		assertEquals("2>0>1", problem.rotateRight(new ListNode(0, 1, 2), 4).toString());
	}

}
