package com.sid.leetcode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.data.ListNode;

public class A0019_RemoveNthNodeFromEndOfListTest {

	private A0019_RemoveNthNodeFromEndOfList problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0019_RemoveNthNodeFromEndOfList();
	}

	@Test
	public void testRemoveNthFromEnd() throws Exception {
		assertNull(problem.removeNthFromEnd(null, 1));
		assertNull(problem.removeNthFromEnd(new ListNode(1), 0));
		assertNull(problem.removeNthFromEnd(new ListNode(1), 1));
		assertEquals("1>2>3>5", problem.removeNthFromEnd(new ListNode(1, 2, 3, 4, 5), 2).toString());
		assertEquals("3>4>5>6", problem.removeNthFromEnd(new ListNode(2, 3, 4, 5, 6), 5).toString());
	}

}
