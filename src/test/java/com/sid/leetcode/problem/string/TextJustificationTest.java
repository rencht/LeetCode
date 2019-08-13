package com.sid.leetcode.problem.string;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.string.TextJustification;

public class TextJustificationTest {

	private TextJustification problem;

	@Before
	public void setUp() throws Exception {
		problem = new TextJustification();
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
