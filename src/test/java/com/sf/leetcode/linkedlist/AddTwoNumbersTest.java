package com.sf.leetcode.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sf.leetcode.ListNode;
import com.sf.leetcode.linkedlist.AddTwoNumbers.AddTwoNumbersForce;


public abstract class AddTwoNumbersTest {

	com.sf.leetcode.linkedlist.AddTwoNumbers test;
	
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
