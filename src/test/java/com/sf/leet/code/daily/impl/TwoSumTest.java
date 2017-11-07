package com.sf.leet.code.daily.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sf.leet.code.daily.TwoSum;
import com.sf.leet.code.daily.impl.TwoSumForce;
import com.sf.leet.code.daily.impl.TwoSumOnePass;

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
