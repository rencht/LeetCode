package com.sid.leetcode.problem.permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 47. Permutations II.
 *
 * <blockquote>
 * Given a collection of numbers that might contain duplicates, return all possible unique permutations.
 * 
 * <p>
 * <b>Example:</b>
 * <blockquote>
 * <b>Input:</b> [ 1, 1, 2 ]
 * <p><b>Output:</b>
 * <p>[
 * <pre>[ 1, 1, 2 ]
 * <p>[ 1, 2, 1 ]
 * <p>[ 2, 1, 1 ]
 * </pre>
 * <p>]
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-18
 *
 */
public class PermutationsII {

	public List<List<Integer>> permuteUnique(final int[] nums) {
		if (nums == null) return null;
        
        final List<List<Integer>> results = new ArrayList<List<Integer>>();
        if (nums.length == 1) {
            results.add(Arrays.asList(nums[0]));
        } else {
            Arrays.sort(nums);
            results.add(getPerm(nums));

            boolean swapped = true;
            while (swapped) {
                swapped = false;
                int swapIndex = nums.length - 1;
                for (int i = nums.length - 1; i > 0; i--) {
                    if (nums[i - 1] < nums[i]) {
                        swapIndex = i - 1;
                        swapped = true;
                        break;
                    }
                }
                for (int j = nums.length - 1; j > swapIndex; j--) {
                    if (nums[swapIndex] < nums[j]) {
                        nums[swapIndex] = nums[swapIndex] ^ nums[j];
                        nums[j] = nums[swapIndex] ^ nums[j];
                        nums[swapIndex] = nums[swapIndex] ^ nums[j];
                        Arrays.sort(nums, swapIndex + 1, nums.length);
                        results.add(getPerm(nums));
                        break;
                    }
                }
            }
        }
        return results;
    }

    private List<Integer> getPerm(final int[] nums) {
        final List<Integer> perm = new ArrayList<Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            perm.add(nums[i]);
        }
        return perm;
    }

}
