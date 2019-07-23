package com.sf.leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.sf.leetcode.TreeNode;

public interface SymmetricTree {
	boolean isSymmetric(TreeNode<Integer> root);
	
	class SymmetricTreeIterative implements com.sf.leetcode.tree.SymmetricTree {

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
	
	class SymmetricTreeRecursive implements SymmetricTree {

		@Override
		public boolean isSymmetric(TreeNode<Integer> root) {
			// TODO Auto-generated method stub
			return false;
		}

	}

}
