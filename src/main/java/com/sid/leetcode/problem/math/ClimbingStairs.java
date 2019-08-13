package com.sid.leetcode.problem.math;

/**
 * 70. Climbing Stairs.
 *
 * <blockquote>
 * You are climbing a stair case. It takes n steps to reach to the top.
 * <p>Each time you are either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * <p>
 * <b>Note:</b> Given n will be a positive integer.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> 2
 * <p><b>Output:</b> 2
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> 3
 * <p><b>Output:</b> 3
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-31
 *
 */
public class ClimbingStairs {

	// Fibonacci Number

	public int climbStairs(final int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        
        int f1 = 1;
        int f2 = 2;
        int f3 = 0;
        for (int i = 3; i <= n; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        return f3;
    }

}
