package com.sid.leetcode;

/**
 * 12. Integer to Roman.
 *
 * <blockquote>
 * Given an integer, convert it to a roman numeral.
 * <p>Input is guaranteed to be within the range from 1 to 3999.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-27
 *
 */
public class A0012_IntegerToRoman {

	public String intToRoman(int num) {
		final int[] INTEGER = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		final String[] ROMAN = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder buffer = new StringBuilder();
		for (int i = 0; i < INTEGER.length; i++) {
			while (num >= INTEGER[i]) {
				buffer.append(ROMAN[i]);
				num -= INTEGER[i];
			}
		}
		return buffer.toString();
	}

}
