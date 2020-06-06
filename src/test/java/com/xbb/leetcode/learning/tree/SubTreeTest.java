package com.xbb.leetcode.learning.tree;

import com.xbb.leetcode.learning.common.StructUtil;
import com.xbb.leetcode.learning.common.TreeNode;

import junit.framework.TestCase;

public class SubTreeTest extends TestCase {
    private SubTree subTree;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        subTree = new SubTree();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        subTree = null;
    }

    public void testSubStructure() {
        System.out.println("====== sub structure ======");
        TreeNode a = StructUtil.arrayToTree(new Integer[] {1, 2, 3});
        TreeNode b = StructUtil.arrayToTree(new Integer[] {3, 1});
        boolean res = subTree.isSubStructure(a, b);
        assertFalse(res);

        a = StructUtil.arrayToTree(new Integer[] {3, 4, 5, 1, 2});
        b = StructUtil.arrayToTree(new Integer[] {4, 1});
        res = subTree.isSubStructure(a, b);
        assertTrue(res);
        System.out.println("====== sub structure ======");
    }
}
