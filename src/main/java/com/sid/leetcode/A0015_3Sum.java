package com.sid.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 15. 3Sum.
 *
 * <blockquote>
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.
 * <p><b>Note:</b> The solution set must not contain duplicate triplets.
 * <blockquote>
 * For example, given array S = [-1, 0, 1, 2, -1, -4],
 * <p>A solution set is:
 * <p>[
 * <p><pre>[-1, 0, 1],</pre>
 * <p><pre>[-1, -1, 2]</pre>
 * <p>]
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-28
 *
 */
public class A0015_3Sum {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> triplets = new ArrayList<List<Integer>>();
		if (nums.length >= 3) {
			Arrays.sort(nums);

			int target = 0, halfTarget = 0, start = 0, end = 0;
			for (int i = 0; i < nums.length - 2; i++) {
				if (nums[i] <= 0 && (i == 0 || nums[i] != nums[i - 1])) {
					target = -nums[i];
					halfTarget = target >>> 1;
					start = i + 1;
					end = nums.length - 1;
					while (start < end && nums[start] <= halfTarget && nums[end] >= halfTarget) {
						if (nums[start] + nums[end] < target) {
							while (nums[start] == nums[++start] && start < end);
						} else if (nums[start] + nums[end] > target) {
							while (nums[end] == nums[--end] && start < end);
						} else {
							triplets.add(Arrays.asList(nums[i], nums[start], nums[end]));
							while (nums[start] == nums[++start] && start < end);
							while (nums[end] == nums[--end] && start < end);
						}
					}
				}
			}
		}
		return triplets;
	}

}
