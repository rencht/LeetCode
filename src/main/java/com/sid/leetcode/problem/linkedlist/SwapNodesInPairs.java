package com.sid.leetcode.problem.linkedlist;

import com.sid.leetcode.data.ListNode;

/**
 * 24. Swap Nodes in Pairs.
 *
 * <blockquote>
 * Given a linked list, swap every two adjacent nodes and return its head.
 * <p>For example,
 * <p>Given <font color='#D02572'>1->2->3->4</font>, you should return the list as <font color='#D02572'>2->1->4->3</font>.
 * <p>Your algorithm should use only constant space. You may <b>not</b> modify the values in the list, only nodes itself can be changed.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-08-04
 *
 */
public class SwapNodesInPairs {

	public ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode current = dummy;
		ListNode temp = null;
		while (current.next != null && current.next.next != null) {
			temp = current.next;
			current.next = current.next.next;
			temp.next = current.next.next;
			current.next.next = temp;
			current = current.next.next;
		}
		return dummy.next;
	}

}
