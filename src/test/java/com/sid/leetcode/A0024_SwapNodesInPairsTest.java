package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.A0024_SwapNodesInPairs.ListNode;

public class A0024_SwapNodesInPairsTest {

	private A0024_SwapNodesInPairs problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0024_SwapNodesInPairs();
	}

	@Test
	public void testSwapPairs() throws Exception {
		assertNull(problem.swapPairs(null));

		assertEquals(new ListNode(1).toString(), problem.swapPairs(new ListNode(1)).toString());

		{
			ListNode node1234 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
			ListNode node2143 = new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3))));
			assertEquals(node2143.toString(), problem.swapPairs(node1234).toString());
		}

		{
			ListNode node12345 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
			ListNode node21435 = new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(5)))));
			assertEquals(node21435.toString(), problem.swapPairs(node12345).toString());
		}
	}

}
