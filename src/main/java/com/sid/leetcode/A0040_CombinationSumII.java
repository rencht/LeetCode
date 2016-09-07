package com.sid.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 40. Combination Sum II.
 *
 * <blockquote>
 * Given a collection of candidate numbers (<b>C</b>) and a target number (<b>T</b>), find all unique combinations in <b>C</b> where the candidate numbers sums to <b>T</b>.
 * <p>Each number in <b>C</b> may only be used <b>once</b> in the combination.
 * <p><b>Note:</b>
 * <blockquote>All numbers (including target) will be positive integers.</blockquote>
 * <blockquote>The solution set must not contain duplicate combinations.</blockquote>
 * <p>For example, given candidate set <font color='#D02572'>[10, 1, 2, 7, 6, 1, 5]</font> and target <font color='#D02572'>8</font>,
 * <p>A solution set is: 
 * <p>[
 * <p><pre>[1, 7],</pre>
 * <p><pre>[1, 2, 5],</pre>
 * <p><pre>[2, 6],</pre>
 * <p><pre>[1, 1, 6]</pre>
 * <p>]
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-09-07
 *
 */
public class A0040_CombinationSumII {

	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);

		List<List<Integer>> combinations = new ArrayList<List<Integer>>();
		CombinationState state = new CombinationState(candidates, target, candidates.length);
		do {
			int candidate = candidates[state.index];
			if (candidate < state.target) {
				if (candidate <= (state.target >> 1)) {
					state.addCandidate();
				} else {
					state.nextCandidate(false);
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
			nextCandidate(false);
		}

		void nextCandidate(final boolean equals) {
			index++;
			if (isStateValid()) {
				if (equals && candidates[index] == candidates[index - 1]) {
					nextCandidate(equals);
				}
			} else {
				backtrack();
			}
		}

		void backtrack() {
			if (!stack.isEmpty()) {
				index = stack.pop();
				target += candidates[index];
				combination.remove(combination.size() - 1);
				nextCandidate(true);
			}
		}

		boolean isStateValid() {
			return index < length;
		}
	}

}
