package com.sid.leetcode;

/**
 * 74. Search a 2D Matrix.
 *
 * <blockquote>
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 * <li>Integers in each row are sorted from left to right.</li>
 * <li>The first integer of each row is greater than the last integer of the previous row.</li>
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> matrix = [ [ 1, 3, 5, 7 ], [ 10, 11, 16, 20 ], [ 23, 30, 34, 50 ] ], target = 3
 * <p><b>Output:</b> true
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> matrix = [ [ 1, 3, 5, 7 ], [ 10, 11, 16, 20 ], [ 23, 30, 34, 50 ] ], target = 13
 * <p><b>Output:</b> false
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-08-01
 *
 */
public class A0074_SearchA2dMatrix {

	// Binary Search

	public boolean searchMatrix(final int[][] matrix, final int target) {
        if (matrix == null || matrix.length == 0) return false;

        final int row = matrix.length;
        final int column = matrix[0].length;
        final int total = row * column;

        int start = 0;
        int end = total - 1;

        while (start <= end) {
            final int mid = (start + end) >>> 1;
            final int midValue = matrix[mid / column][mid % column];
            if (midValue == target) return true;
            if (midValue < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }

}
