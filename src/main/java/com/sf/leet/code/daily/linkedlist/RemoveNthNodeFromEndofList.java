package com.sf.leet.code.daily.linkedlist;

import com.sf.leet.code.daily.bean.ListNode;

/**
 * Given a linked list, remove the nth node from the end of list and return its head.
 * For example,
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 * @author JohnDoe21
 *
 */
public interface RemoveNthNodeFromEndofList {
	public ListNode<Integer> removeNthFromEnd(ListNode<Integer> head, int n);
}
