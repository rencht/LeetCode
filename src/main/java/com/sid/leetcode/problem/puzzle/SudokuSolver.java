package com.sid.leetcode.problem.puzzle;

import java.util.Arrays;

/**
 * 37. Sudoku Solver.
 *
 * <blockquote>
 * Write a program to solve a Sudoku puzzle by filling the empty cells.
 * 
 * <p>A sudoku solution must satisfy all of the following rules:
 * <blockquote>
 * <li>1. Each of the digits 1-9 must occur exactly once in each row.</li>
 * <li>2. Each of the digits 1-9 must occur exactly once in each column.</li>
 * <li>3. Each of the digits 1-9 must occur exactly once in each of the 9 3x3 sub-boxes of the grid.</li>
 * </blockquote>
 * 
 * <p>Empty cells are indicated by the character '.'.
 * <p><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png"/>
 * <p>A sudoku puzzle...
 * 
 * <p><img src="https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Sudoku-by-L2G-20050714_solution.svg/250px-Sudoku-by-L2G-20050714_solution.svg.png"/>
 * <p>...and its solution numbers marked in red.
 * 
 * <p>Note:
 * <blockquote>
 * <li>The given board contain only digits 1-9 and the character '.'.</li>
 * <li>You may assume that the given Sudoku puzzle will have a single unique solution.</li>
 * <li>The given board size is always 9x9.</li>
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-12
 *
 */
public class SudokuSolver {

	public void solveSudoku(final char[][] board) {
		dfs(board, 0);
	}

	private boolean dfs(final char[][] board, final int d) {
		if (d == 81) return true;
		final int i = d / 9, j = d % 9;
		if (board[i][j] != '.') return dfs(board, d + 1);

		final boolean[] flag = new boolean[10];
		validate(board, i, j, flag);

		for (int k = 1; k <= 9; k++) {
			if (flag[k]) {
				board[i][j] = (char) ('0' + k);
				if (dfs(board, d + 1)) return true;
			}
		}
		board[i][j] = '.';
		return false;
	}

	private void validate(final char[][] board, final int i, final int j, final boolean[] flag) {
		Arrays.fill(flag, true);

		for (int k = 0; k < 9; k++) {
			if (board[i][k] != '.') flag[board[i][k] - '0'] = false;
			if (board[k][j] != '.') flag[board[k][j] - '0'] = false;

			final int r = i / 3 * 3 + k / 3;
			final int c = j / 3 * 3 + k % 3;
			if (board[r][c] != '.') flag[board[r][c] - '0'] = false;
		}
	}

}
