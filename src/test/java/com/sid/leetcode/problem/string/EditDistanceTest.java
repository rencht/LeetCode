package com.sid.leetcode.problem.string;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.string.EditDistance;

public class EditDistanceTest {

	private EditDistance problem;

	@Before
	public void setUp() throws Exception {
		problem = new EditDistance();
	}

	@Test
	public void testMinDistance() throws Exception {
		assertEquals(3, problem.minDistance("horse", "ros"));
		assertEquals(5, problem.minDistance("intention", "execution"));
	}

}
