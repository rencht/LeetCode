package com.sid.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 49. Group Anagrams.
 *
 * <blockquote>
 * Given an array of strings, group anagrams together.
 * 
 * <p>
 * <b>Example:</b>
 * <blockquote>
 * <b>Input:</b> [ "eat", "tea", "tan", "ate", "nat", "bat" ],
 * <p><b>Output:</b>
 * <p>[
 * <pre>[ "ate", "eat", "tea" ]
 * <p>[ "nat", "tan" ]
 * <p>[ "bat" ]
 * </pre>
 * <p>]
 * </blockquote>
 * 
 * <p>
 * <b>Note:</b>
 * <li>All inputs will be in lowercase.</li>
 * <li>The order of your output does not matter.</li>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-19
 *
 */
public class A0049_GroupAnagrams {

	public List<List<String>> groupAnagrams(final String[] strs) {
		final Map<Integer, List<String>> group = new HashMap<Integer, List<String>>();

		for (final String string : strs) {
			final int pattern = this.pattern(string);
			if (!group.containsKey(pattern)) {
                group.put(pattern, new ArrayList<String>());
			}
            group.get(pattern).add(string);
		}

		return new ArrayList<List<String>>(group.values());
    }

	private int pattern(final String string) {
		final int[] pattern = new int[26];
		for (final char c : string.toCharArray()) {
			pattern[c - 'a'] += 1;
		}
        return Arrays.hashCode(pattern);
	}

}
