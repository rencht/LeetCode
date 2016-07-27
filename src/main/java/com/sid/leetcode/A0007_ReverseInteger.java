package com.sid.leetcode;

/**
 * 7. Reverse Integer.
 *
 * <blockquote>
 * Reverse digits of an integer.
 * <p><b>Example1:</b> x = 123, return 321
 * <p><b>Example2:</b> x = -123, return -321
 *
 * <p><b><font color='red'>Returns 0 when the reversed integer overflows</font></b>.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-26
 *
 */
public class A0007_ReverseInteger {

	static final int OVERFLOW = 0;

	public int reverse(int x) {
		if (x == Integer.MIN_VALUE)	return OVERFLOW;
		if (x < 0) return -reverse(-x);
		if (x < 10) return x;

		int temp = x;
		int result = 0;
		while (temp >= 10) {
			result = result * 10 + temp % 10;
			temp /= 10;
		}
		if ((Integer.MAX_VALUE - temp) / 10 < result) {
			return OVERFLOW;
		}
		return result * 10 + temp;
	}

}
