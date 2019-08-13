package com.sid.leetcode.problem.maze;

/**
 * 63. Unique Paths II.
 *
 * <blockquote>
 * A robot is located at the top-left corner of a m x n grid (marked 'Start' in the diagram below).
 * <p>The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid (marked 'Finish' in the diagram below).
 * <p>Now consider if some obstacles are added to the grids. How many unique paths would there be?
 * <p><img src="https://assets.leetcode.com/uploads/2018/10/22/robot_maze.png"/>
 * <p>An obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * 
 * <p>
 * <b>Note:</b> m and n will be at most 100.
 * 
 * <p>
 * <b>Example:</b>
 * <blockquote>
 * <b>Input:</b>
 * <p>[
 * <pre>[ 0, 0, 0 ],
 * <p>[ 0, 1, 0 ],
 * <p>[ 0, 0, 0 ]
 * <p>]
 * <p><b>Output:</b> 2
 * <p><b>Explanation:</b>
 * <p>There is one obstacle in the middle of the 3x3 grid above.
 * <p>There are two ways to reach the bottom-right corner:
 * <p>1. Right -> Right -> Down -> Down
 * <p>2. Down -> Down -> Right -> Right
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-29
 *
 */
public class UniquePathsII {

	// Dynamic Programming

	public int uniquePathsWithObstacles(final int[][] obstacleGrid) {
        final int m = obstacleGrid.length, n = obstacleGrid[0].length;

        obstacleGrid[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;
        for (int i = 1; i < n; i++) obstacleGrid[0][i] = obstacleGrid[0][i] == 1 ? 0 : obstacleGrid[0][i - 1];
        for (int i = 1; i < m; i++) obstacleGrid[i][0] = obstacleGrid[i][0] == 1 ? 0 : obstacleGrid[i - 1][0];

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                obstacleGrid[i][j] = obstacleGrid[i][j] == 1 ? 0 : (obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1]);
            }
        }

        return obstacleGrid[m - 1][n - 1];
    }

}
