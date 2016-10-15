package com.sid.leetcode;

/**
 * 2. Add Two Numbers.
 *
 * <blockquote>
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * <p><b>Input</b>: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * <p><b>Output</b>: 7 -> 0 -> 8
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.1, 2016-10-14
 *
 */
public class A0002_AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) return l2;
		if (l2 == null) return l1;

		ListNode result = new ListNode(0), current = result;
		int carry = 0, temp = 0;
		while (l1 != null && l2 != null) {
			temp = l1.val + l2.val + carry;
			current.next = new ListNode(temp % 10);
			carry = temp / 10;
			l1 = l1.next;
			l2 = l2.next;
			current = current.next;
		}
		ListNode remaining = (l1 == null) ? l2 : l1;
		while (remaining != null) {
			temp = remaining.val + carry;
			current.next = new ListNode(temp % 10);
			carry = temp / 10;
			remaining = remaining.next;
			current = current.next;
		}
		if (carry != 0) {
			current.next = new ListNode(carry);
		}
		return result.next;
	}

	/**
	 * Definition for singly-linked list.
	 */
	static class ListNode {

		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

		ListNode(int x, ListNode next) {
			val = x;
			this.next = next;
		}

		@Override
		public String toString() {
			if (next == null) {
				return String.valueOf(val);
			} else {
				return val + " -> " + next.toString();
			}
		}

	}

}
