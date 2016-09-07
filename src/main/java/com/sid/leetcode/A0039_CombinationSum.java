package com.sid.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 39. Combination Sum.
 *
 * <blockquote>
 * Given a set of candidate numbers (<b>C</b>) and a target number (<b>T</b>), find all unique combinations in <b>C</b> where the candidate numbers sums to <b>T</b>.
 * <p>The <b>same</b> repeated number may be chosen from <b>C</b> unlimited number of times.
 * <p><b>Note:</b>
 * <blockquote>All numbers (including target) will be positive integers.</blockquote>
 * <blockquote>The solution set must not contain duplicate combinations.</blockquote>
 * <p>For example, given candidate set <font color='#D02572'>[2, 3, 6, 7]</font> and target <font color='#D02572'>7</font>,
 * <p>A solution set is: 
 * <p>[
 * <p><pre>[7],</pre>
 * <p><pre>[2, 2, 3]</pre>
 * <p>]
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-09-07
 *
 */
public class A0039_CombinationSum {

	public List<List<Integer>> combinationSum1(int[] candidates, int target) {
		Arrays.sort(candidates);

		List<List<Integer>> combinations = new ArrayList<List<Integer>>();
		CombinationState state = new CombinationState(candidates, target, candidates.length);
		do {
			int candidate = candidates[state.index];
			if (candidate < state.target) {
				if (candidate <= (state.target >> 1)) {
					state.addCandidate();
				} else {
					state.nextCandidate();
				}
				continue;
			}

			if (candidate == state.target) {
				state.combination.add(candidate);
				combinations.add(new ArrayList<Integer>(state.combination));
				state.combination.remove(state.combination.size() - 1);
			}
			if (state.stack.isEmpty()) break;
			state.backtrack();
		} while (state.isStateValid());
		return combinations;
	}

	class CombinationState {
		int[] candidates;
		int index;
		int target;
		int length;
		Stack<Integer> stack;
		List<Integer> combination;

		CombinationState(final int[] candidates, final int target, final int length) {
			this.candidates = candidates;
			index = 0;
			this.target = target;
			this.length = length;
			stack = new Stack<Integer>();
			combination = new ArrayList<Integer>();
		}

		void addCandidate() {
			stack.push(index);
			target -= candidates[index];
			combination.add(candidates[index]);
		}

		void nextCandidate() {
			index++;
			if (!isStateValid()) {
				backtrack();
			}
		}

		void backtrack() {
			if (!stack.isEmpty()) {
				index = stack.pop();
				target += candidates[index];
				combination.remove(combination.size() - 1);
				nextCandidate();
			}
		}

		boolean isStateValid() {
			return index < length;
		}
	}

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		backtrack(result, new ArrayList<Integer>(), candidates, target, 0);
		return result;
	}

	private void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int remain, int start) {
		if (remain < 0) return;
		else if (remain == 0) list.add(new ArrayList<Integer>(tempList));
		else {
			for (int i = start; i < nums.length; i++) {
				tempList.add(nums[i]);
				backtrack(list, tempList, nums, remain - nums[i], i);
				tempList.remove(tempList.size() - 1);
			}
		}
	}

}
