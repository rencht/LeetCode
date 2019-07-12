package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0037_SudokuSolverTest {

	private A0037_SudokuSolver problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0037_SudokuSolver();
	}

	@Test
	public void testSolveSudoku() throws Exception {
		{
			final char[][] board = new char[][] {
	            "53..7....".toCharArray(),
	            "6..195...".toCharArray(),
	            ".98....6.".toCharArray(),
	            "8...6...3".toCharArray(),
	            "4..8.3..1".toCharArray(),
	            "7...2...6".toCharArray(),
	            ".6....28.".toCharArray(),
	            "...419..5".toCharArray(),
	            "....8..79".toCharArray()
	        };

	        problem.solveSudoku(board);

	        assertEquals("534678912", String.valueOf(board[0]));
	        assertEquals("672195348", String.valueOf(board[1]));
	        assertEquals("198342567", String.valueOf(board[2]));
	        assertEquals("859761423", String.valueOf(board[3]));
	        assertEquals("426853791", String.valueOf(board[4]));
	        assertEquals("713924856", String.valueOf(board[5]));
	        assertEquals("961537284", String.valueOf(board[6]));
	        assertEquals("287419635", String.valueOf(board[7]));
	        assertEquals("345286179", String.valueOf(board[8]));
		}

		{
			final char[][] board = new char[][] {
	            "..9748...".toCharArray(),
	            "7........".toCharArray(),
	            ".2.1.9...".toCharArray(),
	            "..7...24.".toCharArray(),
	            ".64.1.59.".toCharArray(),
	            ".98...3..".toCharArray(),
	            "...8.3.2.".toCharArray(),
	            "........6".toCharArray(),
	            "...2759..".toCharArray()
	        };

	        problem.solveSudoku(board);

	        assertEquals("519748632", String.valueOf(board[0]));
	        assertEquals("783652419", String.valueOf(board[1]));
	        assertEquals("426139875", String.valueOf(board[2]));
	        assertEquals("357986241", String.valueOf(board[3]));
	        assertEquals("264317598", String.valueOf(board[4]));
	        assertEquals("198524367", String.valueOf(board[5]));
	        assertEquals("975863124", String.valueOf(board[6]));
	        assertEquals("832491756", String.valueOf(board[7]));
	        assertEquals("641275983", String.valueOf(board[8]));
		}
	}

}
