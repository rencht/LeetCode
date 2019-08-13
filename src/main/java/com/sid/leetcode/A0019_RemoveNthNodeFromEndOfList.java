package com.sid.leetcode;

import com.sid.leetcode.data.ListNode;

/**
 * 19. Remove Nth Node From End of List.
 *
 * <blockquote>
 * Given a linked list, remove the nth node from the end of list and return its head.
 * <p>For example,
 * <blockquote>
 * Given linked list: 1->2->3->4->5, and n = 2.
 * <p>After removing the second node from the end, the linked list becomes 1->2->3->5.
 * </blockquote>
 * <p><b>Note:</b>
 * <p>Given n will always be valid.
 * <p>Try to do this in one pass.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-08-01
 *
 */
public class A0019_RemoveNthNodeFromEndOfList {

	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null || n == 0) return null;

		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode pre = dummy;
		ListNode curr = dummy;

		for (int i = 0; i < n; i++) {
			curr = curr.next;
		}
		while (curr.next != null) {
			curr = curr.next;
			pre = pre.next;
		}
		pre.next = pre.next.next;
		return dummy.next;
	}

}
