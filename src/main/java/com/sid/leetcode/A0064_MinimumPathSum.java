package com.sid.leetcode;

/**
 * 64. Minimum Path Sum.
 *
 * <blockquote>
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right which minimizes the sum
 * of all numbers along its path.
 * 
 * <p><b>Note:</b> You can only move either down or right at any point in time.
 * 
 * <p>
 * <b>Example:</b>
 * <blockquote>
 * <b>Input:</b>
 * <p>[
 * <pre>[ 1, 3, 1 ],
 * <p>[ 1, 5, 1 ],
 * <p>[ 4, 2, 1 ]
 * <p>]
 * <p><b>Output:</b> 7
 * <p><b>Explanation:</b> Because the path 1->3->1->1->1 minimizes the sum.
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-29
 *
 */
public class A0064_MinimumPathSum {

	// Dynamic Programming

	public int minPathSum(final int[][] grid) {
        final int m = grid.length, n = grid[0].length;

        for (int i = 1; i < n; i++) grid[0][i] += grid[0][i - 1];
        for (int i = 1; i < m; i++) grid[i][0] += grid[i - 1][0];

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[m - 1][n - 1];
    }

}
