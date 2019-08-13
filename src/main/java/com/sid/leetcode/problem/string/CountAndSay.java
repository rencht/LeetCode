package com.sid.leetcode.problem.string;

/**
 * 38. Count and Say.
 *
 * <blockquote>
 * The count-and-say sequence is the sequence of integers beginning as follows:
 * <p><font color='#D02572'>1, 11, 21, 1211, 111221, ...</font>
 * <p><font color='#D02572'>1</font> is read off as <font color='#D02572'>"one 1"</font> or <font color='#D02572'>11</font>.
 * <p><font color='#D02572'>11</font> is read off as <font color='#D02572'>"two 1s"</font> or <font color='#D02572'>21</font>.
 * <p><font color='#D02572'>21</font> is read off as <font color='#D02572'>"one 2, then one 1"</font> or <font color='#D02572'>1211</font>.
 * <p>Given an integer n, generate the nth sequence.
 * <p>Note: The sequence of integers will be represented as a string.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-09-02
 *
 */
public class CountAndSay {

	public String countAndSay(int n) {
		String reading = "1";
		for (int i = 2; i <= n; i++) {
			reading = read(reading);
		}
		return reading;
	}

	private String read(final String reading) {
		StringBuilder buffer = new StringBuilder();

		char[] chs = reading.toCharArray();
		int count = 1;
		char c = chs[0];
		for (int i = 1; i < chs.length; i++) {
			if (chs[i] == c) {
				count++;
			} else {
				buffer.append(count).append(c);
				count = 1;
				c = chs[i];
			}
		}
		buffer.append(count).append(c);
		return buffer.toString();
	}

}
