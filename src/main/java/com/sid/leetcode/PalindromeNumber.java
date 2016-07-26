package com.sid.leetcode;

/**
 * 9. Palindrome Number.
 *
 * <blockquote>
 * Determine whether an integer is a palindrome. Do this without extra space.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2016-07-26
 *
 */
public class PalindromeNumber {

	public boolean isPalindrome(int x) {
		if (x < 0) return false;
		if (x < 10) return true;

		int multiple = 1;
		while (x / multiple >= 10) {
			multiple *= 10;
		}

		while(multiple > 1) {
			if (x / multiple != x % 10) return false;
			x %= multiple;
			x /= 10;
			multiple /= 100;
		}
		return true;
	}

}
