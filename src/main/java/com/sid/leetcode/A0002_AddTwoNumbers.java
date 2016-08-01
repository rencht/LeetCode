package com.sid.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * @version 1.0, 2016-07-11
 *
 */
public class A0002_AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode result = null, sum = null;
		int carry = 0, temp = 0;
		List<ListNode> addends = Arrays.asList(l1, l2);

		while (!addends.isEmpty()) {
			temp = carry;
			for (ListNode listNode : addends) {
				temp += listNode.val;
			}
			if (sum == null) {
				sum = new ListNode(temp % 10);
				result = sum;
			} else {
				sum.next = new ListNode(temp % 10);
				sum = sum.next;
			}
			carry = temp / 10;

			List<ListNode> newAddends = new ArrayList<ListNode>();
			for (ListNode listNode : addends) {
				if (listNode.next != null) {
					newAddends.add(listNode.next);
				}
			}
			addends = newAddends;
		}
		if (carry != 0) {
			sum.next = new ListNode(carry);
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
