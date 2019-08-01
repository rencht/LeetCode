package com.sid.leetcode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class A0071_SimplifyPathTest {

	private A0071_SimplifyPath problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0071_SimplifyPath();
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
