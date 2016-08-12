package com.sid.leetcode;

/**
 * 29. Divide Two Integers.
 *
 * <blockquote>
 * Divide two integers without using multiplication, division and mod operator.
 * <p>If it is overflow, return MAX_INT.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-08-12
 *
 */
public class A0029_DivideTwoIntegers {

	public int divide(int dividend, int divisor) {
		if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

		int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
		int quotient = positiveDivide(Math.abs((long) dividend), Math.abs((long) divisor));
		return sign == 1 ? quotient : -quotient;
	}

	private int positiveDivide(long dividend, long divisor) {
		int quotient = 0;
		while (dividend >= divisor) {
			int multiplier = 1;
			long product = divisor;
			while ((product << 1) <= dividend) {
				product <<= 1;
				multiplier <<= 1;
			}
			quotient += multiplier;
			dividend -= product;
		}
		return quotient;
	}

}
