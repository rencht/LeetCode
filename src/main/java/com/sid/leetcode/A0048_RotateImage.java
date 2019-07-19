package com.sid.leetcode;

/**
 * 48. Rotate Image.
 *
 * <blockquote>
 * You are given an n x n 2D matrix representing an image.
 * <p>Roatete the image by 90 degrees (clockwise).
 * 
 * <p>
 * <b>Note:</b>
 * <p>You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
 * <b>DO NOT</b> allocate another 2D matrix and do the rotation.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * Given input matrix = 
 * <p>[
 * <pre>[ 1, 2, 3 ]
 * <p>[ 4, 5, 6 ]
 * <p>[ 7, 8, 9 ]
 * </pre>
 * <p>],
 * 
 * <p>rotate the input matrix in-place such that it becomes:
 * <p>[
 * <pre>[ 7, 4, 1 ]
 * <p>[ 8, 5, 2 ]
 * <p>[ 9, 6, 3 ]
 * </pre>
 * <p>]
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * Given input matrix = 
 * <p>[
 * <pre>[ 5, 1, 9, 11 ]
 * <p>[ 2, 4, 8, 10 ]
 * <p>[ 13, 3, 6, 7 ]
 * <p>[ 15, 14, 12, 16 ]
 * </pre>
 * <p>],
 * 
 * <p>rotate the input matrix in-place such that it becomes:
 * <p>[
 * <pre>[ 15, 13, 2, 5 ]
 * <p>[ 14, 3, 4, 1 ]
 * <p>[ 12, 6, 8, 9 ]
 * <p>[ 16, 7, 10, 11 ]
 * </pre>
 * <p>]
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-19
 *
 */
public class A0048_RotateImage {

	public void rotate(final int[][] matrix) {
        if (matrix == null || matrix.length == 1) return;

        final int n = matrix.length;
        for (int i = 0; i < (n + 1) >>> 1; i++) {
            for (int j = 0; j < n >>> 1; j++) {
                final int ni = n - 1 - i;
                final int nj = n - 1 - j;
                final int temp = matrix[i][j];
                matrix[i][j] = matrix[nj][i];
                matrix[nj][i] = matrix[ni][nj];
                matrix[ni][nj] = matrix[j][ni];
                matrix[j][ni] = temp;
            }
        }
    }

}
