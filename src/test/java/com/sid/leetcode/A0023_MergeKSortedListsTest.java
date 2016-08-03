package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.A0023_MergeKSortedLists.ListNode;

public class A0023_MergeKSortedListsTest {

	private A0023_MergeKSortedLists problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0023_MergeKSortedLists();
	}

	@Test
	public void testMergeKLists() throws Exception {
		assertNull(problem.mergeKLists(null));
		assertNull(problem.mergeKLists(new ListNode[] {}));

		assertEquals(new ListNode(1).toString(), problem.mergeKLists(new ListNode[] { new ListNode(1) }).toString());

		{
			ListNode node123 = new ListNode(1, new ListNode(2, new ListNode(3)));
			ListNode node4567 = new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7))));
			ListNode node1234567 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7)))))));
			assertEquals(node1234567.toString(), problem.mergeKLists(new ListNode[] { node123, node4567 }).toString());
		}

		{
			ListNode node12 = new ListNode(1, new ListNode(2));
			ListNode node456 = new ListNode(4, new ListNode(5, new ListNode(6)));
			ListNode node12456 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(6)))));
			assertEquals(node12456.toString(), problem.mergeKLists(new ListNode[] { node456, node12 }).toString());
		}

		{
			ListNode node12 = new ListNode(1, new ListNode(2));
			ListNode node456 = new ListNode(4, new ListNode(5, new ListNode(6)));
			ListNode node6789 = new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9))));
			ListNode node124566789 = new ListNode(1, new ListNode(2, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(6, new ListNode(7, new ListNode(8, new ListNode(9)))))))));
			assertEquals(node124566789.toString(), problem.mergeKLists(new ListNode[] { node456, node12, node6789 }).toString());
		}
	}

}
