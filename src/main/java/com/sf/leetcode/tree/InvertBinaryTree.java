package com.sf.leetcode.tree;

import com.sf.leetcode.TreeNode;

public interface InvertBinaryTree {
	 TreeNode<Integer> invertTree(TreeNode<Integer> root);
	 
	 class InvertBinaryTreeForce implements InvertBinaryTree {

			@Override
			public TreeNode<Integer> invertTree(TreeNode<Integer> root) {
				
				if (root != null) {
					final TreeNode<Integer> temp = root.left;
					root.left = root.right;
					root.right = temp;
					
					if (root.left != null) {
						invertTree(root.left);
					}
					if (root.right != null) { 
						invertTree(root.right);
					}
						
				}
				return root;
			}

		}

}
