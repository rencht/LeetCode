package com.sid.leetcode;

/**
 * 25. Reverse Nodes in k-Group.
 *
 * <blockquote>
 * Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.
 * <p>If the number of nodes is not a multiple of k then left-out nodes in the end should remain as it is.
 * <p>You may not alter the values in the nodes, only nodes itself may be changed.
 * <p>Only constant memory is allowed.
 * <p>For example,
 * <p>Given this linked list: <font color='#D02572'>1->2->3->4->5</font>
 * <p>For k = 2, you should return: <font color='#D02572'>2->1->4->3->5</font>
 * <p>For k = 3, you should return: <font color='#D02572'>3->2->1->4->5</font>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-08-05
 *
 */
public class A0025_ReverseNodesInKGroup {

	public ListNode reverseKGroup(ListNode head, int k) {
		if (k < 1) return null;
		if (k == 1) return head;

		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode current = dummy;
		ListNode next = current;
		int count = 0;

		while (current != null) {
			while (count < k && next != null) {
				count++;
				next = next.next;
			}
			if (next != null) {
				ListNode currGroupHead = current.next;
				ListNode nextGroup = next.next;

				ListNode tempPre = current.next;
				ListNode tempCurr = tempPre.next;
				ListNode tempNext = tempCurr.next;
				for (int i = 1; i < k; i++) {
					tempCurr.next = tempPre;
					tempPre = tempCurr;
					tempCurr = tempNext;
					if (tempNext != null) {
						tempNext = tempNext.next;
					}
				}
				current.next.next = nextGroup;
				current.next = next;
				next = currGroupHead;
			}
			current = next;
			count = 0;
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
