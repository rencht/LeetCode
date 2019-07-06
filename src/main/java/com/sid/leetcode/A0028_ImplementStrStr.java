package com.sid.leetcode;

/**
 * 28. Implement strStr().
 *
 * <blockquote>
 * Implement strStr().
 * <p>Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> haystack = "hello", needle = "ll"
 * <p><b>Output:</b> 2
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> haystack = "aaaaa", needle = "bba"
 * <p><b>Output:</b> "-1
 * </blockquote>
 * 
 * <p>
 * <b>Clarification:</b>
 * <p>What should we return when needle is an empty string? This is a great question to ask during an interview.
 * <p>For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-06
 *
 */
public class A0028_ImplementStrStr {

	public int strStr(final String haystack, final String needle) {
		if ("".equals(needle)) return 0;
		if (needle.length() > haystack.length()) return -1;

		int start = 0, max = haystack.length() - needle.length();
		Outer: while (start <= max) {
			for (int i = 0; i < needle.length(); i++) {
				if (haystack.charAt(i + start) != needle.charAt(i)) {
					start++;
					continue Outer;
				}
			}
			return start;
		}
		return -1;
	}

}
