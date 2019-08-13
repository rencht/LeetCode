package com.sid.leetcode.problem.linkedlist;

import com.sid.leetcode.data.ListNode;

/**
 * 61. Rotate List.
 *
 * <blockquote>
 * Given a linked list, rotate the list to the right by k places, where k is non-negative.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> 1->2->3->4->5->NULL, k = 2
 * <p><b>Output:</b> 4->5->1->2->3->NULL
 * <p><b>Explanation:</b>
 * <p>rotate 1 step to the right: 5->1->2->3->4->NULL
 * <p>rotate 2 steps to the right: 4->5->1->2->3->NULL
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> 0->1->2->NULL, k = 4
 * <p><b>Output:</b> 2->0->1->NULL
 * <p><b>Explanation:</b>
 * <p>rotate 1 step to the right: 2->0->1->NULL
 * <p>rotate 2 steps to the right: 1->2->0->NULL
 * <p>rotate 3 steps to the right: 0->1->2->NULL
 * <p>rotate 4 steps to the right: 2->0->1->NULL
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-28
 *
 */
public class RotateList {

	public ListNode rotateRight(final ListNode head, final int k) {
        if (head == null) return null;

        // Count the linked list
        int count = 1;
        ListNode current = head;
        while (current.next != null) {
            count++;
            current = current.next;
        }
        // Set head node as next of tail node
        current.next = head;

        // Find the new tail node
        int n = count - (k % count);
        for (int i = 0; i < n; i++) {
            current = current.next;
        }

        final ListNode result = current.next;
        current.next = null;
        return result;
    }

}
