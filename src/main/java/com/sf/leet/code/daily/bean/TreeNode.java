package com.sf.leet.code.daily.bean;

import java.util.LinkedList;
import java.util.Queue;

public class TreeNode<T> {
	
	public T val;
	public TreeNode<T> left;
	public TreeNode<T> right;
	
	public TreeNode(T val) {
		this.val = val;
	}
	
	public static <T> String bfsShowVal(TreeNode<T> root) {
		
		final StringBuilder sb = new StringBuilder();
		final Queue<TreeNode<T>> queue = new LinkedList<TreeNode<T>>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
			final TreeNode<T> node = queue.poll();
			sb.append(node.val);
			
			if (node.left != null) {
				queue.add(node.left);
			}
			if (node.right != null) {
				queue.add(node.right);
			}
		}
		return sb.toString();
	}
	
	public static <T> TreeNode<T> buildPerfectBinaryTreeFromArray(T[] data) {
		
		if (data.length % 2 == 0) {
			throw new IllegalArgumentException("data length : " + data.length);
		}
		
		TreeNode<T> root = buildBinaryTreeFromArray(data, 0, data.length);
		
		return root;
	}
	
	private static <T> TreeNode<T> buildBinaryTreeFromArray(T[] data, int start, int length) {
		
		if (length == 0) {
			return null;
		}
		
		TreeNode<T> root = new TreeNode<T>(data[start + length / 2]);
		root.left = buildBinaryTreeFromArray(data, start, length / 2);
		root.right = buildBinaryTreeFromArray(data, start + (length / 2) + 1, length / 2);
		return root;
	}
	
}
