package com.sid.leetcode.problem.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.data.ListNode;
import com.sid.leetcode.problem.linkedlist.ReverseNodesInKGroup;

public class ReverseNodesInKGroupTest {

	private ReverseNodesInKGroup problem;

	@Before
	public void setUp() throws Exception {
		problem = new ReverseNodesInKGroup();
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
