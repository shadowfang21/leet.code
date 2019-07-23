package com.sf.leetcode.linkedlist;

import java.util.Iterator;

import com.sf.leetcode.ListNode;

/**
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 * @author JohnDoe21
 *
 */
public interface AddTwoNumbers {
    public ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2);
    
    
    /**
     * this one may cause over Integer.max
     * @author JohnDoe21
     *
     */
    static class AddTwoNumbersForce implements AddTwoNumbers {

    	@Override
    	public ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {
    		
    		final int val1 = getNumber(l1, 1);
    		final int val2 = getNumber(l2, 1);
    		
    		final int val3 = val1 + val2;
    		
    		ListNode<Integer> root = null;
    		if (val3 > 0) {
    			root = new ListNode<Integer>(val3 % 10);
    			ListNode<Integer> currentNode = root;
    			int temp = val3 / 10;
    			while (temp != 0) {
    				currentNode.next = new ListNode<Integer>(temp % 10);
    				currentNode = currentNode.next;
    				temp /= 10;
    			}
    		} else {
    			root = new ListNode<Integer>(0);
    		}
    		return root;
    	}
    	
    	private int getNumber(ListNode<Integer> node, int multiplier) {
    		int result = node.val * multiplier;
    		if (node.next != null) {
    			result += getNumber(node.next, multiplier * 10);
    		} 
    		return result;
    	}
    	
    }
    
    class AddTwoNumbersIterator implements AddTwoNumbers {

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

}


