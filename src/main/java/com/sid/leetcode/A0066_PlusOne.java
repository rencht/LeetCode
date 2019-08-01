package com.sid.leetcode;

/**
 * 66. Plus One.
 *
 * <blockquote>
 * Given a <b>non-empty</b> array of digits representing a non-negative integer, plus one to the integer.
 * <p>The digits are stored such that the most significant digit is at the head of the list, and each element in the array
 * contain a single digit.
 * <p>You may assume the integer does not contain any leading zero, except the number 0 itself. 
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> [ 1, 2, 3 ]
 * <p><b>Output:</b> [ 1, 2, 4 ]
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> [ 4, 3, 2, 1 ]
 * <p><b>Output:</b> [ 4, 3, 2, 2 ]
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-30
 *
 */
public class A0066_PlusOne {

	public int[] plusOne(final int[] digits) {
        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }
        if (carry == 0) return digits;

        final int[] result = new int[digits.length + 1];
        result[0] = carry;
        for (int i = 0; i < digits.length; i++) {
            result[i + 1] = digits[i];
        }
        return result;
    }

}
