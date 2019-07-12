package com.sid.leetcode;

/**
 * 31. Next Permutation.
 *
 * <blockquote>
 * Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
 * <p>If such arrangement is not possible, it must rearrange it as the lowest possible order (ie, sorted in ascending order).
 * <p>The replacement must be in-place, do not allocate extra memory.
 * <p>Here are some examples. Inputs are in the left-hand column and its corresponding outputs are in the right-hand column.
 * <p><font color='#D02572'>1,2,3</font> -> <font color='#D02572'>1,3,2</font>
 * <p><font color='#D02572'>3,2,1</font> -> <font color='#D02572'>1,2,3</font>
 * <p><font color='#D02572'>1,1,5</font> -> <font color='#D02572'>1,5,1</font>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-08-12
 *
 */
public class A0031_NextPermutation {

	public void nextPermutation(int[] nums) {
		int lastIndex = nums.length - 1;

		int reverseIndex = 0;
		for (int i = lastIndex; i >= 1; i--) {
			if (nums[i] > nums[i - 1]) {
				reverseIndex = i;
				int temp = nums[i - 1];
				for (int j = lastIndex; j >= i; j--) {
					if (nums[j] > temp) {
						nums[i - 1] = nums[j];
						nums[j] = temp;
						break;
					}
				}
				i = 0;
			}
		}

		for (int i = reverseIndex, j = lastIndex; i < j; i++, j--) {
			nums[i] ^= nums[j];
			nums[j] ^= nums[i];
			nums[i] ^= nums[j];
		}
	}

}
