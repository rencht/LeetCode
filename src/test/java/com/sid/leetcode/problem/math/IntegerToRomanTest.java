package com.sid.leetcode.problem.math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.math.IntegerToRoman;

public class IntegerToRomanTest {

	private IntegerToRoman problem;

	@Before
	public void setUp() throws Exception {
		problem = new IntegerToRoman();
	}

	@Test
	public void testIntToRoman() throws Exception {
		assertEquals("I", problem.intToRoman(1));
		assertEquals("II", problem.intToRoman(2));
		assertEquals("IV", problem.intToRoman(4));
		assertEquals("V", problem.intToRoman(5));
		assertEquals("VIII", problem.intToRoman(8));
		assertEquals("IX", problem.intToRoman(9));
		assertEquals("X", problem.intToRoman(10));
		assertEquals("XIV", problem.intToRoman(14));
		assertEquals("XIX", problem.intToRoman(19));
		assertEquals("CC", problem.intToRoman(200));
		assertEquals("DCCC", problem.intToRoman(800));
		assertEquals("MDCCCLXXXVIII", problem.intToRoman(1888));
		assertEquals("MDCCCXCIX", problem.intToRoman(1899));
		assertEquals("MCMLXXVI", problem.intToRoman(1976));
		assertEquals("MCMLXXXIV", problem.intToRoman(1984));
		assertEquals("MMMCMXCIX", problem.intToRoman(3999));
	}

}
