package com.sid.leetcode;

/**
 * 62. Unique Paths.
 *
 * <blockquote>
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p>How many possible unique paths are there?
 * <p><img src="https://assets.leetcode.com/uploads/2018/10/22/robot_maze.png"/>
 * <p>Above is a 7 x 3 grid. How many possible unique paths are there?
 * 
 * <p>
 * <b>Note:</b> m and n will be at most 100.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> m = 3, n = 2
 * <p><b>Output:</b> 3
 * <p><b>Explanation:</b>
 * <p>From the top-left corner, there are a total of 3 ways to reach the bottom-right corner:
 * <p>1. Right -> Right -> Down
 * <p>2. Right -> Down -> Right
 * <p>3. Down -> Right -> Right
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> m = 7, n = 3
 * <p><b>Output:</b> 28
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-29
 *
 */
public class A0062_UniquePaths {

	public int uniquePaths(final int m, final int n) {
        final int[][] paths = new int[m][n];
        for (int i = 0; i < n; i++) paths[0][i] = 1;
        for (int i = 0; i < m; i++) paths[i][0] = 1;

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                paths[i][j] = paths[i - 1][j] + paths[i][j - 1];
            }
        }

        return paths[m - 1][n - 1];
    }

}
