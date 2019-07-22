package com.sid.leetcode;

/**
 * 53. Maximum Subarray.
 *
 * <blockquote>
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the lagest sum
 * and return the sum.
 * 
 * <p>
 * <b>Example:</b>
 * <blockquote>
 * <b>Input:</b> [ -2, 1, -3, 4, -1, 2, 1, -5, 4 ],
 * <p><b>Output:</b> 6
 * <p><b>Explanation:</b> [ 4, -1, 2, 1 ] has the largest sum = 6.
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-23
 *
 */
public class A0053_MaximumSubarray {

	public int maxSubArray(final int[] nums) {
        int maxSoFar = nums[0], maxEndingHere = nums[0];
        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

}
