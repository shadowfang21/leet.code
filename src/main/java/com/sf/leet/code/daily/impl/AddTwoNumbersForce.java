package com.sf.leet.code.daily.impl;

import com.sf.leet.code.daily.AddTwoNumbers;
import com.sf.leet.code.daily.bean.ListNode;

/**
 * this one may cause over Integer.max
 * @author JohnDoe21
 *
 */
public class AddTwoNumbersForce implements AddTwoNumbers {

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
