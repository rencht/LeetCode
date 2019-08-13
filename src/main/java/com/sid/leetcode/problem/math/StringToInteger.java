package com.sid.leetcode.problem.math;

/**
 * 8. String to Integer (atoi).
 *
 * <blockquote>
 * Implement atoi to convert a string to an integer.
 * <p><b>Hint:</b> Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 * <p><b>Notes:</b> It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-26
 *
 */
public class StringToInteger {

	public int myAtoi(String str) {
		String target = str.trim();
		if ("-2147483648".equals(target)) return Integer.MIN_VALUE;

		int result = 0;
		int signed = 1;
		for (int i = 0; i < target.length(); i++) {
			char c = target.charAt(i);
			if (Character.isDigit(c)) {
				int temp = c - '0';
				if ((Integer.MAX_VALUE - temp) / 10 < result) {
					return (signed == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
				}
				result = result * 10 + temp;
			} else if (c == '-' && i == 0) {
				signed = -1;
			} else if (c == '+' && i == 0) {
				continue;
			} else {
				break;
			}
		}
		return result * signed;
	}

}
