package com.sid.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 18. 4Sum.
 *
 * <blockquote>
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.
 * <p><b>Note:</b> The solution set must not contain duplicate quadruplets.
 * <blockquote>
 * For example, given array S = [1, 0, -1, 0, -2, 2], and target = 0.
 * <p>A solution set is:
 * <p>[
 * <p><pre>[-1,  0, 0, 1],</pre>
 * <p><pre>[-2, -1, 1, 2],</pre>
 * <p><pre>[-2,  0, 0, 2]</pre>
 * <p>]
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-29
 *
 */
public class A0018_4Sum {

	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> quadruplets = new ArrayList<List<Integer>>();
		if (nums.length >= 4) {
			Arrays.sort(nums);

			int temp = 0, halfTemp = 0, start = 0, end = 0;
			for (int i = 0; i < nums.length - 3; i++) {
				if (i == 0 || nums[i] != nums[i - 1]) {
					for (int j = i + 1; j < nums.length - 2; j++) {
						if (j == i + 1 || nums[j] != nums[j - 1]) {
							temp = target - nums[i] - nums[j];
							halfTemp = temp >> 1;
							start = j + 1;
							end = nums.length - 1;
							while (start < end && nums[start] <= halfTemp && nums[end] >= halfTemp) {
								if (nums[start] + nums[end] < temp) {
									while (nums[start] == nums[++start] && start < end);
								} else if (nums[start] + nums[end] > temp) {
									while (nums[end] == nums[--end] && start < end);
								} else {
									quadruplets.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
									while (nums[start] == nums[++start] && start < end);
									while (nums[end] == nums[--end] && start < end);
								}
							}
						}
					}
				}
			}
		}
		return quadruplets;
	}

}
