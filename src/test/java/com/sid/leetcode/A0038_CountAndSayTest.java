package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0038_CountAndSayTest {

	private A0038_CountAndSay problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0038_CountAndSay();
	}

	@Test
	public void testCountAndSay() throws Exception {
		assertEquals("1", problem.countAndSay(1));
		assertEquals("11", problem.countAndSay(2));
		assertEquals("21", problem.countAndSay(3));
		assertEquals("1211", problem.countAndSay(4));
		assertEquals("111221", problem.countAndSay(5));
		assertEquals("312211", problem.countAndSay(6));
		assertEquals("13112221", problem.countAndSay(7));
		assertEquals("1113213211", problem.countAndSay(8));
		assertEquals("31131211131221", problem.countAndSay(9));
		assertEquals("13211311123113112211", problem.countAndSay(10));
	}

}
