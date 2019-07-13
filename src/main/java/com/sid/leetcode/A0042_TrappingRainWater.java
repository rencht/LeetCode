package com.sid.leetcode;

/**
 * 42. Trapping Rain Water.
 *
 * <blockquote>
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water
 * it is able to trap after raining.
 * <p><img src="https://assets.leetcode.com/uploads/2018/10/22/rainwatertrap.png"/>
 * <p>The above elevation map is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water
 * (blue section) are being trapped.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-13
 *
 */
public class A0042_TrappingRainWater {

	// Dynamic Programming

	public int trap(final int[] height) {
		if (height.length < 3) return 0;

        final int[] result = new int[height.length];
        result[0] = 0;
        result[1] = 0;

        int highest = height[0] > height[1] ? 0 : 1;

        for (int i = 2; i < height.length; i++) {
        	final int previous = this.findPrevious(height, i, highest);

        	if (height[i] >= height[highest]) highest = i;

        	if (previous < 0) {
        		result[i] = result[i - 1];
        		continue;
        	}

        	final int area = (i - previous - 1) * Math.min(height[i], height[previous]);
        	int used = 0;
        	for (int j = previous + 1; j < i; j++) {
        		used += height[j];
        	}
        	result[i] = result[previous] + area - used;
        }

        return result[height.length - 1];
    }

	private int findPrevious(final int[] height, final int current, final int highest) {
		if (height[current] <= height[current - 1]) return -1;
		if (height[current] >= height[highest]) return highest;
		for (int i = current - 2; i >= 0; i--) {
			if (height[i] >= height[current]) return i;
		}
		return -1;
	}

}
