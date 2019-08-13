package com.sid.leetcode.problem.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.data.ListNode;
import com.sid.leetcode.problem.linkedlist.SwapNodesInPairs;

public class SwapNodesInPairsTest {

	private SwapNodesInPairs problem;

	@Before
	public void setUp() throws Exception {
		problem = new SwapNodesInPairs();
	}

	@Test
	public void testSwapPairs() throws Exception {
		assertNull(problem.swapPairs(null));
		assertEquals("1", problem.swapPairs(new ListNode(1)).toString());
		assertEquals("2>1>4>3", problem.swapPairs(new ListNode(1, 2, 3, 4)).toString());
		assertEquals("2>1>4>3>5", problem.swapPairs(new ListNode(1, 2, 3, 4, 5)).toString());
	}

}
