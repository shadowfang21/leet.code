package com.sf.leetcode.tree;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sf.leetcode.TreeNode;
import com.sf.leetcode.tree.SymmetricTree;
import com.sf.leetcode.tree.SymmetricTree.SymmetricTreeIterative;

public class SymmetricTreeTest {

	SymmetricTree test;
	
	@Before
	public void setUp() {
		test = new SymmetricTreeIterative();
	}
	
	@Test
	public void testInvertTree() {
		Integer[] t = new Integer[]{3, 2, 4, 1, 4, 2, 3};
		
		assertEquals(true, test.isSymmetric(TreeNode.buildPerfectBinaryTreeFromArray(t)));
	}
	
	@Test
	public void testInvertTree1() {
		Integer[] t = new Integer[]{1};
		
		assertEquals(true, test.isSymmetric(TreeNode.buildPerfectBinaryTreeFromArray(t)));
	}

}
