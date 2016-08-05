package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.A0025_ReverseNodesInKGroup.ListNode;

public class A0025_ReverseNodesInKGroupTest {

	private A0025_ReverseNodesInKGroup problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0025_ReverseNodesInKGroup();
	}

	@Test
	public void testReverseKGroup() throws Exception {
		assertNull(problem.reverseKGroup(new ListNode(1), 0));

		assertEquals(new ListNode(1, new ListNode(2)).toString(), problem.reverseKGroup(new ListNode(1, new ListNode(2)), 1).toString());

		{
			ListNode node12 = new ListNode(1, new ListNode(2));
			ListNode node21 = new ListNode(2, new ListNode(1));
			assertEquals(node21.toString(), problem.reverseKGroup(node12, 2).toString());
		}

		{
			ListNode node12345 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
			ListNode node21435 = new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(5)))));
			assertEquals(node21435.toString(), problem.reverseKGroup(node12345, 2).toString());
		}

		{
			ListNode node12345 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
			ListNode node32145 = new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(5)))));
			assertEquals(node32145.toString(), problem.reverseKGroup(node12345, 3).toString());
		}
	}

}
