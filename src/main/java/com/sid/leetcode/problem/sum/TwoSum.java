package com.sid.leetcode.problem.sum;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum.
 *
 * <blockquote>
 * Given an array of integers, return <b>indices</b> of the two numbers such that they add up to a specific target.
 * <p>You may assume that each input would have <b><i>exactly</i></b> one solution, and you may not use the same element twice.
 * <p><b>Example</b>:
 * <blockquote>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>Because nums[<b>0</b>] + nums[<b>1</b>] = 2 + 7 = 9, return [<b>0</b>, <b>1</b>].
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-09
 *
 */
public class TwoSum {

	public int[] twoSum(final int[] nums, final int target) {
		final Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			final int other = target - nums[i];
			if (map.containsKey(other)) {
				return new int[] { map.get(other), i };
			}
			map.put(nums[i], i);
		}
		return null;
	}

}
