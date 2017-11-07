package com.sf.leet.code.daily.linkedlist.impl;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.sf.leet.code.daily.bean.ListNode;
import com.sf.leet.code.daily.linkedlist.RemoveNthNodeFromEndofList;
import com.sf.leet.code.daily.linkedlist.impl.RemoveNthNodeFromEndofListForce;

@RunWith(Parameterized.class)
public class RemoveNthNodeFromEndofListTest {

	RemoveNthNodeFromEndofList test;
	
	private Object[] input;
	private String expectedResult;
	
	@Before
	public void setUp() {
		test = new RemoveNthNodeFromEndofListForce();
	}
	
	public RemoveNthNodeFromEndofListTest(Object[] input, String expectedResult) {
		this.input = input;
		this.expectedResult = expectedResult;
	}
	
	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] {
			{new Object[]{new Integer[]{1,2,3,4,5}, 2}, "1235"},
			{new Object[]{new Integer[]{1,2,3,4,5}, 1}, "1234"},
			{new Object[]{new Integer[]{1,2,3,4,5}, 5}, "2345"},
			{new Object[]{new Integer[]{1}, 1}, ""},
			{new Object[]{new Integer[]{1,2}, 1}, "1"}
		});
	}
	
	@Test
	public void test() {
		assertEquals(expectedResult, ListNode.showVal(
				test.removeNthFromEnd(
						ListNode.buildFromArray((Integer[])input[0]), (int)input[1])));
	}

}
