package com.sid.leetcode;

/**
 * 32. Longest Valid Parentheses.
 *
 * <blockquote>
 * Given a string containing just the characters <font color='#D02572'>'('</font> and <font color='#D02572'>')'</font>, find the length of the longest valid (well-formed) parentheses substring.
 * <p>For <font color='#D02572'>"(()"</font>, the longest valid parentheses substring is <font color='#D02572'>"()"</font>, which has length = 2.
 * <p>Another example is <font color='#D02572'>")()())"</font>, where the longest valid parentheses substring is <font color='#D02572'>"()()"</font>, which has length = 4.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-09-01
 *
 */
public class A0032_LongestValidParentheses {

	public int longestValidParentheses(String s) {
		if (s.length() < 2) return 0;

		String helper = ")" + s;
		char[] chs = helper.toCharArray();

		int longest = 0;

		int[] lengths = new int[chs.length];
		lengths[0] = 0;
		lengths[1] = 0;
		for (int i = 2; i < chs.length; i++) {
			if (chs[i] == '(') {
				lengths[i] = 0;
				continue;
			} else if (chs[i - 1] == '(') {
				lengths[i] = 2 + lengths[i - 2];
			} else if (chs[i - 1 - lengths[i - 1]] == ')') {
				lengths[i] = 0;
				continue;
			} else {
				lengths[i] = 2 + lengths[i - 1];
				lengths[i] += lengths[i - lengths[i]];
			}

			if (lengths[i] > longest) {
				longest = lengths[i];
			}
		}
		return longest;
	}

}
