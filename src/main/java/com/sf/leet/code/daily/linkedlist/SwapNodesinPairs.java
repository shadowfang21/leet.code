package com.sf.leet.code.daily.linkedlist;

import com.sf.leet.code.daily.bean.ListNode;

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
}
