package com.sid.leetcode;

/**
 * 10. Regular Expression Matching.
 *
 * <blockquote>
 * Implement regular expression matching with support for <font color='#D02572'>'.'</font> and <font color='#D02572'>'*'</font>.
 * <blockquote>
 * '.' Matches any single character.
 * <p>'*' Matches zero or more of the preceding element.
 * <p><br />
 * <p>The matching should cover the entire input string (not partial).
 * <p><br />
 * <p>The function prototype should be:
 * <p>bool isMatch(const char *s, const char *p)
 * <p><br />
 * <p>Some examples:
 * <p>isMatch("aa","a") → false
 * <p>isMatch("aa","aa") → true
 * <p>isMatch("aaa","aa") → false
 * <p>isMatch("aa", "a*") → true
 * <p>isMatch("aa", ".*") → true
 * <p>isMatch("ab", ".*") → true
 * <p>isMatch("aab", "c*a*b") → true
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-10-15
 *
 */
public class A0010_RegularExpressionMatching {

	public boolean isMatch(String s, String p) {
		if (s == null || p == null) return false;

		boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
		dp[0][0] = true;
		for (int j = 1; j < p.length(); j++) {
			if (p.charAt(j) == '*') {
				dp[0][j + 1] = dp[0][j - 1];
			}
		}

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < p.length(); j++) {
				if (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i)) {
					dp[i + 1][j + 1] = dp[i][j];
				} else if (p.charAt(j) == '*') {
					if (p.charAt(j - 1) == '.' || p.charAt(j - 1) == s.charAt(i)) {
						dp[i + 1][j + 1] = dp[i + 1][j - 1] || dp[i + 1][j] || dp[i][j + 1];
					} else {
						dp[i + 1][j + 1] = dp[i + 1][j - 1];
					}
				}
			}
		}
		return dp[s.length()][p.length()];
	}

}
