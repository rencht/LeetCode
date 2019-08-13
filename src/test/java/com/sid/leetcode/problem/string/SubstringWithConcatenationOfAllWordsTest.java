package com.sid.leetcode.problem.string;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.string.SubstringWithConcatenationOfAllWords;

public class SubstringWithConcatenationOfAllWordsTest {

	private SubstringWithConcatenationOfAllWords problem;

	@Before
	public void setUp() throws Exception {
		problem = new SubstringWithConcatenationOfAllWords();
	}

	@Test
	public void testFindSubstring() throws Exception {
		assertEquals(Arrays.asList(0, 9), problem.findSubstring("barfoothefoobarman", new String[] { "foo", "bar" }));
		assertEquals(Arrays.asList(), problem.findSubstring("wordgoodgoodgoodbestword", new String[] { "word", "good", "best", "word" }));
		assertEquals(Arrays.asList(8), problem.findSubstring("wordgoodgoodgoodbestword", new String[] { "word", "good", "best", "good" }));
		assertEquals(Arrays.asList(), problem.findSubstring("barfoothefoobarman", new String[] { "aaa", "bar" }));
		assertEquals(Arrays.asList(0), problem.findSubstring("bar", new String[] { "bar" }));
		assertEquals(Arrays.asList(), problem.findSubstring("bar", new String[] { "foo", "bar" }));
		assertEquals(Arrays.asList(0, 1, 2, 3), problem.findSubstring("aaaaaaaaa", new String[] { "aaa", "aaa" }));
		assertEquals(Arrays.asList(), problem.findSubstring("bar", new String[] {}));
	}

	@Test
	public void testFindSubstringRevisied() throws Exception {
		assertEquals(Arrays.asList(0, 9), problem.findSubstringRevised("barfoothefoobarman", new String[] { "foo", "bar" }));
		assertEquals(Arrays.asList(), problem.findSubstringRevised("wordgoodgoodgoodbestword", new String[] { "word", "good", "best", "word" }));
		assertEquals(Arrays.asList(8), problem.findSubstringRevised("wordgoodgoodgoodbestword", new String[] { "word", "good", "best", "good" }));
		assertEquals(Arrays.asList(), problem.findSubstringRevised("barfoothefoobarman", new String[] { "aaa", "bar" }));
		assertEquals(Arrays.asList(0), problem.findSubstringRevised("bar", new String[] { "bar" }));
		assertEquals(Arrays.asList(), problem.findSubstringRevised("bar", new String[] { "foo", "bar" }));
		assertEquals(Arrays.asList(0, 3, 1, 2), problem.findSubstringRevised("aaaaaaaaa", new String[] { "aaa", "aaa" }));
		assertEquals(Arrays.asList(), problem.findSubstringRevised("bar", new String[] {}));
	}

}
