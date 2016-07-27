package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0009_PalindromeNumberTest {

	private A0009_PalindromeNumber problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0009_PalindromeNumber();
	}

	@Test
	public void testIsPalindrome() throws Exception {
		assertFalse(problem.isPalindrome(-101));
		assertTrue(problem.isPalindrome(0));
		assertTrue(problem.isPalindrome(5));
		assertFalse(problem.isPalindrome(10));
		assertTrue(problem.isPalindrome(11));
		assertTrue(problem.isPalindrome(101));
		assertTrue(problem.isPalindrome(1001));
		assertFalse(problem.isPalindrome(1091));
		assertFalse(problem.isPalindrome(10111));
		assertFalse(problem.isPalindrome(1000021));
		assertTrue(problem.isPalindrome(1000000001));
	}

}
