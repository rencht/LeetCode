package com.sid.leetcode;

/**
 * 33. Search in Rotated Sorted Array.
 *
 * <blockquote>
 * Suppose a sorted array is rotated at some pivot unknown to you beforehand.
 * <p>(i.e., <font color='#D02572'>0 1 2 4 5 6 7</font> might become <font color='#D02572'>4 5 6 7 0 1 2</font>).
 * <p>You are given a target value to search. If found in the array return its index, otherwise return -1.
 * <p>You may assume no duplicate exists in the array.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-09-01
 *
 */
public class A0033_SearchInRotatedSortedArray {

	public int search(int[] nums, int target) {
		return search(nums, 0, nums.length - 1, target);
	}

	private int search(final int[] nums, final int start, final int end, final int target) {
		if (start > end) return -1;
		int middle = (start + end) >> 1;
		if (nums[middle] == target) return middle;
		if (nums[middle] < target) {
			if (nums[end] < nums[middle]) return search(nums, middle + 1, end - 1, target);
			if (nums[end] == target) return end;
			if (nums[end] < target) return search(nums, start, middle - 1, target);
			return search(nums, middle + 1, end - 1, target);
		} else {
			if (nums[start] > nums[middle]) return search(nums, start + 1, middle - 1, target);
			if (nums[start] == target) return start;
			if (nums[start] < target) return search(nums, start + 1, middle - 1, target);
			return search(nums, middle + 1, end, target);
		}
	}

}
