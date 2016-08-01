package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.A0021_MergeTwoSortedLists.ListNode;

public class A0021_MergeTwoSortedListsTest {

	private A0021_MergeTwoSortedLists problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0021_MergeTwoSortedLists();
	}

	@Test
	public void testMergeTwoLists() throws Exception {
		assertNull(problem.mergeTwoLists(null, null));

		{
			assertEquals(new ListNode(1).toString(), problem.mergeTwoLists(null, new ListNode(1)).toString());
		}

		{
			ListNode node123 = new ListNode(1, new ListNode(2, new ListNode(3)));
			ListNode node456 = new ListNode(4, new ListNode(5, new ListNode(6)));
			ListNode node123456 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
			assertEquals(node123456.toString(), problem.mergeTwoLists(node123, node456).toString());
		}

		{
			ListNode node123 = new ListNode(1, new ListNode(2, new ListNode(3)));
			ListNode node456 = new ListNode(4, new ListNode(5, new ListNode(6)));
			ListNode node123456 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6))))));
			assertEquals(node123456.toString(), problem.mergeTwoLists(node456, node123).toString());
		}
	}

}
