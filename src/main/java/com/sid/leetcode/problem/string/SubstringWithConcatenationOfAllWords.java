package com.sid.leetcode.problem.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 30. Substring with Concatenation of All Words.
 *
 * <blockquote>
 * You are given a string, s, and a list of words, words, that are all of the same length.
 * Find all starting indices of substring(s) in s that is a concatenation of each word in
 * words exactly once and without any intervening characters.
 * 
 * <p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> s = "barfoothefoobarman", words = [ "foo", "bar" ]
 * <p><b>Output:</b> [ 0, 9 ]
 * <p><b>Explanation:</b> Substrings starting at index 0 and 9 are "barfoo" and "foobar" respectively.
 * <p>The output order does not matter, returning [ 9, 0 ] is fine too.
 * </blockquote>
 * 
 * <p>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> s = "wordgoodgoodgoodbestword", words = [ "word", "good", "best", "word" ]
 * <p><b>Output:</b> []
 * </blockquote>
 * </blockquote>
 *
 * @author Sid.Chen
 * @version 1.0, 2019-07-09
 *
 */
public class SubstringWithConcatenationOfAllWords {

	public List<Integer> findSubstring(String s, String[] words) {
		if (words.length == 0 || s.length() < words.length * words[0].length()) return new ArrayList<Integer>();

		final Map<String, Integer> occurrences = new HashMap<String, Integer>();
		for (final String word : words) {
			occurrences.put(word, occurrences.getOrDefault(word, 0) + 1);
		}

		final List<Integer> result = new ArrayList<Integer>();

		final int max = s.length() - words.length * words[0].length();
		final int wordLength = words[0].length();

		Outer: for (int i = 0; i <= max; i++) {
			final Map<String, Integer> current = new HashMap<String, Integer>(occurrences);

			int j = i;
			for (int k = 0; k < words.length; k++) {
				final String word = s.substring(j, j + wordLength);
				if (!current.containsKey(word) || current.get(word) <= 0) continue Outer;
				current.put(word, current.get(word) - 1);
				j += wordLength;
			}

			result.add(i);
		}

		return result;
	}

	public List<Integer> findSubstringRevised(String s, String[] words) {
		if (words.length == 0 || s.length() < words.length * words[0].length()) return new ArrayList<Integer>();

		final Map<String, Integer> occurrences = new HashMap<String, Integer>();
		for (final String word : words) {
			occurrences.put(word, occurrences.getOrDefault(word, 0) + 1);
		}

		final List<Integer> result = new ArrayList<Integer>();

		final int window = words.length * words[0].length();
		final int wordLength = words[0].length();

		for (int i = 0; i < wordLength; i++) {
			int start = i;
			while (start <= s.length() - window) {
				int end = start + window;
				final Map<String, Integer> current = new HashMap<String, Integer>(occurrences);
				while (end > start) {
					final String word = s.substring(end - wordLength, end);
					if (!current.containsKey(word) || current.get(word) <= 0) break;
					current.put(word, current.get(word) - 1);
					end -= wordLength;
				}
				if (start == end) {
					result.add(start);
					start += wordLength;
				}
				else {
					start = end;
				}
			}
		}

		return result;
	}

}
