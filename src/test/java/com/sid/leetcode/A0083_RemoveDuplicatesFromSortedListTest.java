package com.sid.leetcode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.data.ListNode;

public class A0083_RemoveDuplicatesFromSortedListTest {

	private A0083_RemoveDuplicatesFromSortedList problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0083_RemoveDuplicatesFromSortedList();
	}

	@Test
	public void testDeleteDuplicates() throws Exception {
		assertNull(problem.deleteDuplicates(null));
		assertEquals("1>2", problem.deleteDuplicates(new ListNode(1, 1, 2)).toString());
		assertEquals("1>2>3", problem.deleteDuplicates(new ListNode(1, 1, 2, 3, 3)).toString());
	}

}
