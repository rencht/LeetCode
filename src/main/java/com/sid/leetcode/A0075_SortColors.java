package com.sid.leetcode;

/**
 * 75. Sort Colors.
 *
 * <blockquote>
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent,
 * with the colors in the order red, white and blue.
 * <p>Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.
 * <p><b>Note:</b> You are not supposed to use the library's sort function for this problem.
 * 
 * <p>
 * <b>Example:</b>
 * <blockquote>
 * <b>Input:</b> [ 2, 0, 2, 1, 1, 0 ]
 * <p><b>Output:</b> [ 0, 0, 1, 1, 2, 2 ]
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-08-01
 *
 */
public class A0075_SortColors {

	// Two pointers

	public void sortColors(final int[] nums) {
        int red = 0;
        int blue = nums.length - 1;

        for (int i = 0; i <= blue; i++) {
            if (nums[i] == 0) { // red
                nums[i] = nums[red];
                nums[red++] = 0;
            } else if (nums[i] == 2) { // blue
                nums[i--] = nums[blue];
                nums[blue--] = 2;
            }
        }
    }

}
