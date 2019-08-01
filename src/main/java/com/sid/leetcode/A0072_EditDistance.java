package com.sid.leetcode;

/**
 * 72. Edit Distance.
 *
 * <blockquote>
 * Given two words word 1 and word2, find the minimum number of operations required to convert word1 to word2.
 * <p>You have the following 3 operations permitted on a word:
 * <li>Insert a character</li>
 * <li>Delete a character</li>
 * <li>Replace a character</li>
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> word1 = "horse", word2 = "ros"
 * <p><b>Output:</b> 3
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> word1 = "intention", word2 = "execution"
 * <p><b>Output:</b> 5
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-08-01
 *
 */
public class A0072_EditDistance {

	// Dynamic Programming

	public int minDistance(final String word1, final String word2) {
        final int l1 = word1.length(), l2 = word2.length();

        final int[][] result = new int[l1 + 1][l2 + 1];
        result[0][0] = 0;
        for (int i = 0; i <= l1; i++) result[i][0] = i;
        for (int i = 0; i <= l2; i++) result[0][i] = i;

        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                if (word1.charAt(i) == word2.charAt(j)) {
                    result[i + 1][j + 1] = result[i][j]; 
                }
                else {
                    result[i + 1][j + 1] = Math.min(Math.min(result[i + 1][j], result[i][j + 1]), result[i][j]) + 1;
                }
            }
        }

        return result[l1][l2];
    }

}
