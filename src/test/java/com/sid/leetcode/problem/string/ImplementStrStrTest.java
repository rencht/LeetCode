package com.sid.leetcode.problem.string;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.string.ImplementStrStr;

public class ImplementStrStrTest {

	private ImplementStrStr problem;

	@Before
	public void setUp() throws Exception {
		problem = new ImplementStrStr();
	}

	@Test
	public void testStrStrStringString() throws Exception {
		assertEquals(0, problem.strStr("hello", ""));
		assertEquals(-1, problem.strStr("hello", "helloleetcode"));
		assertEquals(0, problem.strStr("hello", "hello"));
		assertEquals(2, problem.strStr("hello", "ll"));
		assertEquals(-1, problem.strStr("aaaaa", "bba"));
		assertEquals(0, problem.strStr("hello", "he"));
		assertEquals(-1, problem.strStr("hello", "lol"));
		assertEquals(9, problem.strStr("mississippi", "pi"));
		assertEquals(5, problem.strStr("abcadabcab", "abcab"));
	}

}
