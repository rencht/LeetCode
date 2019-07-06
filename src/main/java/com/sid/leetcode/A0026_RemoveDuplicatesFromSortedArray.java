package com.sid.leetcode;

/**
 * 26. Remove Duplicates from Sorted Array.
 *
 * <blockquote>
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
 * <p>Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p>For example,
 * <p>Given input array nums = <font color='#D02572'>[1,1,2]</font>,
 * <p>Your function should return length = <font color='#D02572'>2</font>,
 * with the first two elements of nums being <font color='#D02572'>1</font> and <font color='#D02572'>2</font> respectively.
 * It doesn't matter what you leave beyond the new length.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-08-05
 *
 */
public class A0026_RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0) return 0;

		int index = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[i - 1]) {
				nums[index++] = nums[i];
			}
		}
		return index;
	}

}
