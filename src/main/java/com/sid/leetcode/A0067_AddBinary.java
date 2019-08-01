package com.sid.leetcode;

/**
 * 67. Add Binary.
 *
 * <blockquote>
 * Given two binary strings, return their sum (also a binary string).
 * <p>The input strings are both <b>non-empty</b> and contains only characters 1 or 0.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> a = "11", b = "1"
 * <p><b>Output:</b> "100"
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> a = "1010", b = "1011"
 * <p><b>Output:</b> "10101"
 * </blockquote>
 * 
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-30
 *
 */
public class A0067_AddBinary {

	public String addBinary(final String a, final String b) {
        final StringBuilder buffer = new StringBuilder();

        int i = a.length() - 1, j = b.length() - 1, carry = 0;
        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            buffer.insert(0, sum & 0x01);
            carry = sum >> 1;
        }
        if (carry == 1) buffer.insert(0, 1);
        return buffer.toString();
    }

}
