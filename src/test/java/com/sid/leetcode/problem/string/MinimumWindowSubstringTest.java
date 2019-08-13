package com.sid.leetcode.problem.string;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.string.MinimumWindowSubstring;

public class MinimumWindowSubstringTest {

	private MinimumWindowSubstring problem;

	@Before
	public void setUp() throws Exception {
		problem = new MinimumWindowSubstring();
	}

	@Test
	public void testMinWindow() throws Exception {
		assertEquals("BANC", problem.minWindow("ADOBECODEBANC", "ABC"));
		assertEquals("", problem.minWindow("ADOBECODEBANC", "H"));
		assertEquals("", problem.minWindow("ADOBECODEBANC", "AAA"));
		assertEquals("", problem.minWindow("ADOBECODEBANC", "AH"));
		assertEquals("A", problem.minWindow("A", "A"));
		assertEquals("", problem.minWindow("", "ABC"));
		assertEquals("", problem.minWindow("ADOBECODEBANC", ""));
		assertEquals("", problem.minWindow("AD", "ABC"));
	}

}
