package com.sid.leetcode;

/**
 * 80. Remove Duplicates from Sorted Array II.
 *
 * <blockquote>
 * Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.
 * <p>Do not allocate extra space for another array, you mush do this by modifying the input array in-place with O(1) extra memory.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * Given nums = [ 1, 1, 1, 2, 2, 3 ]
 * <p>Your function should return length = 5, with the first five elements of nums being 1, 1, 2, 2 and 3 respectively.
 * <p>It doesn't matter what you leave beyond the returned length.
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * Given nums = [ 0, 0, 1, 1, 1, 1, 2, 3, 3 ]
 * <p>Your function should return length = 7, with the first seven elements of nums being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.
 * <p>It doesn't matter what values are set beyond the returned length.
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-08-06
 *
 */
public class A0080_RemoveDuplicatesFromSortedArrayII {

	public int removeDuplicates(final int[] nums) {
		if (nums.length <= 2) return nums.length;

		int index = 2;
		for (int i = 2; i < nums.length; i++) {
			if (nums[i] != nums[index - 2]) {
				nums[index++] = nums[i];
			}
		}
		return index;
    }

}
