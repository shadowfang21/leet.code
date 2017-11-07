package com.sf.leet.code.daily.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sf.leet.code.daily.RemoveElement;
@RunWith(Parameterized.class)
public class RemoveElementTest {

	RemoveElement test;
	
	
	private Object[] input;
	private int expectedResult;
	
	@Before
	public void setUp() {
		test = new RemoveElementForce();
	}
	
	public RemoveElementTest(Object[] input, int expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{new Object[]{new int[]{3,2,2,3}, 3}, 2},
			{new Object[]{new int[]{1}, 1}, 0},
			{new Object[]{new int[]{1,2,3,4}, 1}, 3}
		});
	}
	
	@Test
	public void test() {
		assertEquals(expectedResult, test.removeElement(
				(int[]) input[0], 
				(int) input[1]));
	}


}
