package com.sf.leetcode.array;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sf.leetcode.array.RemoveDuplicatesfromSortedArray;
import com.sf.leetcode.array.RemoveDuplicatesfromSortedArray.RemoveDuplicatesfromSortedArrayForce;



@RunWith(Parameterized.class)
public class RemoveDuplicatesfromSortedArrayTest {
	
	RemoveDuplicatesfromSortedArray test;
	
	private int[] input;
	private int expectedResult;
	
	@Before
	public void setUp() {
		test = new RemoveDuplicatesfromSortedArrayForce();
	}
	
	public RemoveDuplicatesfromSortedArrayTest(int[] input, int expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{new int[]{}, 0},
			{new int[]{1, 1}, 1},
			{new int[]{1, 1, 2}, 2},
			{new int[]{1, 1, 2, 3, 3}, 3},
		});
	}
	
	@Test
	public void test() {
		assertEquals(expectedResult, test.removeDuplicates(input));
	}
	
}
