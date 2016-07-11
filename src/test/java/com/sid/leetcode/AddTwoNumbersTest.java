package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AddTwoNumbersTest {

	private AddTwoNumbers problem;

	private ListNode NUMBER_1;
	private ListNode NUMBER_342;
	private ListNode NUMBER_465;
	private ListNode NUMBER_466;
	private ListNode NUMBER_807;
	private ListNode NUMBER_9999;
	private ListNode NUMBER_10000;

	@Before
	public void setUp() throws Exception {
		problem = new AddTwoNumbers();

		NUMBER_1 = new ListNode(1);
		NUMBER_342 = new ListNode(2, new ListNode(4, new ListNode(3)));
		NUMBER_465 = new ListNode(5, new ListNode(6, new ListNode(4)));
		NUMBER_466 = new ListNode(6, new ListNode(6, new ListNode(4)));
		NUMBER_807 = new ListNode(7, new ListNode(0, new ListNode(8)));
		NUMBER_9999 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
		NUMBER_10000 = new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1)))));
	}

	@Test
	public void testAddTwoNumbers() throws Exception {
		assertNull(problem.addTwoNumbers(null, null));
		assertEquals(NUMBER_342.toString(), problem.addTwoNumbers(NUMBER_342, null).toString());
		assertEquals(NUMBER_465.toString(), problem.addTwoNumbers(null, NUMBER_465).toString());
		assertEquals(NUMBER_807.toString(), problem.addTwoNumbers(NUMBER_342, NUMBER_465).toString());
		assertEquals(NUMBER_466.toString(), problem.addTwoNumbers(NUMBER_1, NUMBER_465).toString());
		assertEquals(NUMBER_10000.toString(), problem.addTwoNumbers(NUMBER_1, NUMBER_9999).toString());
	}

}
