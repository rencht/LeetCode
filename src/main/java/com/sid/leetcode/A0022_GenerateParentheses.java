package com.sid.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses.
 *
 * <blockquote>
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <p>For example, given n = 3, a solution set is:
 * <blockquote>
 * [
 * <p><pre>"((()))",</pre>
 * <p><pre>"(()())",</pre>
 * <p><pre>"(())()",</pre>
 * <p><pre>"()(())",</pre>
 * <p><pre>"()()()"</pre>
 * <p>]
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-08-02
 *
 */
public class A0022_GenerateParentheses {

	final char LEFT = '(';
	final char RIGHT = ')';

	public List<String> generateParenthesis(int n) {
		if (n <= 0) return new ArrayList<String>();

		List<String> combs = new ArrayList<String>();
		String current = getFirst(n);
		String last = getLast(n);

		combs.add(current);
		while (!current.equals(last)) {
			current = getNext(current);
			combs.add(current);
		}
		return combs;
	}

	private String getFirst(final int n) {
		StringBuilder buffer = new StringBuilder(n * 2);
		for (int i = 0; i < n; i++) {
			buffer.append(LEFT);
		}
		for (int i = 0; i < n; i++) {
			buffer.append(RIGHT);
		}
		return buffer.toString();
	}

	private String getLast(final int n) {
		StringBuilder buffer = new StringBuilder(n * 2);
		for (int i = 0; i < n; i++) {
			buffer.append(LEFT).append(RIGHT);
		}
		return buffer.toString();
	}

	private String getNext(final String current) {
		char[] chars = current.toCharArray();

		int i = chars.length - 2;
		int rightCount = 1;
		for (; i > 1; i--) {
			if (chars[i] == LEFT) {
				rightCount--;
			} else {
				if (chars[i - 1] == LEFT && rightCount > 0) {
					chars[i - 1] = RIGHT;
					chars[i] = LEFT;
					break;
				}
				rightCount++;
			}
		}
		int j = i + 1;
		for (int k = j; k < chars.length; k++) {
			if (chars[k] == LEFT) {
				chars[j] = LEFT;
				j++;
			}
		}
		for (; j < chars.length; j++) {
			chars[j] = RIGHT;
		}
		return String.valueOf(chars);
	}

}
