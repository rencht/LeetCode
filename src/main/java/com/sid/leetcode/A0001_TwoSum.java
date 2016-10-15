package com.sid.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum.
 *
 * <blockquote>
 * Given an array of integers, return <b>indices</b> of the two numbers such that they add up to a specific target.
 * <p>You may assume that each input would have <b><i>exactly</i></b> one solution.
 * <p><b>Example</b>:
 * <blockquote>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>Because nums[<b>0</b>] + nums[<b>1</b>] = 2 + 7 = 9, return [<b>0</b>, <b>1</b>].
 * </blockquote>
 *
 * <p><font color='red'><b>UPDATE (2016/2/13):</b></font>
 * <p>The return format had been changed to <b>zero-based</b> indices. Please read the above updated description carefully.
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-09
 *
 */
public class A0001_TwoSum {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> mapping = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums.length; i++) {
			int other = target - nums[i];
			if (mapping.containsKey(other)) {
				return new int[] { mapping.get(other), i };
			}
			mapping.put(nums[i], i);
		}
		return null;
	}

}
