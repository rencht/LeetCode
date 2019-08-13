package com.sid.leetcode.problem.permutation;

import java.util.ArrayList;
import java.util.List;

/**
 * 77. Combinations.
 *
 * <blockquote>
 * Given two integers n and k, return all possible combinations of k numbers out of 1 ... n.
 * 
 * <p>
 * <b>Example:</b>
 * <blockquote>
 * <b>Input:</b> n = 4, k = 2
 * <p><b>Output:</b> [ [ 1, 2 ], [ 1, 3 ], [ 1, 4 ], [ 2, 3 ], [ 2, 4 ], [ 3, 4 ] ]
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-08-03
 *
 */
public class Combinations {

	public List<List<Integer>> combine(final int n, final int k) {
        final List<List<Integer>> result = new ArrayList<List<Integer>>();

        if (n == k) {
            final List<Integer> combination = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++) combination.add(i);
            result.add(combination);
            return result;
        }

        if (k == 1) {
            for (int i = 1; i <= n; i++) {
            	final List<Integer> combination = new ArrayList<Integer>(1);
            	combination.add(i);
                result.add(combination);
            }
            return result;
        }

        result.addAll(combine(n - 1, k));

        final List<List<Integer>> include = combine(n - 1, k - 1);
		for (final List<Integer> in : include) {
			in.add(n);
			result.add(in);
		}
        return result;
    }

}
