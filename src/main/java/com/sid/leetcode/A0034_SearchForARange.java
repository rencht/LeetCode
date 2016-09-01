package com.sid.leetcode;

/**
 * 34. Search for a Range.
 *
 * <blockquote>
 * Given a sorted array of integers, find the starting and ending position of a given target value.
 * <p>Your algorithm's runtime complexity must be in the order of O(log n).
 * <p>If the target is not found in the array, return <font color='#D02572'>[-1, -1]</font>.
 * <p>For example,
 * <p>Given <font color='#D02572'>[5, 7, 7, 8, 8, 10]</font> and target value 8,
 * <p>return <font color='#D02572'>[3, 4]</font>.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-09-01
 *
 */
public class A0034_SearchForARange {

	public int[] searchRange(int[] nums, int target) {
		return searchRange(nums, 0, nums.length - 1, target);
	}

	private int[] searchRange(final int[] nums, final int start, final int end, final int target) {
		if (start > end) return new int[] { -1, -1 };

		int middle = (start + end) >> 1;
		if (nums[middle] == target) {
			return new int[] { getStart(nums, start, middle, target), getEnd(nums, middle, end, target) };
		}
		if (nums[middle] < target) return searchRange(nums, middle + 1, end, target);
		return searchRange(nums, start, middle - 1, target);
	}

	private int getStart(final int[] nums, final int start, final int end, final int target) {
		if (start == end) return end;
		int middle = (start + end) >> 1;
		if (middle == start) return nums[start] == target ? start : end;
		if (nums[middle] == target) return getStart(nums, start, middle, target);
		return getStart(nums, middle + 1, end, target);
	}

	private int getEnd(final int[] nums, final int start, final int end, final int target) {
		if (start == end) return start;
		int middle = (start + end) >> 1;
		if (middle == start) return nums[end] == target ? end : start;
		if (nums[middle] == target) return getEnd(nums, middle, end, target);
		return getEnd(nums, start, middle - 1, target);
	}

}
