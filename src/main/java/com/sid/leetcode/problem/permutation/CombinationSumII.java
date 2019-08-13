package com.sid.leetcode.problem.permutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 40. Combination Sum II.
 *
 * <blockquote>
 * Given a collection of candidate numbers (<b>candidates</b>) and a target number (<b>target</b>), find all unique combinations in <b>candidates</b> where the candidate numbers sums to <b>target</b>.
 * <p>Each number in <b>candidates</b> may only be used <b>once</b> in the combination.
 * <p><b>Note:</b>
 * <li>All numbers (including target) will be positive integers.</li>
 * <li>The solution set must not contain duplicate combinations.</li>
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> candidates = [ 10, 1, 2, 7, 6, 1, 5 ], target = 8
 * <p><b>A solution set is:</b> [ [ 1, 7 ], [ 1, 2, 5 ], [ 2, 6 ], [ 1, 1, 6 ] ]
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> candidates = [ 2, 5, 2, 1, 2 ], target = 5
 * <p><b>A solution set is:</b> [ [ 1, 2, 2 ], [ 5 ] ]
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-13
 *
 */
public class CombinationSumII {

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
        return combinationSum(candidates, 0, target);
	}

	private List<List<Integer>> combinationSum(final int[] candidates, final int start, final int target) {
        final List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            final int candidate = candidates[i];
            if (candidate == target) {
                final List<Integer> temp = new ArrayList<Integer>();
                temp.add(candidate);
                result.add(temp);
            }
            else if (candidate < target) {
                final List<List<Integer>> list = combinationSum(candidates, i + 1, target - candidate);
                if (!list.isEmpty()) {
                    for (final List<Integer> temp : list) {
                    	temp.add(0, candidate);
                        result.add(temp);
                    }
                }
            }
            else {
                break;
            }
        }
        return result;
    }

}
