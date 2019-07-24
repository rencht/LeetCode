package com.sid.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 56. Merge Intervals.
 *
 * <blockquote>
 * Given a collection of intervals, merge all overlapping intervals.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> [ [ 1, 3 ], [ 2, 6 ], [ 8, 10 ], [ 15, 18 ] ]
 * <p><b>Output:</b> [ [ 1, 6 ], [ 8, 10 ], [ 15, 18 ] ]
 * <p><b>Explanation:</b> Since intervals [ 1, 3 ] and [ 2, 6 ] overlaps, merge them into [ 1, 6 ].
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> [ [ 1, 4 ], [ 4, 5 ] ]
 * <p><b>Output:</b> [ [ 1, 5 ] ]
 * <p><b>Explanation:</b> Intervals [ 1, 4 ] and [ 4, 5 ] are considered overlapping.
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-25
 *
 */
public class A0056_MergeIntervals {

	// Sorting

	public int[][] merge(final int[][] intervals) {
		if (intervals.length < 2) return intervals;

		Arrays.sort(intervals, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o1[0], o2[0]);
			}
		});

		int current = 0, next = 1;
		while (next < intervals.length) {
			if (intervals[current][1] >= intervals[next][0]) {
				intervals[current][1] = Math.max(intervals[current][1], intervals[next++][1]);
			}
			else {
				intervals[++current] = intervals[next++];
			}
		}

		return Arrays.copyOf(intervals, current + 1);
    }

}
