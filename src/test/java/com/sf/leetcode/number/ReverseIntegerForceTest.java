package com.sf.leetcode.number;

import org.junit.Before;

import com.sf.leetcode.number.ReverseInteger.ReverseIntegerForce;

public class ReverseIntegerForceTest extends ReverseIntegerTest {

	public ReverseIntegerForceTest(int input, int result) {
		super(input, result);
	}

	@Before
	public void setUp() {
		test = new ReverseIntegerForce();
	}
}
