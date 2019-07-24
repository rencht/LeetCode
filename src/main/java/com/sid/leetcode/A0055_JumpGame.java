package com.sid.leetcode;

/**
 * 55. Jump Game.
 *
 * <blockquote>
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p>Each element in the array represents your maximum jump length at that position.
 * <p>Determine if you are able to reach the last index. 
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> [ 2, 3, 1, 1, 4 ]
 * <p><b>Output:</b> true
 * <p><b>Explanation:</b> Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> [ 3, 2, 1, 0, 4 ]
 * <p><b>Output:</b> false
 * <p><b>Explanation:</b> You will always arrive at index 3 no matter what.
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-24
 *
 */
public class A0055_JumpGame {

	// Greedy

	public boolean canJump(final int[] nums) {
		if (nums.length == 1) return true;

        int max = 0;  // Maximum index can arrive at
        for (int i = 0; i < nums.length - 1; i++) {
            if (max < i) return false;  // If can not arrive at current index, return false
            max = Math.max(max, i + nums[i]);  // Maximum index can arrive at (from 0 to i)
            if (max >= nums.length - 1) return true;  // Arrive at the last index, return true
        }
        return false;
    }

}
