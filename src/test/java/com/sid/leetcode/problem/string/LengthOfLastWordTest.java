package com.sid.leetcode.problem.string;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.string.LengthOfLastWord;

public class LengthOfLastWordTest {

	private LengthOfLastWord problem;

	@Before
	public void setUp() throws Exception {
		problem = new LengthOfLastWord();
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
