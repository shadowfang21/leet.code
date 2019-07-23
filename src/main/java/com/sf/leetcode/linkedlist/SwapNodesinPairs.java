package com.sf.leetcode.linkedlist;

import com.sf.leetcode.ListNode;

/**
 * Given a linked list, swap every two adjacent nodes and return its head.
 * For example,
 * Given 1->2->3->4, you should return the list as 2->1->4->3.
 * Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
 * @author JohnDoe21
 *
 */
public interface SwapNodesinPairs {
	public ListNode<Integer> swapPairs(ListNode<Integer> head);
	
	class SwapNodesinPairsForce implements SwapNodesinPairs {

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
}
