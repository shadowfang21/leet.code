package com.sf.leet.code.daily.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ReverseIntegerForceTest extends ReverseIntegerTest {

	public ReverseIntegerForceTest(int input, int result) {
		super(input, result);
	}

	@Before
	public void setUp() {
		test = new ReverseIntegerForce();
	}
}
