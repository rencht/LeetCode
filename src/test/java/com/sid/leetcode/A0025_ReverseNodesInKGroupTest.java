package com.sid.leetcode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.data.ListNode;

public class A0025_ReverseNodesInKGroupTest {

	private A0025_ReverseNodesInKGroup problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0025_ReverseNodesInKGroup();
	}

	@Test
	public void testReverseKGroup() throws Exception {
		assertNull(problem.reverseKGroup(new ListNode(1), 0));
		assertEquals("1>2", problem.reverseKGroup(new ListNode(1, 2), 1).toString());
		assertEquals("2>1", problem.reverseKGroup(new ListNode(1, 2), 2).toString());
		assertEquals("2>1>4>3>5", problem.reverseKGroup(new ListNode(1, 2, 3, 4, 5), 2).toString());
		assertEquals("3>2>1>4>5", problem.reverseKGroup(new ListNode(1, 2, 3, 4, 5), 3).toString());
	}

}
