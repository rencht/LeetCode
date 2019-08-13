package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.data.ListNode;

public class A0002_AddTwoNumbersTest {

	private A0002_AddTwoNumbers problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0002_AddTwoNumbers();
	}

	@Test
	public void testAddTwoNumbers() throws Exception {
		assertEquals("7>0>8", problem.addTwoNumbers(new ListNode(2, 4, 3), new ListNode(5, 6, 4)).toString());
		assertEquals("6>6>4", problem.addTwoNumbers(new ListNode(1), new ListNode(5, 6, 4)).toString());
		assertEquals("6>6>4", problem.addTwoNumbers(new ListNode(5, 6, 4), new ListNode(1)).toString());
		assertEquals("0>0>0>0>1", problem.addTwoNumbers(new ListNode(1), new ListNode(9, 9, 9, 9)).toString());
	}

}
