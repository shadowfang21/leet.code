package com.sf.leet.code.daily.linkedlist.impl;

import com.sf.leet.code.daily.bean.ListNode;
import com.sf.leet.code.daily.linkedlist.SwapNodesinPairs;

public class SwapNodesinPairsForce implements SwapNodesinPairs {

	@Override
	public ListNode<Integer> swapPairs(ListNode<Integer> head) {
		
		ListNode<Integer> cur = head;
		ListNode<Integer> result = head != null && head.next != null? head.next : head;
		ListNode<Integer> before = null;
		ListNode<Integer> pairHead = null;
		int counter = 0;
		while (cur != null) {
			counter++;
			ListNode<Integer> next = cur.next;
			if (counter % 2 == 0) {
				//swap
				ListNode<Integer> temp = cur;
				before.next = temp.next;
				temp.next = before;
				
				if (pairHead != null) {
					pairHead.next = cur;
				}
				pairHead = before;
				
				counter = 0;
			}
			before = cur;
			cur = next;
		}
		return result;
	}

}
