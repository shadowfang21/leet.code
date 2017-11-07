package com.sf.leet.code.daily.impl;

import java.util.Iterator;

import com.sf.leet.code.daily.AddTwoNumbers;
import com.sf.leet.code.daily.bean.ListNode;

public class AddTwoNumbersIterator implements AddTwoNumbers {

	@Override
	public ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {
		
		ListNode<Integer> result = null;
		
		
		final ListNodeIterator<Integer> iter1 = new ListNodeIterator<>(l1);
		final ListNodeIterator<Integer> iter2 = new ListNodeIterator<>(l2);
		
		int increase = 0 ;
		ListNode<Integer> currentNode = null;
		while (iter1.hasNext() || iter2.hasNext() || increase != 0) {
			int currentVal1 = 0;
			if (iter1.hasNext()) {
				currentVal1 = iter1.next();
			}
			int currentVal2 = 0;
			if (iter2.hasNext()) {
				currentVal2 = iter2.next();
			}
			
			int sum = currentVal1 + currentVal2 + increase;
			
			ListNode<Integer> newNode = new ListNode<Integer>(sum % 10);
			if (result == null) {
				result = newNode;
				currentNode = result;
			} else {
				currentNode.next = newNode;
				currentNode = currentNode.next;
			}
			increase = sum / 10;
		}
		
		return result;
	}
	
	private class ListNodeIterator<T> implements Iterator<T> {

		private ListNode<T> current;
		
		public ListNodeIterator(ListNode<T> root) {
			current = root;
		}
		
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public T next() {
			final T result = current.val;
			current = current.next;
			return result;
		}
		
	}
	
}
