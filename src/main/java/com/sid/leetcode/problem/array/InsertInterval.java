package com.sid.leetcode.problem.array;

import java.util.Arrays;

/**
 * 57. Insert Interval.
 *
 * <blockquote>
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 * <p>You may assume that the intervals were initially sorted according to their start times.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> intervals = [ [ 1, 3 ], [ 6, 9 ] ], newInterval = [ 2, 5 ]
 * <p><b>Output:</b> [ [ 1, 5 ], [ 6, 9 ] ]
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> intervals = [ [ 1, 2 ], [ 3, 5 ], [ 6, 7 ], [ 8, 10 ], [ 12, 16 ] ], newInterval = [ 4, 8 ]
 * <p><b>Output:</b> [ [ 1, 2 ], [ 3, 10 ], [ 12, 16 ] ]
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-26
 *
 */
public class InsertInterval {

	public int[][] insert(final int[][] intervals, final int[] newInterval) {
		final int[][] result = new int[intervals.length + 1][];

		// Insert newInterval into intervals, sorting by interval start (Do not merge)
		
		int pos = -1;
		for (int i = 0; i < intervals.length; i++) {
			if (intervals[i][0] >= newInterval[0]) {
				result[i] = newInterval;
				pos = i;
				break;
			}
			result[i] = intervals[i];
		}
		if (pos == -1) {
			result[intervals.length] = newInterval;
			pos = intervals.length;
		}
		else {
			for (int i = pos; i < intervals.length; i++) {
				result[i + 1] = intervals[i];
			}
		}

		// Start from insert position - 1, merge if necessary

        int current = pos > 0 ? (pos - 1) : pos, next = current + 1;
		while (next < result.length) {
			if (result[current][1] >= result[next][0]) {
				result[current][1] = Math.max(result[current][1], result[next++][1]);
			}
			else {
				result[++current][0] = result[next][0];
				result[current][1] = result[next++][1];
			}
		}

		return Arrays.copyOf(result, current + 1);
    }

}
