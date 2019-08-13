package com.sid.leetcode.problem.string;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.string.SimplifyPath;

public class SimplifyPathTest {

	private SimplifyPath problem;

	@Before
	public void setUp() throws Exception {
		problem = new SimplifyPath();
	}

	@Test
	public void testSimplifyPath() throws Exception {
		assertEquals("/home", problem.simplifyPath("/home/"));
		assertEquals("/", problem.simplifyPath("/../"));
		assertEquals("/home/foo", problem.simplifyPath("/home//foo/"));
		assertEquals("/c", problem.simplifyPath("/a/./b/../../c/"));
		assertEquals("/c", problem.simplifyPath("/a/../../b/../c//.//"));
		assertEquals("/a/b/c", problem.simplifyPath("/a//b////c/d//././/.."));
	}

}
