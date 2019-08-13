package com.sid.leetcode.problem.permutation;

/**
 * 60. Permutation Sequence.
 *
 * <blockquote>
 * The set { 1, 2, 3, ..., n } contains a total of n! unique permutations.
 * <p>By listing and labeling all of the permutations in order, we get the following sequence for n = 3.
 * <li>1. "123"</li>
 * <li>2. "132"</li>
 * <li>3. "213"</li>
 * <li>4. "231"</li>
 * <li>5. "312"</li>
 * <li>6. "321"</li>
 * 
 * <p>Given n and k, return the kth permutation sequence.
 * 
 * <p><b>Note:</b>
 * <li>Given n will be between 1 and 9 inclusive.</li>
 * <li>Given k will be between 1 and n! inclusive.</li>
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> n = 3, k = 3
 * <p><b>Output:</b> "213"
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> n = 4, k = 9
 * <p><b>Output:</b> "2314"
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-28
 *
 */
public class PermutationSequence {

	public String getPermutation(final int n, final int k) {
        return permutation(start(n), k - 1);
    }

    private int[] start(final int n) {
        final int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = i + 1;
        }
        return nums;
    }

    private String permutation(final int[] nums, final int k) {
        if (nums.length == 1) return String.valueOf(nums[0]);

        final int factorial = factorial(nums.length - 1);
        final int first = k / factorial;

        final int[] next = new int[nums.length - 1];
        for (int i = 0; i < first; i++) {
            next[i] = nums[i];
        }
        for (int i = first + 1; i < nums.length; i++) {
            next[i - 1] = nums[i];
        }

        return nums[first] + permutation(next, k % factorial);
    }
    
    private int factorial(final int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
