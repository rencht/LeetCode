package com.sid.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 54. Spiral Matrix.
 *
 * <blockquote>
 * Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b>
 * <p>[
 * <pre>[ 1, 2, 3 ],
 * <p>[ 4, 5, 6 ],
 * <p>[ 7, 8, 9 ]
 * </pre>
 * <p>]
 * <p><b>Output:</b> [ 1, 2, 3, 6, 9, 8, 7, 4, 5 ]
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b>
 * <p>[
 * <pre>[ 1, 2, 3， 4 ],
 * <p>[ 5, 6, 7, 8 ],
 * <p>[ 9, 10, 11, 12 ]
 * </pre>
 * <p>]
 * <p><b>Output:</b> [ 1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7 ]
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-23
 *
 */
public class A0054_SpiralMatrix {

	public List<Integer> spiralOrder(final int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return new ArrayList<Integer>();

        final int total = matrix.length * matrix[0].length;

        int rs = 0, re = matrix.length - 1, cs = 0, ce = matrix[0].length - 1;

        final List<Integer> result = new ArrayList<Integer>();

        while (result.size() < total) {
        	// West -> East at start row
            for (int i = cs; i <= ce; i++) result.add(matrix[rs][i]);
            rs++;

            // North -> South at end column
            for (int i = rs; i <= re; i++) result.add(matrix[i][ce]);
            ce--;

            if (result.size() < total) {
            	// East -> West at end row
                for (int i = ce; i >= cs; i--) result.add(matrix[re][i]);
                re--;

                // South -> North at start column
                for (int i = re; i >= rs; i--) result.add(matrix[i][cs]);
                cs++;
            }
        }

        return result;
    }

}
