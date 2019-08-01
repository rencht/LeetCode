package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0076_MinimumWindowSubstringTest {

	private A0076_MinimumWindowSubstring problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0076_MinimumWindowSubstring();
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
