package com.sid.leetcode;

/**
 * 11. Container With Most Water.
 *
 * <blockquote> Given n non-negative integers a1, a2, ..., an, where each
 * represents a point at coordinate (i, ai). n vertical lines are drawn such
 * that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines,
 * which together with x-axis forms a container, such that the container
 * contains the most water.
 * <p>Note: You may not slant the container.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-27
 *
 */
public class A0011_ContainerWithMostWater {

	public int maxArea(int[] height) {
		int max = 0;
		int start = 0, end = height.length - 1;
		while (start < end) {
			if (height[start] < height[end]) {
				max = Math.max(max, (end - start) * height[start]);
				start++;
			} else {
				max = Math.max(max, (end - start) * height[end]);
				end--;
			}
		}
		return max;
	}

}
