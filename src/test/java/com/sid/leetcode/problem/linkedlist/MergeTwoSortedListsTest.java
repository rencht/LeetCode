package com.sid.leetcode.problem.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.data.ListNode;
import com.sid.leetcode.problem.linkedlist.MergeTwoSortedLists;

public class MergeTwoSortedListsTest {

	private MergeTwoSortedLists problem;

	@Before
	public void setUp() throws Exception {
		problem = new MergeTwoSortedLists();
	}

	@Test
	public void testMergeTwoLists() throws Exception {
		assertNull(problem.mergeTwoLists(null, null));
		assertEquals("1", problem.mergeTwoLists(null, new ListNode(1)).toString());
		assertEquals("1>2>3>4>5>6", problem.mergeTwoLists(new ListNode(1, 2, 3), new ListNode(4, 5, 6)).toString());
		assertEquals("1>2>3>4>5>6", problem.mergeTwoLists(new ListNode(4, 5, 6), new ListNode(1, 2, 3)).toString());
	}

}
