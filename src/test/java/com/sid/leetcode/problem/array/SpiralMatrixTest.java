package com.sid.leetcode.problem.array;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.sid.leetcode.problem.array.SpiralMatrix;

public class SpiralMatrixTest {

	private SpiralMatrix problem;

	@Before
	public void setUp() throws Exception {
		problem = new SpiralMatrix();
	}

	@Test
	public void testSpiralOrder() throws Exception {
		assertEquals(Arrays.asList(), problem.spiralOrder(null));
		assertEquals(Arrays.asList(), problem.spiralOrder(new int[][] {}));
		assertEquals(Arrays.asList(), problem.spiralOrder(new int[][] { {} }));
		assertEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), problem.spiralOrder(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }));
		assertEquals(Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7), problem.spiralOrder(new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }));
	}

}
