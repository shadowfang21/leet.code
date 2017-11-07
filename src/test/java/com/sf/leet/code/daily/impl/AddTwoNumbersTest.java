package com.sf.leet.code.daily.impl;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.sf.leet.code.daily.AddTwoNumbers;
import com.sf.leet.code.daily.bean.ListNode;

public abstract class AddTwoNumbersTest {

	AddTwoNumbers test;
	
	@Before
	public void setUp() {
		test = new AddTwoNumbersForce();
	}
	
	@Test
	public void testAddTwoNumbers() {
		
		ListNode<Integer> result = test.addTwoNumbers(
				ListNode.buildFromArray(new Integer[]{2,4,3}),
				ListNode.buildFromArray(new Integer[]{5,6,4}));
		
		assertEquals("708", ListNode.showVal(result));
	}
	
	@Test
	public void testAddTwoNumbers1() {
		
		ListNode<Integer> result = test.addTwoNumbers(
				ListNode.buildFromArray(new Integer[]{9}),
				ListNode.buildFromArray(new Integer[]{1,9,9,9,9,9,9,9,9,9}));
		
		assertEquals("00000000001", ListNode.showVal(result));
	}

}
