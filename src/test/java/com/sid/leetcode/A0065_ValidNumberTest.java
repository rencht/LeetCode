package com.sid.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class A0065_ValidNumberTest {

	private A0065_ValidNumber problem;

	@Before
	public void setUp() throws Exception {
		problem = new A0065_ValidNumber();
	}

	@Test
	public void testIsNumber() throws Exception {
		assertTrue(problem.isNumber("0"));
		assertTrue(problem.isNumber(" 0.1"));
		assertFalse(problem.isNumber("abc"));
		assertFalse(problem.isNumber("1 a"));
		assertTrue(problem.isNumber("2e10"));
		assertTrue(problem.isNumber(" -90e3    "));
		assertFalse(problem.isNumber(" 1e"));
		assertFalse(problem.isNumber("e3"));
		assertTrue(problem.isNumber(" 6e-1"));
		assertFalse(problem.isNumber(" 99e2.5"));
		assertTrue(problem.isNumber("53.5e93"));
		assertFalse(problem.isNumber(" --6"));
		assertFalse(problem.isNumber("-+3"));
		assertFalse(problem.isNumber("95a54e53"));
		assertFalse(problem.isNumber("  "));
		assertTrue(problem.isNumber("+1"));
		assertTrue(problem.isNumber("-1"));
		assertTrue(problem.isNumber(" .1"));
		assertTrue(problem.isNumber(" .1e1"));
		assertFalse(problem.isNumber("+"));
		assertFalse(problem.isNumber("+."));
		assertFalse(problem.isNumber("+a"));
		assertTrue(problem.isNumber("1."));
		assertTrue(problem.isNumber("1.e1"));
		assertFalse(problem.isNumber("1.."));
		assertFalse(problem.isNumber("1.a"));
		assertFalse(problem.isNumber("1.1."));
		assertTrue(problem.isNumber(" 6e+1"));
		assertFalse(problem.isNumber("1ee"));
	}

}
