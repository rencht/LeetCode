package com.sid.leetcode.problem.string;

/**
 * 58. Length of Last Word.
 *
 * <blockquote>
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return
 * the length of last word in the string.
 * <p>If the last word does not exist, return 0.
 * 
 * <p>
 * <b>Note:</b> A word is defined as a character sequence consists of non-space characters only.
 * 
 * <p>
 * <b>Example:</b>
 * <blockquote>
 * <b>Input:</b> "Hello World"
 * <p><b>Output:</b> 5
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-27
 *
 */
public class LengthOfLastWord {

	public int lengthOfLastWord(final String s) {
		if (s == null) return 0;

        int length = 0;
        final char[] cs = s.toCharArray();
        for (int i = cs.length - 1; i >= 0; i--) {
			if (cs[i] != ' ') {
				length++;
			}
			else {
				if (length > 0) return length;
			}
		}
        return length;
    }

}
