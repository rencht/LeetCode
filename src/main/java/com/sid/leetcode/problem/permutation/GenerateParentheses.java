package com.sid.leetcode.problem.permutation;

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
public class GenerateParentheses {

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
        final char[] chars = new char[n * 2];
		for (int i = 0; i < n; i++) {
			
            chars[i] = LEFT;
            chars[n + i] = RIGHT;
		}
		return String.valueOf(chars);
	}

	private String getLast(final int n) {
		final char[] chars = new char[n * 2];
		for (int i = 0; i < n; i++) {
            chars[i * 2] = LEFT;
            chars[i * 2 + 1] = RIGHT;
		}
		return String.valueOf(chars);
	}

	private String getNext(final String current) {
		final char[] chars = current.toCharArray();

		int i = chars.length - 2;
        int leftCount = 0;
		int rightCount = 1;
		for (; i > 0; i--) {
			if (chars[i] == LEFT) {
                if (rightCount - leftCount == 1) {
                    leftCount++;
                }
                else {
                    chars[i] = RIGHT;
                    chars[i + 1] = LEFT;
                    rightCount--;
                    break;
                }
			} else {
				rightCount++;
			}
		}
		int j = i + 2;
		for (int k = 0; k < leftCount; k++) {
            chars[j++] = LEFT;
		}
		for (int k = 0; k < rightCount; k++) {
			chars[j++] = RIGHT;
		}
		return String.valueOf(chars);
	}

}
