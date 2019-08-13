package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.data.ListNode;

public class A0082_RemoveDuplicatesFromSortedListIITest {

	private A0082_RemoveDuplicatesFromSortedListII problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0082_RemoveDuplicatesFromSortedListII();
	}

	@Test
	public void testDeleteDuplicates() throws Exception {
		assertEquals("1>2>5", problem.deleteDuplicates(new ListNode(1, 2, 3, 3, 4, 4, 5)).toString());
		assertEquals("2>3", problem.deleteDuplicates(new ListNode(1, 1, 1, 2, 3)).toString());
	}

}
