package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class A0068_TextJustificationTest {

	private A0068_TextJustification problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0068_TextJustification();
	}

	@Test
	public void testFullJustify() throws Exception {
		assertEquals(
				Arrays.asList(
						"This    is    an",
						"example  of text",
						"justification.  "),
				problem.fullJustify(
						new String[] { "This", "is", "an", "example", "of", "text", "justification." },
						16));

		assertEquals(
				Arrays.asList(
						"What   must   be",
						"acknowledgment  ",
						"shall be        "),
				problem.fullJustify(
						new String[] { "What", "must", "be", "acknowledgment", "shall", "be" },
						16));

		assertEquals(
				Arrays.asList(
						"Science  is  what we",
						"understand      well",
						"enough to explain to",
						"a  computer.  Art is",
						"everything  else  we",
						"do                  "),
				problem.fullJustify(
						new String[] { "Science", "is", "what", "we", "understand", "well", "enough", "to", "explain", "to", "a", "computer.", "Art", "is", "everything", "else", "we", "do" },
						20));
	}

}
