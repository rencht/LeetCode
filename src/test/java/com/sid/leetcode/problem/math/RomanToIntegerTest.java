package com.sid.leetcode.problem.math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.math.RomanToInteger;

public class RomanToIntegerTest {

	private RomanToInteger problem;

	@Before
	public void setUp() throws Exception {
		problem = new RomanToInteger();
	}

	@Test
	public void testRomanToInt() throws Exception {
		assertEquals(1, problem.romanToInt("I"));
		assertEquals(2, problem.romanToInt("II"));
		assertEquals(4, problem.romanToInt("IV"));
		assertEquals(5, problem.romanToInt("V"));
		assertEquals(8, problem.romanToInt("VIII"));
		assertEquals(9, problem.romanToInt("IX"));
		assertEquals(10, problem.romanToInt("X"));
		assertEquals(14, problem.romanToInt("XIV"));
		assertEquals(19, problem.romanToInt("XIX"));
		assertEquals(200, problem.romanToInt("CC"));
		assertEquals(800, problem.romanToInt("DCCC"));
		assertEquals(1888, problem.romanToInt("MDCCCLXXXVIII"));
		assertEquals(1899, problem.romanToInt("MDCCCXCIX"));
		assertEquals(1976, problem.romanToInt("MCMLXXVI"));
		assertEquals(1984, problem.romanToInt("MCMLXXXIV"));
		assertEquals(3999, problem.romanToInt("MMMCMXCIX"));
	}

	@Test
	public void testOptimizedRomanToInt() throws Exception {
		assertEquals(1, problem.optimizedRomanToInt("I"));
		assertEquals(2, problem.optimizedRomanToInt("II"));
		assertEquals(4, problem.optimizedRomanToInt("IV"));
		assertEquals(5, problem.optimizedRomanToInt("V"));
		assertEquals(8, problem.optimizedRomanToInt("VIII"));
		assertEquals(9, problem.optimizedRomanToInt("IX"));
		assertEquals(10, problem.optimizedRomanToInt("X"));
		assertEquals(14, problem.optimizedRomanToInt("XIV"));
		assertEquals(19, problem.optimizedRomanToInt("XIX"));
		assertEquals(200, problem.optimizedRomanToInt("CC"));
		assertEquals(800, problem.optimizedRomanToInt("DCCC"));
		assertEquals(1888, problem.optimizedRomanToInt("MDCCCLXXXVIII"));
		assertEquals(1899, problem.optimizedRomanToInt("MDCCCXCIX"));
		assertEquals(1976, problem.optimizedRomanToInt("MCMLXXVI"));
		assertEquals(1984, problem.optimizedRomanToInt("MCMLXXXIV"));
		assertEquals(3999, problem.optimizedRomanToInt("MMMCMXCIX"));
	}

}
