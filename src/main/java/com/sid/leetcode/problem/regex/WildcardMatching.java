package com.sid.leetcode.problem.regex;

/**
 * 44. Wildcard Matching.
 *
 * <blockquote>
 * Given an input string (s) and a pattern (p), implement wildcard matching with support for <font color='#D02572'>'?'</font>
 * and <font color='#D02572'>'*'</font>. 
 * <blockquote>
 * '?' Matches any single character.
 * <p>'*' Matches any sequence of characters (including the empty sequence).
 * </blockquote>
 * <p>
 * <p>The matching should cover the <b>entire</b> input string (not partial).
 * <p><b>Note:</b>
 * <p><li>s could be empty and contains only lowercase letters a-z.</li>
 * <p><li>p could be empty and contains only lowercase letters a-z, and characters like ? or *.</li>
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> s = "aa", p = "a"
 * <p><b>Output:</b> false
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> s = "aa", p = "*"
 * <p><b>Output:</b> true
 * </blockquote>
 * 
 * <p>
 * <b>Example 3:</b>
 * <blockquote>
 * <b>Input:</b> s = "cb", p = "?a"
 * <p><b>Output:</b> false
 * </blockquote>
 * 
 * <p>
 * <b>Example 4:</b>
 * <blockquote>
 * <b>Input:</b> s = "adceb", p = "*a*b"
 * <p><b>Output:</b> true
 * </blockquote>
 * 
 * <p>
 * <b>Example 5:</b>
 * <blockquote>
 * <b>Input:</b> s = "acdcb", p = "a*c?b"
 * <p><b>Output:</b> false
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-17
 *
 */
public class WildcardMatching {

	public boolean isMatch(final String s, final String p) {
		if (s == null || p == null) return false;

		final boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
		dp[0][0] = true;
		for (int j = 0; j < p.length(); j++) {
			if (p.charAt(j) == '*') {
				dp[0][j + 1] = dp[0][j];
			}
		}

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < p.length(); j++) {
				if (p.charAt(j) == '?' || p.charAt(j) == s.charAt(i)) {
					dp[i + 1][j + 1] = dp[i][j];
				} else if (p.charAt(j) == '*') {
					dp[i + 1][j + 1] = dp[i + 1][j] || dp[i][j] || dp[i][j + 1];
				}
			}
		}
		return dp[s.length()][p.length()];
	}

}
