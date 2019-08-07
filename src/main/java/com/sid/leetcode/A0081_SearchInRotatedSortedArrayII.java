package com.sid.leetcode;

/**
 * 81. Search in Rotated Sorted Array II.
 *
 * <blockquote>
 * Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
 * <p>(i.e., [ 0, 0, 1, 2, 2, 5, 6 ] might become [ 2, 5, 6, 0, 0, 1, 2 ]).
 * <p>You are given a target value to search. If found in the array return true, otherwise return false.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> nums = [ 2, 5, 6, 0, 0, 1, 2 ], target = 0
 * <p><b>Output:</b> true
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> nums = [ 2, 5, 6, 0, 0, 1, 2 ], target = 3
 * <p><b>Output:</b> false
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-08-07
 *
 */
public class A0081_SearchInRotatedSortedArrayII {

	// Binary search

	public boolean search(final int[] nums, final int target) {
		return search(nums, 0, nums.length - 1, target);
    }

	private boolean search(final int[] nums, final int start, final int end, final int target) {
		if (start > end) return false;
		int s = start, e = end;
		while (s < e && nums[s + 1] == nums[s]) s++;
		while (s < e && nums[e] == nums[s]) e--;

		int middle = (s + e) >> 1;
		if (nums[middle] == target) return true;

		if (nums[middle] < target) {
			if (nums[e] < nums[middle]) return search(nums, middle + 1, e - 1, target);
			if (nums[e] == target) return true;
			if (nums[e] < target) return search(nums, s, middle - 1, target);
			return search(nums, middle + 1, e - 1, target);
		} else {
			if (nums[s] > nums[middle]) return search(nums, s + 1, middle - 1, target);
			if (nums[s] == target) return true;
			if (nums[s] < target) return search(nums, s + 1, middle - 1, target);
			return search(nums, middle + 1, e, target);
		}
	}

}
