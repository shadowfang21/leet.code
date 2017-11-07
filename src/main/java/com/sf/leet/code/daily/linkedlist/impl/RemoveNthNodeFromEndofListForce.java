package com.sf.leet.code.daily.linkedlist.impl;

import com.sf.leet.code.daily.bean.ListNode;
import com.sf.leet.code.daily.linkedlist.RemoveNthNodeFromEndofList;

public class RemoveNthNodeFromEndofListForce implements RemoveNthNodeFromEndofList {

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
