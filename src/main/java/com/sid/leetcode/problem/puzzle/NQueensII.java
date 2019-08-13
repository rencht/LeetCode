package com.sid.leetcode.problem.puzzle;

/**
 * 52. N-Queens II.
 *
 * <blockquote>
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens atack each other.
 * <p><img src="https://assets.leetcode.com/uploads/2018/10/12/8-queens.png"/>
 * <p>Given an integer n, return the number of distinct solutions to the n-queens puzzle.
 * 
 * <p>
 * <b>Example:</b>
 * <blockquote>
 * <b>Input:</b> 4
 * <p><b>Output:</b> 2
 * <b>Explanation:</b> There are two distinct solutions to the 4-queens puzzle as shown below.
 * <p>[
 * <pre>[ ".Q..",
 * <p>  "...Q",
 * <p>  "Q...",
 * <p>  "..Q."],
 * <p>[ "..Q.",
 * <p>  "Q...",
 * <p>  "...Q",
 * <p>  ".Q.."]
 * </pre>
 * <p>]
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-23
 *
 */
public class NQueensII {

	int count = 0;

	public int totalNQueens(final int n) {
		count = 0;

        boolean[] cols = new boolean[n];
        boolean[] d1 = new boolean[2 * n];
        boolean[] d2 = new boolean[2 * n];
        backtracking(0, cols, d1, d2, n);

        return count;
    }
    
	private void backtracking(final int row, final boolean[] cols, final boolean[] d1, final boolean[] d2, final int n) {
		if (row == n) count++;

		for (int col = 0; col < n; col++) {
			int id1 = col - row + n;
			int id2 = col + row;
			if (cols[col] || d1[id1] || d2[id2]) continue;

			cols[col] = true;
			d1[id1] = true;
			d2[id2] = true;
			backtracking(row + 1, cols, d1, d2, n);
			cols[col] = false;
			d1[id1] = false;
			d2[id2] = false;
		}
	}

}
