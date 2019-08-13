package com.sid.leetcode.problem.puzzle;

import java.util.ArrayList;
import java.util.List;

/**
 * 51. N-Queens.
 *
 * <blockquote>
 * The n-queens puzzle is the problem of placing n queens on an n×n chessboard such that no two queens atack each other.
 * <p><img src="https://assets.leetcode.com/uploads/2018/10/12/8-queens.png"/>
 * <p>Given an integer n, return all distinct solutions to the n-queens puzzle.
 * <p>Each solution contains a distinct board configuration of the n-queens' placement, where 'Q' and '.' both indicate a
 * queen and an empty space respectively.
 * 
 * 
 * <p>
 * <b>Example:</b>
 * <blockquote>
 * <b>Input:</b> 4
 * <p><b>Output:</b>
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
 * @version 1.0, 2019-07-22
 *
 */
public class NQueens {

	// DFS

	public List<List<String>> solveNQueens(int n) {
        final List<List<String>> result = new ArrayList<List<String>>();

        final List<String> board = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            board.add("");
        }

        this.dfs(result, board, 0);

        return result;
    }
    
    private void dfs(final List<List<String>> result, final List<String> board, final int i) {
        for (final String row : this.validPos(board, i)) {
            board.remove(i);
            board.add(i, row);

            if (i == board.size() - 1) {
                result.add(new ArrayList<String>(board));
                continue;
            }

            this.dfs(result, board, i + 1);
        }
    }

    private List<String> validPos(final List<String> board, final int i) {
        final boolean[] flags = new boolean[board.size()];
        for (int j = 0; j < i; j++) {
            final int k = board.get(j).indexOf("Q");
            flags[k] = true;

            final int l = k + j - i;
            if (l >= 0) flags[l] = true;

            final int r = k + i - j;
            if (r < board.size()) flags[r] = true;
        }
        final List<String> result = new ArrayList<String>();
        for (int j = 0; j < flags.length; j++) {
            if (!flags[j]) result.add(this.row(j, board.size()));
        }
        return result;
    }

    private String row(final int i, final int n) {
        final char[] chs = new char[n];
        for (int j = 0; j < n; j++) {
            chs[j] = i == j ? 'Q' : '.';
        }
        return String.valueOf(chs);
    }

}
