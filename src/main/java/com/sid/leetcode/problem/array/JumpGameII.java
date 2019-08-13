package com.sid.leetcode.problem.array;

/**
 * 45. Jump Game II.
 *
 * <blockquote>
 * Given an array of non-negative integers, you are initially positioned at the first index of the array.
 * <p>Each element in the array represents your maximum jump length at that position.
 * <p>Your goal is to reach the last index in the minimum number of jumps. 
 * 
 * <p>
 * <b>Example:</b>
 * <blockquote>
 * <b>Input:</b> [ 2, 3, 1, 1, 4 ]
 * <p><b>Output:</b> 2
 * <p><b>Explanation:</b> The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.
 * </blockquote>
 * 
 * <p>
 * <b>Note:</b>
 * <p>You can assume that you can always reach the last index.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-18
 *
 */
public class JumpGameII {

	// Greedy

	public int jump(int[] nums) {
        int step = 0, currentEnd = 0, currentFarest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currentFarest = Math.max(currentFarest, i + nums[i]);
            if (i == currentEnd) {
                step++;
                currentEnd = currentFarest;
            }
        }
        return step;
    }

}
