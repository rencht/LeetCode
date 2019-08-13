package com.sid.leetcode.problem.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 76. Minimum Window Substring.
 *
 * <blockquote>
 * Given a string S and a string T, find the minimum window in S which will contain all the characters in T in complexity O(n).
 * 
 * <p>
 * <b>Example:</b>
 * <blockquote>
 * <b>Input:</b> S = "ADOBECODEBANC", T = "ABC"
 * <p><b>Output:</b> "BANC"
 * </blockquote>
 * 
 * <p>
 * <b>Note:</b>
 * <li>If there is no such window in S that covers all characters in T, return the empty string "".</li>
 * <li>If there is such window, you are guaranteed that there will always be only one unique minimum window in S.</li>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-08-02
 *
 */
public class MinimumWindowSubstring {

	public String minWindow(final String s, final String t) {
		if (s.length() == 0 || t.length() == 0 || s.length() < t.length()) return "";

		final Map<Character, Integer> dictionary = new HashMap<Character, Integer>();
		for (final char c : t.toCharArray()) {
			dictionary.put(c, dictionary.getOrDefault(c, 0) + 1);
		}

		int left = 0;
		int minLeft = 0;
		int minLength = Integer.MAX_VALUE;
		int required = t.length();

		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			if (!dictionary.containsKey(c)) continue;

			dictionary.put(c, dictionary.get(c) - 1);
			if (dictionary.get(c) >= 0) required--;

			while (required == 0) {
				if (right - left + 1 < minLength) {
					minLength = right - left + 1;
					minLeft = left;
				}

				c = s.charAt(left++);
				if (dictionary.containsKey(c)) {
					dictionary.put(c, dictionary.get(c) + 1);
					if (dictionary.get(c) > 0) required++;
				}
			}
		}

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minLeft, minLeft + minLength);
    }

}
