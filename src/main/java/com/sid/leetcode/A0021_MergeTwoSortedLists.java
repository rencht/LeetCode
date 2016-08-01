package com.sid.leetcode;

/**
 * 21. Merge Two Sorted Lists.
 *
 * <blockquote>
 * Merge two sorted linked lists and return it as a new list.
 * The new list should be made by splicing together the nodes of the first two lists.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-08-01
 *
 */
public class A0021_MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);

		ListNode p1 = l1, p2 = l2;
		ListNode current = dummy, next = null;

		while (p1 != null && p2 != null) {
			if (p1.val < p2.val) {
				next = new ListNode(p1.val);
				p1 = p1.next;
			} else {
				next = new ListNode(p2.val);
				p2 = p2.next;
			}
			current.next = next;
			current = next;
		}
		if (p1 != null) {
			current.next = p1;
		} else if (p2 != null) {
			current.next = p2;
		}
		return dummy.next;
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
