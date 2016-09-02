package com.sid.leetcode;

/**
 * 36. Valid Sudoku.
 *
 * <blockquote>
 * Determine if a Sudoku is valid, according to: <a href='http://sudoku.com.au/TheRules.aspx'>Sudoku Puzzles - The Rules</a>.
 * <p>The Sudoku board could be partially filled, where empty cells are filled with the character <font color='#D02572'>'.'</font>.
 * <p><img src="http://upload.wikimedia.org/wikipedia/commons/thumb/f/ff/Sudoku-by-L2G-20050714.svg/250px-Sudoku-by-L2G-20050714.svg.png"/>
 * <p>A partially filled sudoku which is valid.
 * <p><b>Note:</b>
 * <p>A valid Sudoku board (partially filled) is not necessarily solvable. Only the filled cells need to be validated.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-09-02
 *
 */
public class A0036_ValidSudoku {

	public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == '.') continue;
				if (!cellValid(board, i, j)) return false;
			}
		}
		return true;
	}

	private boolean cellValid(final char[][] board, final int row, final int col) {
		char c = board[row][col];
		for (int i = row + 1; i < board.length; i++) {
			if (board[i][col] == c) return false; 
		}
		for (int j = col + 1; j < board[0].length; j++) {
			if (board[row][j] == c) return false;
		}

		int currentRow = (row / 3 + 1) * 3, currentCol = (col / 3 + 1) * 3;
		for (int m = row + 1; m < currentRow; m++) {
			for (int n = currentCol - 3; n < currentCol; n++) {
				if (board[m][n] == c) return false;
			}
		}
		return true;
	}

}
