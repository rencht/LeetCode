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
 * <b>Examples:</b>
 * <p>Given <font color='#D02572'>"abcabcbb"</font>, the answer is <font color='#D02572'>"abc"</font>, which the length is 3.
 * <p>Given <font color='#D02572'>"bbbbb"</font>, the answer is <font color='#D02572'>"b"</font>, with the length of 1.
 * <p>Given <font color='#D02572'>"pwwkew"</font>, the answer is <font color='#D02572'>"wke"</font>, with the length of 3. Note that the answer must be a <b>substring</b>, "pwke" is a subsequence and not a substring.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-12
 *
 */
public class LongestSubstringWithoutRepeatingCharacters {

	public int lengthOfLongestSubstring(String s) {
		int answer = 0, start = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (map.containsKey(c) && map.get(c) >= start) {
				answer = Math.max(answer, i - start);
				start = map.get(c) + 1;
			}
			map.put(c, i);
		}
        return Math.max(answer, s.length() - start);
    }

}
