package com.sid.leetcode.problem.string;

/**
 * 5. Longest Palindromic Substring.
 *
 * <blockquote>
 * Given a string <b>s</b>, find the longest palindromic substring in <b>s</b>. You may assume that the maximum length of <b>s</b> is 1000.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> "babad"
 * <p><b>Output:</b> "bab"
 * <p><b>Note:</b> "aba" is also a valid answer.
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> "cbbd"
 * <p><b>Output:</b> "bb"
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.1, 2019-06-28
 *
 */
public class LongestPalindromicSubstring {

	public String longestPalindromeManacher(final String s) {
		if (s.length() < 2) {
			return s;
		}

		final char[] t = new char[s.length() * 2 + 1];
		for (int i = 0; i < s.length(); i++) {
			t[2 * i] = '#';
			t[2 * i + 1] = s.charAt(i);
		}
		t[t.length - 1] = '#';

		final int[] p = new int[t.length];
		p[0] = 1;
		p[1] = 2;
		
		int center = 1, right = 2, len = 2, index = 1;

		for (int i = 2; i < p.length; i++) {
			p[i] = right > i ? Math.min(p[2 * center - i], right - i) : 1;
			while ((i + p[i] < p.length) && (i - p[i] >= 0) && (t[i + p[i]] == t[i - p[i]])) {
				p[i] += 1;
			}

			if (right < i + p[i]) {
				right = i + p[i];
				center = i;
			}
			if (len < p[i]) {
				len = p[i];
				index = i;
			}
		}

		return s.substring((index - len + 1) / 2, (index + len) / 2);
	}

	public String longestPalindrome(final String s) {
		if (s.length() < 2) {
			return s;
		}

		String palindrome = s.substring(0, 1);
		for (int i = 1; i < s.length(); i++) {
			final String single = longestPalindrome(s, i - 1, i + 1);
			final String dual = longestPalindrome(s, i - 1, i);
			final String longer = single.length() > dual.length() ? single : dual;
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
