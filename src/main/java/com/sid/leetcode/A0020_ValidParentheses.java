package com.sid.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. Valid Parentheses.
 *
 * <blockquote>
 * Given a string containing just the characters <font color='#D02572'>'('</font>,
 * <font color='#D02572'>')'</font>, <font color='#D02572'>'{'</font>, <font color='#D02572'>'}'</font>,
 * <font color='#D02572'>'['</font> and <font color='#D02572'>']'</font>, determine if the input string is valid.
 * <p>The brackets must close in the correct order, <font color='#D02572'>"()"</font> and <font color='#D02572'>"()[]{}"</font>
 * are all valid but <font color='#D02572'>"(]"</font> and <font color='#D02572'>"([)]"</font> are not.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-08-01
 *
 */
public class A0020_ValidParentheses {

	public boolean isValid(String s) {
		if (s.length() % 2 != 0) return false;

		final Map<Character, Character> MAP = new HashMap<Character, Character>();
		MAP.put('(', ')');
		MAP.put('[', ']');
		MAP.put('{', '}');

		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (MAP.containsKey(c)) {
				stack.push(c);
			} else {
				if (stack.isEmpty()) return false;
				if (MAP.get(stack.pop()) != c) return false;
			}
		}
		return stack.isEmpty();
	}

}
