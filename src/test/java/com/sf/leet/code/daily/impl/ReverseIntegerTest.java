package com.sf.leet.code.daily.impl;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sf.leet.code.daily.ReverseInteger;

@RunWith(Parameterized.class)
public abstract class ReverseIntegerTest {
	
	ReverseInteger test;
	
	private int input;
	private int result;
	
	public ReverseIntegerTest(int input, int result) {
		this.input = input;
		this.result = result;
	}
	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{123,321},
			{-123,-321},
			{1534236469, 0},
			{-2147483648, 0},
			{1463847412, 2147483641}
		});
	}
	
	@Test
	public void test() {
		assertEquals(result, test.reverse(input));
	}
}
