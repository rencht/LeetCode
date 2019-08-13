package com.sid.leetcode.data;

import java.util.Arrays;

/**
 * Definition for singly-linked list.
 */
public class ListNode {

	public int val;

	public ListNode next;

	public ListNode(final int x) {
		this.val = x;
	}

	public ListNode(final int... nums) {
		this.val = nums[0];
		if (nums.length > 1) {
			this.next = new ListNode(Arrays.copyOfRange(nums, 1, nums.length));
		}
	}

	@Override
	public String toString() {
		if (next == null) return String.valueOf(this.val);
		return val + ">" + next.toString();
	}

}
