package com.sid.leetcode;

/**
 * 23. Merge k Sorted Lists.
 *
 * <blockquote>
 * Merge k sorted linked lists and return it as one sorted list.
 * Analyze and describe its complexity.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-08-03
 *
 */
public class A0023_MergeKSortedLists {

	public ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0) return null;
		return mergeKLists(lists, 0, lists.length - 1);
	}

	private ListNode mergeKLists(final ListNode[] lists, final int start, final int end) {
		if (start == end) return lists[start];
		if (start == end - 1) return mergeTwoLists(lists[start], lists[end]);

		int middle = (start + end) >> 1;
		ListNode l1 = mergeKLists(lists, start, middle);
		ListNode l2 = mergeKLists(lists, middle + 1, end);
		return mergeTwoLists(l1, l2);
	}

	private ListNode mergeTwoLists(final ListNode l1, final ListNode l2) {
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
