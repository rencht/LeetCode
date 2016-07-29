package com.sid.leetcode;

import java.util.Arrays;

/**
 * 16. 3Sum Closest.
 *
 * <blockquote>
 * Given an array S of n integers, find three integers in S such that the sum is closest to a given number, target.
 * Return the sum of the three integers.
 * You may assume that each input would have exactly one solution.
 * <blockquote>
 * For example, given array S = {-1 2 1 -4}, and target = 1.
 * <p>The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-29
 *
 */
public class A0016_3SumClosest {

	public int threeSumClosest(int[] nums, int target) {
		if (nums.length <= 3) {
			int sum = 0;
			for (int i : nums) {
				sum += i;
			}
			return sum;
		} else {
			Arrays.sort(nums);

			int closest = 0;
			int distance = Integer.MAX_VALUE;

			int temp = 0, start = 0, end = 0, currDis = 0;
			for (int i = 0; i < nums.length - 2; i++) {
				if (i == 0 || nums[i] != nums[i - 1]) {
					temp = target - nums[i];
					start = i + 1;
					end = nums.length - 1;
					while (start < end) {
						if (nums[start] + nums[end] < temp) {
							currDis = temp - nums[start] - nums[end];
							if (currDis < distance) {
								distance = currDis;
								closest = target - distance;
							}
							while (nums[start] == nums[++start] && start < end);
						} else if (nums[start] + nums[end] > temp) {
							currDis = nums[start] + nums[end] - temp;
							if (currDis < distance) {
								distance = currDis;
								closest = target + distance;
							}
							while (nums[end] == nums[--end] && start < end);
						} else {
							return target;
						}
					}
				}
			}
			return closest;
		}
	}

}
