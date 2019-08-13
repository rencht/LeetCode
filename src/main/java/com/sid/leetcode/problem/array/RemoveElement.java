package com.sid.leetcode.problem.array;

/**
 * 27. Remove Element.
 *
 * <blockquote>
 * Given an array and a value, remove all instances of that value in place and return the new length.
 * <p>Do not allocate extra space for another array, you must do this in place with constant memory.
 * <p><b>The order of elements can be changed</b>. It doesn't matter what you leave beyond the new length.
 * <p><b>Example:</b>
 * <p>Given input array nums = <font color='#D02572'>[3,2,2,3]</font>, val = <font color='#D02572'>3</font>
 * <p>Your function should return length = 2, with the first two elements of nums being 2.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-08-05
 *
 */
public class RemoveElement {

	public int removeElement(int[] nums, int val) {
		if (nums == null || nums.length == 0) return 0;

		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[index++] = nums[i];
			}
		}
		return index;
	}

}
