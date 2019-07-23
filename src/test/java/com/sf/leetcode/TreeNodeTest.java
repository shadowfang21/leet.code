package com.sf.leetcode;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sf.leetcode.TreeNode;

public class TreeNodeTest {

	@Test
	public void test() {
		
		Integer[] t = new Integer[]{1, 2, 3, 4, 6, 7, 8};
		
		TreeNode<Integer> result = TreeNode.buildPerfectBinaryTreeFromArray(t);
		
		assertEquals("4271368", TreeNode.bfsShowVal(result));
	}

}
