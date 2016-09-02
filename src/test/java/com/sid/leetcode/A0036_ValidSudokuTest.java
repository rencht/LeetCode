package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0036_ValidSudokuTest {

	private A0036_ValidSudoku problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0036_ValidSudoku();
	}

	@Test
	public void testIsValidSudoku() throws Exception {
		assertTrue(problem.isValidSudoku(new char[][] { "53..7....".toCharArray(),
														"6..195...".toCharArray(),
														".98....6.".toCharArray(),
														"8...6...3".toCharArray(),
														"4..8.3..1".toCharArray(),
														"7...2...6".toCharArray(),
														".6....28.".toCharArray(),
														"...419..5".toCharArray(),
														"....8..79".toCharArray()}));

		assertFalse(problem.isValidSudoku(new char[][] { "53..7.5..".toCharArray(),
														 "6..195...".toCharArray(),
														 ".98....6.".toCharArray(),
														 "8...6...3".toCharArray(),
														 "4..8.3..1".toCharArray(),
														 "7...2...6".toCharArray(),
														 ".6....28.".toCharArray(),
														 "...419..5".toCharArray(),
														 "....8..79".toCharArray()}));

		assertFalse(problem.isValidSudoku(new char[][] { "53..7....".toCharArray(),
									  					 "6..195...".toCharArray(),
									 					 ".98....6.".toCharArray(),
														 "8...6...3".toCharArray(),
														 "4..8.3..1".toCharArray(),
														 "7...2...6".toCharArray(),
														 ".6....28.".toCharArray(),
														 "5..419..5".toCharArray(),
														 "....8..79".toCharArray()}));

		assertFalse(problem.isValidSudoku(new char[][] { "53..7....".toCharArray(),
														 "65.195...".toCharArray(),
														 ".98....6.".toCharArray(),
														 "8...6...3".toCharArray(),
														 "4..8.3..1".toCharArray(),
														 "7...2...6".toCharArray(),
														 ".6....28.".toCharArray(),
														 "...419..5".toCharArray(),
														 "....8..79".toCharArray()}));

		assertFalse(problem.isValidSudoku(new char[][] { "..5......".toCharArray(),
														 "...8...3.".toCharArray(),
														 ".5..2....".toCharArray(),
														 ".........".toCharArray(),
														 "........9".toCharArray(),
														 "......4..".toCharArray(),
														 "........7".toCharArray(),
														 ".1.......".toCharArray(),
														 "24....9..".toCharArray()}));
	}

}
