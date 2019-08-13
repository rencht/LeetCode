package com.sid.leetcode.problem.math;

/**
 * 69. Sqrt(x).
 *
 * <blockquote>
 * Implement int sqrt(int x).
 * <p>Compute and return the square root of x, where x is guarranteed to be a non-negative integer.
 * <p>Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> 4
 * <p><b>Output:</b> 2
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> 8
 * <p><b>Output:</b> 2
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-31
 *
 */
public class Sqrt {

	// Newton method

	public int mySqrt(final int x) {
        long r = x;
        while (r * r > x)
            r = (r + x / r) >> 1;
        return (int) r;
    }

}
