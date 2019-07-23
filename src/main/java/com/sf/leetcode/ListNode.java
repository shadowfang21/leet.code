package com.sf.leetcode;

import java.io.Serializable;
import java.util.List;

public class ListNode<T> implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public T val;
    public ListNode<T> next;
	
	public ListNode(T val) {
		this.val = val;
	}

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		this.val = val;
	}

	public ListNode<T> getNext() {
		return next;
	}

	public void setNext(ListNode<T> next) {
		this.next = next;
	}
	
	public static <T> String showVal(ListNode<T> root) {
		final StringBuilder sb = new StringBuilder();
		
		ListNode<T> currentNode = root;
		while (currentNode != null) {
			sb.append(currentNode.val.toString());
			currentNode = currentNode.next;
		}
		return sb.toString();
	}
	
	public static <T> ListNode<T> buildFromList(List<T> input) {
		ListNode<T> root = null;
		if (input.size() > 0) {
			root = new ListNode<T>(input.get(0));
			ListNode<T> currentNode = root;
			for (int i = 1 ; i < input.size() ; i++) {
				currentNode.next = new ListNode<T>(input.get(i));
				currentNode = currentNode.next;
			}
		}
		return root;
	}
	
	public static <T> ListNode<T> buildFromArray(T[] array) {
		ListNode<T> root = null;
		if (array != null && array.length > 0) {
			root = new ListNode<T>(array[0]);
			ListNode<T> currentNode = root;
			for (int i = 1 ; i < array.length ; i++) {
				currentNode.next = new ListNode<T>(array[i]);
				currentNode = currentNode.next;
			}
		}
		return root;
	}
	
}
