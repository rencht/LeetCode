package com.sid.leetcode;

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
 * string convert(string text, int nRows);
 * </blockquote>
 *
 * <font color='#D02572'>convert("PAYPALISHIRING", 3)</font> should return <font color='#D02572'>"PAHNAPLSIIGYIR"</font>.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-25
 *
 */
public class ZigZagConversion {

	public String convert(String s, int numRows) {
		if (s.length() <= numRows || numRows == 1) {
			return s;
		}
		final int LENGTH = s.length();
		final int OFFSET = (numRows - 1) << 1;

		StringBuilder buffer = new StringBuilder();
		int j = 0, k = 0;
		for (int i = 0; i < numRows; i++) {
			j = i;
			if (i == 0 || i == numRows - 1) {
				while (j < LENGTH) {
					buffer.append(s.charAt(j));
					j += OFFSET;
				}
			} else {
				k = j - (i << 1);
				while (j < LENGTH || k < LENGTH) {
					buffer.append((k > 0 && k < LENGTH) ? s.charAt(k) : "");
					buffer.append((j < LENGTH) ? s.charAt(j) : "");
					k += OFFSET;
					j += OFFSET;
				}
			}
		}
		return buffer.toString();
	}

}
