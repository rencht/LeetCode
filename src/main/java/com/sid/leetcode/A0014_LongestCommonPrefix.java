package com.sid.leetcode;

/**
 * 14. Longest Common Prefix.
 *
 * <blockquote>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-28
 *
 */
public class A0014_LongestCommonPrefix {

	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) return "";

		int minlen = Integer.MAX_VALUE;
		String target = "";
		for (String string : strs) {
			if (string.length() < minlen) {
				minlen = string.length();
				target = string;
			}
		}

		for (int i = 0; i < strs.length; i++) {
			if (strs[i].startsWith(target)) {
				continue;
			} else {
				do {
					target = target.substring(0, target.length() - 1);
				} while (!strs[i].startsWith(target));
			}
		}
		return target;
	}

}
