package com.sid.leetcode;

/**
 * 4. Median of Two Sorted Arrays.
 *
 * <blockquote>
 * There are two sorted arrays <b>nums1</b> and <b>nums2</b> of size m and n respectively.
 * <p>Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * 
 * <p>You may assume <b>nums1</b> and <b>nums2</b> cannot be both empty.
 *
 * <p><b>Example 1:</b>
 * <blockquote>
 * nums1 = [1, 3]
 * <p>nums2 = [2]
 * <p>The median is 2.0
 * </blockquote>
 *
 * <p><b>Example 2:</b>
 * <blockquote>
 * nums1 = [1, 2]
 * <p>nums2 = [3, 4]
 * <p>The median is (2 + 3)/2 = 2.5
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-10-15
 *
 */
public class A0004_MedianOfTwoSortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		return (nums1.length <= nums2.length) ? findMedian(nums1, nums2) : findMedian(nums2, nums1);
	}

	private double findMedian(final int[] shortNums, final int[] longNums) {
		int lenS = shortNums.length, lenL = longNums.length, len = lenS + lenL;

		int startS = 0, endS = lenS;
		int posS = (startS + endS) >> 1;
		int posL = (len >> 1) - posS;

		int shortLeft = 0, shortRight = 0, longLeft = 0, longRight = 0;
		do {
			shortLeft = (posS == 0) ? Integer.MIN_VALUE : shortNums[posS - 1];
			shortRight = (posS == lenS) ? Integer.MAX_VALUE : shortNums[posS];
			longLeft = (posL == 0) ? Integer.MIN_VALUE : longNums[posL - 1];
			longRight = (posL == lenL) ? Integer.MAX_VALUE : longNums[posL];

			if (longLeft <= shortRight && shortLeft <= longRight) {
				break;
			}
			if (shortLeft <= longRight) {
				startS = posS + 1;
			} else {
				endS = posS - 1;
			}
			posS = (startS + endS) >> 1;
			posL = (len >> 1) - posS;
		} while (true);

		int leftMax = Math.max(shortLeft, longLeft);
		int rightMin = Math.min(shortRight, longRight);

		return (len % 2 == 0) ? (leftMax + rightMin) / 2.0 : rightMin;
	}

}
