package com.sf.leet.code.daily.linkedlist.impl;

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
import com.sf.leet.code.daily.RemoveDuplicatesfromSortedArray;
import com.sf.leet.code.daily.bean.ListNode;
import com.sf.leet.code.daily.linkedlist.SwapNodesinPairs;
import com.sf.leet.code.daily.linkedlist.impl.SwapNodesinPairsForce;

@RunWith(Parameterized.class)
public class SwapNodesinPairsTest {
	
	SwapNodesinPairs test;
	
	private Integer[] input;
	private String expectedResult;
	
	@Before
	public void setUp() {
		test = new SwapNodesinPairsForce();
	}
	
	public SwapNodesinPairsTest(Integer[] input, String expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{new Integer[]{}, ""},
			{new Integer[]{1}, "1"},
			{new Integer[]{5, 6}, "65"},
			{new Integer[]{1, 2, 3, 4}, "2143"},
			{new Integer[]{1, 1, 2}, "112"},
			{new Integer[]{1, 1, 2, 3, 3}, "11323"},
		});
	}
	
	@Test
	public void test() {
		assertEquals(expectedResult, ListNode.showVal(
				test.swapPairs(ListNode.buildFromArray(input))));
	}
	
}
