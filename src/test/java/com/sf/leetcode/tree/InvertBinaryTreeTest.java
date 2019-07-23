package com.sf.leetcode.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sf.leetcode.TreeNode;
import com.sf.leetcode.tree.InvertBinaryTree;
import com.sf.leetcode.tree.InvertBinaryTree.InvertBinaryTreeForce;

public class InvertBinaryTreeTest {
	
	InvertBinaryTree test;
	
	@Before
	public void setUp() {
		test = new InvertBinaryTreeForce();
	}
	
	@Test
	public void testInvertTree() {
		Integer[] t = new Integer[]{1, 2, 3, 4, 6, 7, 9};
		
		final TreeNode<Integer> result = 
				test.invertTree(TreeNode.buildPerfectBinaryTreeFromArray(t));
		
		assertEquals("4729631", TreeNode.bfsShowVal(result));
	}

}
