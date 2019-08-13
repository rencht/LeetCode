package com.sid.leetcode.problem.string;

/**
 * 6. ZigZag Conversion.
 *
 * <blockquote>
 * The string <font color='#D02572'>"PAYPALISHIRING"</font> is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 *
 * <blockquote>
 * <table>
 * <tr align='center'><td>P</td><td></td><td>A</td><td></td><td>H</td><td></td><td>N</td></tr>
 * <tr align='center'><td>A</td><td>P</td><td>L</td><td>S</td><td>I</td><td>I</td><td>G</td></tr>
 * <tr align='center'><td>Y</td><td></td><td>I</td><td></td><td>R</td><td></td><td></td></tr>
 * </table>
 * </blockquote>
 *
 * And then read line by line: <font color='#D02572'>"PAHNAPLSIIGYIR"</font>
 *
 * <p>Write the code that will take a string and make this conversion given a number of rows:
 *
 * <blockquote>
 * string convert(string s, int numRows);
 * </blockquote>
 *
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> s = "PAYPALISHIRING", numRows = 3
 * <p><b>Output:</b> "PAHNAPLSIIGYIR"
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> s = "PAYPALISHIRING", numRows = 4
 * <p><b>Output:</b> "PINALSIGYAHRPI"
 * <p><b>Explanation:</b>
 * <table>
 * <tr align='center'><td>P</td><td></td><td></td><td>I</td><td></td><td></td><td>N</td></tr>
 * <tr align='center'><td>A</td><td></td><td>L</td><td>S</td><td></td><td>I</td><td>G</td></tr>
 * <tr align='center'><td>Y</td><td>A</td><td></td><td>H</td><td>R</td><td></td><td></td></tr>
 * <tr align='center'><td>P</td><td></td><td></td><td>I</td><td></td><td></td><td></td></tr>
 * </table>
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.1, 2019-06-29
 *
 */
public class ZigZagConversion {

	public String convert(final String s, final int numRows) {
		if (s.length() <= numRows || numRows == 1) {
            return s;
        }

        final StringBuilder buffer = new StringBuilder();

        for (int i = 0; i < numRows; i++) {
            int j = i;

            int d1 = (numRows - i - 1) * 2;
            int d2 = i * 2;

            while (j < s.length()) {
                buffer.append(s.charAt(j));
                if (d1 == 0 || d2 == 0) {
                    j += d1 + d2;
                }
                else {
                    j += d1;

                    if (j < s.length()) {
                        buffer.append(s.charAt(j));
                    }
                    j += d2;
                }
            }
        }
        return buffer.toString();
	}

}
