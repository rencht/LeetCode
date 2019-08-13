package com.sid.leetcode.problem.math;

/**
 * 13. Roman to Integer.
 *
 * <blockquote>
 * Given a roman numeral, convert it to an integer.
 * <p>Input is guaranteed to be within the range from 1 to 3999.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-27
 *
 */
public class RomanToInteger {

	public int romanToInt(String s) {
		final int[] INTEGER = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		final String[] ROMAN = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		int integer = 0;
		for (int i = 0; i < ROMAN.length; i++) {
			while (s.startsWith(ROMAN[i])) {
				integer += INTEGER[i];
				s = s.substring(ROMAN[i].length());
			}
		}
		return integer;
	}

	public int optimizedRomanToInt(String s) {
		final int[] ROMAN = new int[26];
		ROMAN['M' - 'A'] = 1000;
		ROMAN['D' - 'A'] = 500;
		ROMAN['C' - 'A'] = 100;
		ROMAN['L' - 'A'] = 50;
		ROMAN['X' - 'A'] = 10;
		ROMAN['V' - 'A'] = 5;
		ROMAN['I' - 'A'] = 1;

		int integer = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			if (ROMAN[s.charAt(i) - 'A'] < ROMAN[s.charAt(i + 1) - 'A']) {
				integer -= ROMAN[s.charAt(i) - 'A'];
			} else {
				integer += ROMAN[s.charAt(i) - 'A'];
			}
		}
		integer += ROMAN[s.charAt(s.length()- 1) - 'A'];
		return integer;
	}

}
