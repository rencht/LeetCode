package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.A0019_RemoveNthNodeFromEndOfList.ListNode;

public class A0019_RemoveNthNodeFromEndOfListTest {

	private A0019_RemoveNthNodeFromEndOfList problem;

	private ListNode LIST_1;
	private ListNode LIST_1235;
	private ListNode LIST_12345;
	private ListNode LIST_3456;
	private ListNode LIST_23456;

	@Before
	public void setUp() throws Exception {
		problem = new A0019_RemoveNthNodeFromEndOfList();

		LIST_1 = new ListNode(1);

		LIST_1235 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));
		LIST_12345 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

		LIST_3456 = new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))));
		LIST_23456 = new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))));
	}

	@Test
	public void testRemoveNthFromEnd() throws Exception {
		assertNull(problem.removeNthFromEnd(null, 1));
		assertNull(problem.removeNthFromEnd(LIST_1, 0));
		assertNull(problem.removeNthFromEnd(LIST_1, 1));

		assertEquals(LIST_1235.toString(), problem.removeNthFromEnd(LIST_12345, 2).toString());
		assertEquals(LIST_3456.toString(), problem.removeNthFromEnd(LIST_23456, 5).toString());
	}

}
