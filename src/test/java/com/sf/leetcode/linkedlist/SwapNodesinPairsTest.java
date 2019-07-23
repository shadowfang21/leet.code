package com.sf.leetcode.linkedlist;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sf.leetcode.ListNode;
import com.sf.leetcode.linkedlist.SwapNodesinPairs;
import com.sf.leetcode.linkedlist.SwapNodesinPairs.SwapNodesinPairsForce;

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
