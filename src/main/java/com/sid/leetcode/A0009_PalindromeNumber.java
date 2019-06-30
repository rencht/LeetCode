package com.sid.leetcode;

/**
 * 9. Palindrome Number.
 *
 * <blockquote>
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * Do this without extra space.
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.1, 2019-06-30
 *
 */
public class A0009_PalindromeNumber {

	public boolean isPalindrome(final int x) {
		if (x < 0) return false;
		if (x < 10) return true;
        if (x % 10 == 0) return false;
		
		int reverse = 0, temp = x;
		while (temp > reverse) {
			reverse = reverse * 10 + temp % 10;
			temp /= 10;
		}
		return reverse == temp || reverse / 10 == temp;
	}

}
