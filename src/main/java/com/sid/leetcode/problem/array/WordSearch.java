package com.sid.leetcode.problem.array;

/**
 * 79. Word Search.
 *
 * <blockquote>
 * Given a 2D board and a word, find if the word exists in the grid.
 * <p>The word can be constructed from letters of sequentially adjacent cell, where "adjacent" cells are those horizontally
 * or vertically neighboring. The same letter cell may not be used more than once.
 * 
 * <p>
 * <b>Example:</b>
 * <blockquote>
 * board = [ [ 'A', 'B', 'C', 'E' ], [ 'S', 'F', 'C', 'S' ], [ 'A', 'D', 'E', 'E' ] ]
 * <p>Given word = "ABCCED", return true.
 * <p>Given word = "SEE", return true.
 * <p>Given word = "ABCB", return false.
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-08-05
 *
 */
public class WordSearch {

	// DFS

	public boolean exist(final char[][] board, final String word) {
        if (board.length == 0) return false;

        final boolean[][] flag = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
        	for (int j = 0; j < board[0].length; j++) {
        		if (board[i][j] == word.charAt(0)) {
        			if (this.exist(board, word, flag, i, j, 0)) return true;
        		}
        	}
        }
        return false;
    }

	private boolean exist(final char[][] board, final String word, final boolean[][] flag, final int boardRow, final int boardColumn, final int wordIndex) {
		if (wordIndex >= word.length()) return true;
		if (boardRow < 0 || boardRow >= board.length || boardColumn < 0 || boardColumn >= board[0].length) return false;
		if (board[boardRow][boardColumn] != word.charAt(wordIndex) || flag[boardRow][boardColumn]) return false;

		flag[boardRow][boardColumn] = true;

		if (this.exist(board, word, flag, boardRow - 1, boardColumn, wordIndex + 1) ||
			this.exist(board, word, flag, boardRow + 1, boardColumn, wordIndex + 1) ||
			this.exist(board, word, flag, boardRow, boardColumn - 1, wordIndex + 1) ||
			this.exist(board, word, flag, boardRow, boardColumn + 1, wordIndex + 1)) return true;

		flag[boardRow][boardColumn] = false;

		return false;
	}

}
