package com.sid.leetcode.problem.permutation;

import java.util.ArrayList;
import java.util.List;

/**
 * 78. Subsets.
 *
 * <blockquote>
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 * 
 * <p>
 * <b>Note:</b> The solution set must not contain duplicate subsets.
 * 
 * <p>
 * <b>Example:</b>
 * <blockquote>
 * <b>Input:</b> nums = [ 1, 2, 3 ]
 * <p><b>Output:</b> [ [], [ 1 ], [ 2 ], [ 3 ], [ 1, 2 ], [ 1, 3 ], [ 2, 3 ], [ 1, 2, 3 ] ]
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-08-04
 *
 */
public class Subsets {

	public List<List<Integer>> subsets(final int[] nums) {
		final List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());

        for (int i = 0; i < nums.length; i++) {
            final int previous = result.size();
            for (int j = 0; j < previous; j++) {
                final List<Integer> subset = new ArrayList<Integer>(result.get(j));
                subset.add(nums[i]);
                result.add(subset);
            }
        }

        return result;
    }

}
