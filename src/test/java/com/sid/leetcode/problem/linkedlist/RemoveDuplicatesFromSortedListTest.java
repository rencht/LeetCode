package com.sid.leetcode.problem.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.data.ListNode;
import com.sid.leetcode.problem.linkedlist.RemoveDuplicatesFromSortedList;

public class RemoveDuplicatesFromSortedListTest {

	private RemoveDuplicatesFromSortedList problem;

	@Before
	public void setUp() throws Exception {
		problem = new RemoveDuplicatesFromSortedList();
	}

	@Test
	public void testDeleteDuplicates() throws Exception {
		assertNull(problem.deleteDuplicates(null));
		assertEquals("1>2", problem.deleteDuplicates(new ListNode(1, 1, 2)).toString());
		assertEquals("1>2>3", problem.deleteDuplicates(new ListNode(1, 1, 2, 3, 3)).toString());
	}

}
