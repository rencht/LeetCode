package com.sid.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 3. Longest Substring Without Repeating Characters.
 *
 * <blockquote>
 * Given a string, find the length of the <b>longest substring</b> without repeating characters.
 *
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> "abcabcbb"
 * <p><b>Output:</b> 3
 * <p><b>Explanation:</b> The answer is "abc", with the length of 3.
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> "bbbbb"
 * <p><b>Output:</b> 1
 * <p><b>Explanation:</b> The answer is "b", with the length of 3.
 * </blockquote>
 * 
 * <p>
 * <b>Example 3:</b>
 * <blockquote>
 * <b>Input:</b> "pwwkew"
 * <p><b>Output:</b> 3
 * <p><b>Explanation:</b> The answer is "wke", with the length of 3.
 * <p>Note that the answer must be a <b>substring</b>, "pwke" is a subsequence and not a substring.
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-12
 *
 */
public class A0003_LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(final String s) {
		int answer = 0, start = 0;
		final Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			final char c = s.charAt(i);
			if (map.containsKey(c) && map.get(c) >= start) {
				answer = Math.max(answer, i - start);
				start = map.get(c) + 1;
			}
			map.put(c, i);
		}
        return Math.max(answer, s.length() - start);
    }

}
