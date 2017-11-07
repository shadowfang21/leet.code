package com.sf.leet.code.daily.tree.impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.sf.leet.code.daily.bean.TreeNode;
import com.sf.leet.code.daily.tree.InvertBinaryTree;
import com.sf.leet.code.daily.tree.SymmetricTree;

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
