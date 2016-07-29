package com.sid.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 17. Letter Combinations of a Phone Number.
 *
 * <blockquote>
 * Given a digit string, return all possible letter combinations that the number could represent.
 * <p>A mapping of digit to letters (just like on the telephone buttons) is given below.
 * <p><img src="http://upload.wikimedia.org/wikipedia/commons/thumb/7/73/Telephone-keypad2.svg/200px-Telephone-keypad2.svg.png"/>
 *
 * <p><b>Input:</b> Digit string "23"
 * <p><b>Output:</b> ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-29
 *
 */
public class A0017_LetterCombinationsOfAPhoneNumber {

	private static final String[][] MAP = new String[10][];

	static {
		MAP[0] = new String[] { " " };
		MAP[1] = new String[] {};	
		MAP[2] = new String[] { "a", "b", "c" };
		MAP[3] = new String[] { "d", "e", "f" };
		MAP[4] = new String[] { "g", "h", "i" };
		MAP[5] = new String[] { "j", "k", "l" };
		MAP[6] = new String[] { "m", "n", "o" };
		MAP[7] = new String[] { "p", "q", "r", "s" };
		MAP[8] = new String[] { "t", "u", "v" };
		MAP[9] = new String[] { "w", "x", "y", "z" };
	}

	public List<String> letterCombinations(String digits) {
		if (digits == null || digits.length() == 0) {
			return new ArrayList<String>();
		}
		if (digits.length() == 1) {
			return Arrays.asList(MAP[digits.charAt(0) - '0']);
		}

		List<String> result = new ArrayList<String>();

		for (char c : digits.toCharArray()) {
			String[] current = MAP[c - '0'];

			List<String> temp = new ArrayList<String>();
			for (String curr : current) {
				if (result.isEmpty()) {
					temp.add(curr);
				} else {
					for (String r : result) {
						temp.add(r + curr);
					}
				}
			}
			result = temp;
		}
		return result;
	}

}
