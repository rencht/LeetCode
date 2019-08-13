package com.sid.leetcode.problem.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.data.ListNode;
import com.sid.leetcode.problem.linkedlist.MergeKSortedLists;

public class MergeKSortedListsTest {

	private MergeKSortedLists problem;

	@Before
	public void setUp() throws Exception {
		problem = new MergeKSortedLists();
	}

	@Test
	public void testMergeKLists() throws Exception {
		assertNull(problem.mergeKLists(null));
		assertNull(problem.mergeKLists(new ListNode[] {}));
		assertEquals("1", problem.mergeKLists(new ListNode[] { new ListNode(1) }).toString());
		assertEquals("1>2>3>4>5>6>7", problem.mergeKLists(new ListNode[] { new ListNode(1, 2, 3), new ListNode(4, 5, 6, 7) }).toString());
		assertEquals("1>2>4>5>6", problem.mergeKLists(new ListNode[] { new ListNode(4, 5, 6), new ListNode(1, 2) }).toString());
		assertEquals("1>2>4>5>6>6>7>8>9", problem.mergeKLists(new ListNode[] { new ListNode(4, 5, 6), new ListNode(1, 2), new ListNode(6, 7, 8, 9) }).toString());
	}

}
