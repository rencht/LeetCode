package com.sid.leetcode;

/**
 * 2. Add Two Numbers.
 *
 * <blockquote>
 * You are given two <b>non-empty</b> linked lists representing two non-negative integers.
 * The digits are stored in <b>reverse order</b> and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 * 
 * <p>You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * <p><b>Example</b>:
 * <p><b>Input</b>: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * <p><b>Output</b>: 7 -> 0 -> 8
 * <p><b>Explanation</b>: 342 + 465 = 807.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.2, 2019-06-28
 *
 */
public class A0002_AddTwoNumbers {

	public ListNode addTwoNumbers(final ListNode l1, final ListNode l2) {
		ListNode result = null, current = null;

		ListNode t1 = l1, t2 = l2;
		int carry = 0;

		while (t1 != null || t2 != null || carry != 0) {
			final int val = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val) + carry;

			ListNode temp = new ListNode(val % 10);
			if (current == null) {
				current = temp;
				result = temp;
			}
			else {
				current.next = temp;
			}

			current = temp;
			t1 = t1 == null ? null : t1.next;
			t2 = t2 == null ? null : t2.next;
			carry = val / 10;
		}

		return result;
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
