package com.sf.leet.code.daily.impl;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sf.leet.code.daily.LengthOfLongestSubstring;

@RunWith(Parameterized.class)
public abstract class LengthOfLongestSubstringTest {
	
	LengthOfLongestSubstring test;
	
	private String input;
	private int expectedResult;
	
	public LengthOfLongestSubstringTest(String input, int expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{"abcabcbb", 3},
			{"bbbbb", 1},
			{"pwwkew", 3},
			{"aab", 2}
		});
	}
	
	@Test
	public void test() {
		assertEquals(expectedResult, test.lengthOfLongestSubstring(input));
	}
	
}
