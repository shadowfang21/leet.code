package com.sf.leet.code.daily.tree.impl;

import java.util.LinkedList;
import java.util.Queue;

import com.sf.leet.code.daily.bean.TreeNode;

public class SymmetricTreeIterative implements com.sf.leet.code.daily.tree.SymmetricTree {

	@Override
	public boolean isSymmetric(TreeNode<Integer> root) {
		
		final Queue<TreeNode<Integer>> queue = new LinkedList<TreeNode<Integer>>();
		
		queue.add(root);
		queue.add(root);
		
		//left and right should have same size, so "and" is ok
		while (!queue.isEmpty()) {
			final TreeNode<Integer> tnl = queue.poll();
			final TreeNode<Integer> tnr = queue.poll();
			
			if (tnl == null && tnr == null) {
				continue;
			}
			if (tnl == null || tnr == null) {
				return false;
			}
			if (!tnl.val.equals(tnr.val)) {
				return false;
			}
			
			queue.add(tnl.left);
			queue.add(tnr.right);
			queue.add(tnl.right);
			queue.add(tnr.left);
			
		}
		
		return true;
	}

}
