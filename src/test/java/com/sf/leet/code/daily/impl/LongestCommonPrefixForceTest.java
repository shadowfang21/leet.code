package com.sf.leet.code.daily.impl;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sf.leet.code.daily.LengthOfLongestSubstring;
import com.sf.leet.code.daily.LongestCommonPrefix;

@RunWith(Parameterized.class)
public class LongestCommonPrefixForceTest {
	
	LongestCommonPrefix test;
	
	private String[] input;
	private String expectedResult;
	
	@Before
	public void setUp() {
		test = new LongestCommonPrefixForce();
	}
	
	public LongestCommonPrefixForceTest(String[] input, String expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{new String[]{}, ""},
			{new String[]{"aaabb", "abb"}, "a"},
			{new String[]{"aaaaaaaaa", "aaaaa", "aaaaaaaaaa"}, "aaaaa"},
		});
	}
	
	@Test
	public void test() {
		assertEquals(expectedResult, test.longestCommonPrefix(input));
	}
	
}
