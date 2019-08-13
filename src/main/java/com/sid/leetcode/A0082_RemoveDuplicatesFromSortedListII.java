package com.sid.leetcode;

import com.sid.leetcode.data.ListNode;

/**
 * 82. Remove Duplicates from Sorted List II.
 *
 * <blockquote>
 * Given a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> 1->2->3->3->4->4->5
 * <p><b>Output:</b> 1->2->5
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> 1->1->1->2->3
 * <p><b>Output:</b> 2->3
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-08-07
 *
 */
public class A0082_RemoveDuplicatesFromSortedListII {

	public ListNode deleteDuplicates(final ListNode head) {
        final ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode previous = dummy;
        ListNode current = head;

        while (current != null) {
            while (current.next != null && current.val == current.next.val) current = current.next;
            if (previous.next == current) previous = current;
            else previous.next = current.next;
            current = current.next;
        }

        return dummy.next;
    }

}
