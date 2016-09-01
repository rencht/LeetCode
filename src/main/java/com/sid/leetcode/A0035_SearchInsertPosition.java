package com.sid.leetcode;

/**
 * 35. Search Insert Position.
 *
 * <blockquote>
 * Given a sorted array and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order.
 * <p>You may assume no duplicates in the array.
 * <p>Here are few examples.
 * <p><font color='#D02572'>[1,3,5,6]</font>, 5 → 2
 * <p><font color='#D02572'>[1,3,5,6]</font>, 2 → 1
 * <p><font color='#D02572'>[1,3,5,6]</font>, 7 → 4
 * <p><font color='#D02572'>[1,3,5,6]</font>, 0 → 0
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-09-01
 *
 */
public class A0035_SearchInsertPosition {

	public int searchInsert(int[] nums, int target) {
		int start = 0, end = nums.length - 1, middle = 0;
		while (start < end) {
			middle = (start + end) >> 1;
			if (nums[middle] == target) return middle;
			if (nums[middle] < target) start = middle + 1;
			else end = middle - 1;
		}
		return nums[start] >= target ? start : start + 1;
	}

}
