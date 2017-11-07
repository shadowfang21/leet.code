package com.sf.leet.code.daily.linkedlist.impl;

import com.sf.leet.code.daily.bean.ListNode;
import com.sf.leet.code.daily.linkedlist.MergeTwoSortedLists;

public class MergeTwoSortedListsInsertSort implements MergeTwoSortedLists {

	@Override
	public ListNode<Integer> mergeTwoLists(ListNode<Integer> l1, ListNode<Integer> l2) {
		
		final ListNode<Integer> result = new ListNode<Integer>(0);
		
		ListNode<Integer> n1 = l1;
		ListNode<Integer> n2 = l2;
		ListNode<Integer> currentNode = result;
		
		while (n1 != null || n2 != null) {
			if (n1 != null && n2 != null) {
				if (n1.val > n2.val) {
					currentNode.next = new ListNode<Integer>(n2.val);
					n2 = n2.next;
				} else {
					currentNode.next = new ListNode<Integer>(n1.val);
					n1 = n1.next;
				}
			} else {
				if (n1 != null) {
					currentNode.next = new ListNode<Integer>(n1.val);
					n1 = n1.next;
				} else {
					currentNode.next = new ListNode<Integer>(n2.val);
					n2 = n2.next;
				}
			}
			currentNode = currentNode.next;
		}
		return result.next;
	}

}
