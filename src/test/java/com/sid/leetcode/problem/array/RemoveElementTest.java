package com.sid.leetcode.problem.array;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.array.RemoveElement;

public class RemoveElementTest {

	private RemoveElement problem;

	@Before
	public void setUp() throws Exception {
		problem = new RemoveElement();
	}

	@Test
	public void testRemoveElement() throws Exception {
		assertEquals(0, problem.removeElement(null, 1));
		assertEquals(0, problem.removeElement(new int[] {}, 1));

		{
			int[] ints = new int[] { 3, 2, 2, 3 };
			assertEquals(2, problem.removeElement(ints, 3));
			assertArrayEquals(new int[] { 2, 2, 2, 3 }, ints);
		}
	}

}
