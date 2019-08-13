package com.sid.leetcode.problem.array;

/**
 * 41. First Missing Positive.
 *
 * <blockquote>
 * Given an unsorted integer array, find the first missing positive integer.
 * <p>For example,
 * <p>Given <font color='#D02572'>[1,2,0]</font> return <font color='#D02572'>3</font>,
 * <p>and <font color='#D02572'>[3,4,-1,1]</font> return <font color='#D02572'>2</font>.
 * <p>Your algorithm should run in O(n) time and uses constant space.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-09-08
 *
 */
public class FirstMissingPositive {

	public int firstMissingPositive(int[] nums) {
		int max = nums.length;
		int i = 0, current = -1;
		while (i < max) {
			current = nums[i];
			if (current == i + 1 || current <= 0 || current > max || current == nums[current - 1]) {
				i++;
				continue;
			}
			nums[i] = nums[current - 1];
			nums[current - 1] = current;
		}

		i = 0;
		while (i < max && nums[i] == i + 1) i++;
		return i + 1;
	}

}
