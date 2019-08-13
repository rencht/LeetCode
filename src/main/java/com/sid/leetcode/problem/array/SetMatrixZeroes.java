package com.sid.leetcode.problem.array;

/**
 * 73. Set Matrix Zeroes.
 *
 * <blockquote>
 * Given a m x n matrix, if an element is 0, set its entire row and column to 0. Do it in-place.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> [ [ 1, 1, 1 ], [ 1, 0, 1 ], [ 1, 1, 1 ] ]
 * <p><b>Output:</b> [ [ 1, 0, 1 ], [ 0, 0, 0 ], [ 1, 0, 1 ] ]
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> [ [ 0, 1, 2, 0 ], [ 3, 4, 5, 2 ], [ 1, 3, 1, 5 ] ]
 * <p><b>Output:</b> [ [ 0, 0, 0, 0 ], [ 0, 4, 5, 0 ], [ 0, 3, 1, 0 ] ]
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-08-01
 *
 */
public class SetMatrixZeroes {

	public void setZeroes(final int[][] matrix) {
        final int r = matrix.length, c = matrix[0].length;

        boolean firstRow = false;
        boolean firstColumn = false;

        for (int i = 0; i < r; i++) {
            if (matrix[i][0] == 0) {
                firstColumn = true;
                break;
            }
        }
        for (int i = 0; i < c; i++) {
            if (matrix[0][i] == 0) {
                firstRow = true;
                break;
            }
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRow) {
            for (int i = 0; i < c; i++) {
                matrix[0][i] = 0;
            }
        }
        if (firstColumn) {
            for (int i = 0; i < r; i++) {
                matrix[i][0] = 0;
            }
        }
    }

}
