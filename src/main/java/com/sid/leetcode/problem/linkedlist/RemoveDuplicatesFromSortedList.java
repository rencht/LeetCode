package com.sid.leetcode.problem.linkedlist;

import com.sid.leetcode.data.ListNode;

/**
 * 83. Remove Duplicates from Sorted List.
 *
 * <blockquote>
 * Given a sorted linked list, delete all duplicates such that each element appear only once.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> 1->1->2
 * <p><b>Output:</b> 1->2
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> 1->1->2->3->3
 * <p><b>Output:</b> 1->2->3
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-08-07
 *
 */
public class RemoveDuplicatesFromSortedList {

	public ListNode deleteDuplicates(final ListNode head) {
        if (head == null) return null;

        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }

        return head;
    }

}
