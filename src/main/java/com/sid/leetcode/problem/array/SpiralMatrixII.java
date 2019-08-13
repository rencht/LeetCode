package com.sid.leetcode.problem.array;

/**
 * 59. Spiral Matrix II.
 *
 * <blockquote>
 * Given a positive integer n, generate a square matrix filled with elements from 1 to n*n in spiral order.
 * 
 * <p>
 * <b>Example :</b>
 * <blockquote>
 * <b>Input:</b> 3
 * <p><b>Output:</b>
 * <p>[
 * <pre>[ 1, 2, 3 ],
 * <p>[ 8, 9, 4 ],
 * <p>[ 7, 6, 5 ]
 * </pre>
 * <p>]
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-27
 *
 */
public class SpiralMatrixII {

	public int[][] generateMatrix(final int n) {
        final int[][] result = new int[n][n];

        int current = 1, end = n * n;
        int rs = 0, re = n - 1, cs = 0, ce = n - 1;
        while (current <= end) {
        	// West -> East at start row
            for (int i = cs; i <= ce; i++) result[rs][i] = current++;
            rs++;

            // North -> South at end column
            for (int i = rs; i <= re; i++) result[i][ce] = current++;
            ce--;

            if (current <= end) {
            	// East -> West at end row
                for (int i = ce; i >= cs; i--) result[re][i] = current++;
                re--;

                // South -> North at start column
                for (int i = re; i >= rs; i--) result[i][cs] = current++;
                cs++;
            }
        }

        return result;
    }

}
