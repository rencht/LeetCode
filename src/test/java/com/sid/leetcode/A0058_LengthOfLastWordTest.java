package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0058_LengthOfLastWordTest {

	private A0058_LengthOfLastWord problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0058_LengthOfLastWord();
	}

	@Test
	public void testLengthOfLastWord() throws Exception {
		assertEquals(0, problem.lengthOfLastWord(null));
		assertEquals(0, problem.lengthOfLastWord(""));
		assertEquals(0, problem.lengthOfLastWord(" "));
		assertEquals(5, problem.lengthOfLastWord("Hello World"));
		assertEquals(5, problem.lengthOfLastWord("Hello World "));
		assertEquals(10, problem.lengthOfLastWord("HelloWorld"));
	}

}
