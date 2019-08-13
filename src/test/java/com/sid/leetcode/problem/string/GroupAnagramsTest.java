package com.sid.leetcode.problem.string;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.string.GroupAnagrams;

public class GroupAnagramsTest {

	private GroupAnagrams problem;

	@Before
	public void setUp() throws Exception {
		problem = new GroupAnagrams();
	}

	@Test
	public void testGroupAnagrams() throws Exception {
		{
			final List<List<String>> result = problem.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat" });
			assertEquals(3, result.size());

			result.sort(new Comparator<List<String>> () {
				public int compare(List<String> o1, List<String> o2) {
					return o1.get(0).compareTo(o2.get(0));
				}
			});

			assertEquals(Arrays.asList("bat"), result.get(0));
			assertEquals(Arrays.asList("eat", "tea", "ate"), result.get(1));
			assertEquals(Arrays.asList("tan", "nat"), result.get(2));
		}

		{
			final List<List<String>> result = problem.groupAnagrams(new String[] { "eat", "tea", "tan", "ate", "nat", "bat", "at" });
			assertEquals(4, result.size());

			result.sort(new Comparator<List<String>> () {
				public int compare(List<String> o1, List<String> o2) {
					return o1.get(0).compareTo(o2.get(0));
				}
			});

			assertEquals(Arrays.asList("at"), result.get(0));
			assertEquals(Arrays.asList("bat"), result.get(1));
			assertEquals(Arrays.asList("eat", "tea", "ate"), result.get(2));
			assertEquals(Arrays.asList("tan", "nat"), result.get(3));
		}
	}

}
