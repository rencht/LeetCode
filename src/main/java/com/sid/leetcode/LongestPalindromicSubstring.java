package com.sid.leetcode;

/**
 * 5. Longest Palindromic Substring.
 *
 * <blockquote>
 * Given a string S, find the longest palindromic substring in S. You may assume that the maximum length of S is 1000, and there exists one unique longest palindromic substring.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-22
 *
 */
public class LongestPalindromicSubstring {

	public String longestPalindrome(String s) {
		String palindrome = s.substring(0, 1);
		for (int i = 1; i < s.length(); i++) {
			String single = longestPalindrome(s, i - 1, i + 1);
			String dual = longestPalindrome(s, i - 1, i);
			String longer = single.length() > dual.length() ? single : dual;
			if (longer.length() > palindrome.length()) {
				palindrome = longer;
			}
		}
		return palindrome;
	}

	private String longestPalindrome(final String s, final int pre, final int post) {
		int i = pre, j = post;
		for (; i >= 0 && j < s.length(); i--, j++) {
			if (s.charAt(i) != s.charAt(j)) {
				break;
			}
		}
		return s.substring(++i, j);
	}

}
