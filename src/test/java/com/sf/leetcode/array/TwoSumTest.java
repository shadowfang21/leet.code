package com.sf.leetcode.array;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.sf.leetcode.array.TwoSum;

public abstract class TwoSumTest {

	protected TwoSum test;
	
	@Test
	public void testTwoSum() {
		assertArrayEquals(new int[]{1, 2}, test.twoSum(new int[]{3, 2, 4}, 6));
	}
	
	@Test
	public void testTwoSum1() {
		assertArrayEquals(new int[]{0, 2}, test.twoSum(new int[]{7, 3, 1}, 8));
	}
	
	@Test
	public void testTwoSum2() {
		assertArrayEquals(new int[]{0, 2}, test.twoSum(new int[]{7, 3, 7}, 14));
	}

}
