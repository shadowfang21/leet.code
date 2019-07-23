package com.sf.leetcode.linkedlist;

import com.sf.leetcode.ListNode;

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
	
	class RemoveNthNodeFromEndofListForce implements RemoveNthNodeFromEndofList {

		@Override
		public ListNode<Integer> removeNthFromEnd(ListNode<Integer> head, int n) {
			
			ListNode<Integer> cur = head;
			ListNode<Integer> target = null;
			
			int count = 0;
			while (cur != null) {
				count++;
				if (count > n) {
					if (target == null) {
						target = head;
					} else {
						target = target.next;	
					}
				}
				cur = cur.next;
			}
			
			if (target != null && target.next != null) {
				target.next = target.next.next;
			}
			
			return count > n ? head : head.next;
		}

	}
}
