package com.sid.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 39. Combination Sum.
 *
 * <blockquote>
 * Given a <b>set</b> of candidate numbers (<b>candidates</b>) (<b>without duplicates</b>) and a target number (<b>target</b>), find all unique combinations in <b>candidates</b> where the candidate numbers sums to <b>target</b>.
 * <p>The <b>same</b> repeated number may be chosen from <b>candidates</b> unlimited number of times.
 * <p><b>Note:</b>
 * <li>All numbers (including target) will be positive integers.</li>
 * <li>The solution set must not contain duplicate combinations.</li>
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> candidates = [ 2, 3, 6, 7 ], target = 7
 * <p><b>A solution set is:</b> [ [ 7 ], [ 2, 2, 3 ] ]
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> candidates = [ 2, 3, 5 ], target = 8
 * <p><b>A solution set is:</b> [ [ 2, 2, 2, 2 ], [ 2, 3, 3 ], [ 3, 5 ] ]
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-13
 *
 */
public class A0039_CombinationSum {

	public List<List<Integer>> combinationSum(final int[] candidates, final int target) {
        return combinationSum(candidates, 0, target);
    }

    private List<List<Integer>> combinationSum(final int[] candidates, final int start, final int target) {
        final List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for (int i = start; i < candidates.length; i++) {
            final int candidate = candidates[i];
            if (candidate == target) {
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(candidate);
                result.add(temp);
            }
            else if (candidate < target) {
                final List<List<Integer>> list = combinationSum(candidates, i, target - candidate);
                if (!list.isEmpty()) {
                    for (final List<Integer> temp : list) {
                    	temp.add(0, candidate);
                        result.add(temp);
                    }
                }
            }
        }
        return result;
    }

}
