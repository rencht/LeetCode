package com.sid.leetcode;

/**
 * 50. Pow(x, n).
 *
 * <blockquote>
 * Implement pow(x, n), which calculates x raised to the power n.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> 2.00000, 10
 * <p><b>Output:</b> 1024.00000
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> 2.10000, 3
 * <p><b>Output:</b> 9.26100
 * </blockquote>
 * 
 * <p>
 * <b>Example 3:</b>
 * <blockquote>
 * <b>Input:</b> 2.00000, -2
 * <p><b>Output:</b> 0.2500
 * </blockquote>
 * 
 * <p>
 * <b>Note:</b>
 * <li>-100.0 < x < 100.0.</li>
 * <li>n is a 32-bit signed integer, within the range [Integer.MIN_VALUE, Integer.MAX_VALUE].</li>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-22
 *
 */
public class A0050_Pow {

	public double myPow(final double x, final int n) {
        if (n == 0) return 1;
        if (n == 1) return x;
        if (n == -1) return 1 / x;

        final double half = this.myPow(x, n / 2);
        return (n % 2 == 0) ? (half * half) : ((n > 0) ? (half * half * x) : (half * half / x));
    }

}
