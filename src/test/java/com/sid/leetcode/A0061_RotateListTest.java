package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.A0061_RotateList.ListNode;

public class A0061_RotateListTest {

	private A0061_RotateList problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0061_RotateList();
	}

	@Test
	public void testRotateRight() throws Exception {
		assertNull(problem.rotateRight(null, 1));

		{
			final ListNode node12345 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
			final ListNode node45123 = new ListNode(4, new ListNode(5, new ListNode(1, new ListNode(2, new ListNode(3)))));
			assertEquals(node45123.toString(), problem.rotateRight(node12345, 2).toString());
		}

		{
			final ListNode node012 = new ListNode(0, new ListNode(1, new ListNode(2)));
			final ListNode node201 = new ListNode(2, new ListNode(0, new ListNode(1)));
			assertEquals(node201.toString(), problem.rotateRight(node012, 4).toString());
		}
	}

}
