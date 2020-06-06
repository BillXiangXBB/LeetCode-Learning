package com.xbb.leetcode.learning.tree;

import com.xbb.leetcode.learning.common.StructUtil;
import com.xbb.leetcode.learning.common.TreeNode;

import junit.framework.TestCase;

public class HasBalancedTreeTest extends TestCase {
    private HasBalancedTree hasBalancedTree;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        hasBalancedTree = new HasBalancedTree();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        hasBalancedTree = null;
    }

    public void testHasBalancedTree() {
        System.out.println("====== balanced binary tree ======");
        boolean hasBalancedTree1 =
                hasBalancedTree.isBalanced(StructUtil.arrayToTree(new Integer[] {3, 9, 20, null, null, 15, 7}));
        assertTrue(hasBalancedTree1);

        boolean hasBalancedTree2 =
                hasBalancedTree.isBalanced(StructUtil.arrayToTree(new Integer[] {1, 2, 2, 3, 3, null, null, 4, 4}));
        assertFalse(hasBalancedTree2);
        System.out.println("====== balanced binary tree ======");
    }
}
