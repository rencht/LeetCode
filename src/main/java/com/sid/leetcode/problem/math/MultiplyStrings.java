package com.sid.leetcode.problem.math;

/**
 * 43. Multiply Strings.
 *
 * <blockquote>
 * Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> num1 = "2", num2 = "3"
 * <p><b>Output:</b> "6"
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> num1 = "123", num2 = "456"
 * <p><b>Output:</b> "56088"
 * </blockquote>
 * 
 * <p>
 * <b>Note:</b>
 * <blockquote>
 * <li>1. The length of both num1 and num2 is < 110.</li>
 * <li>2. Both num1 and num2 contain only digits 0-9.</li>
 * <li>3. Both num1 and num2 do not contain any leading zero, except the number 0 itself.</li>
 * <li>4. You <b>must not use any built-in BigInteger library</b> or <b>convert the inputs to integer</b> directly.</li>
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-16
 *
 */
public class MultiplyStrings {

	public String multiply(final String num1, final String num2) {
        if ("0".equals(num1) || "0".equals(num2)) return "0";

        final int m = num1.length(), n = num2.length();
        final int[] pos = new int[m + n];
       
        for(int i = m - 1; i >= 0; i--) {
            for(int j = n - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); 
                int p1 = i + j, p2 = i + j + 1;
                int sum = mul + pos[p2];

                pos[p1] += sum / 10;
                pos[p2] = (sum) % 10;
            }
        }  

        final StringBuilder buffer = new StringBuilder();
        for(final int p : pos) if(!(buffer.length() == 0 && p == 0)) buffer.append(p);
        return buffer.toString();
    }

}
