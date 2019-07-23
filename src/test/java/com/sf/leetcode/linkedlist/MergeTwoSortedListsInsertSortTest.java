package com.sf.leetcode.linkedlist;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import com.sf.leetcode.ListNode;
import com.sf.leetcode.linkedlist.MergeTwoSortedLists;
import com.sf.leetcode.linkedlist.MergeTwoSortedLists.MergeTwoSortedListsInsertSort;

public class MergeTwoSortedListsInsertSortTest {

	MergeTwoSortedLists test;
	
	@Before
	public void setUp() {
		test = new MergeTwoSortedListsInsertSort();
	}
	
	@Test
	public void test() {
		ListNode<Integer> result = test.mergeTwoLists(ListNode.buildFromList(Arrays.asList(new Integer[]{2,3,4})),
				ListNode.buildFromList(Arrays.asList(new Integer[]{4,5,6})));
		
		assertEquals("234456", ListNode.showVal(result));
	}

}
