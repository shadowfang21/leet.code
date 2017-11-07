package com.sf.leet.code.daily.tree.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.sf.leet.code.daily.bean.TreeNode;
import com.sf.leet.code.daily.tree.InvertBinaryTree;
import com.sf.leet.code.daily.tree.impl.InvertBinaryTreeForce;

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
