package com.xbb.leetcode.learning.tree;

import com.xbb.leetcode.learning.common.BinaryTreeTraverse;
import com.xbb.leetcode.learning.common.StructUtil;
import com.xbb.leetcode.learning.common.TreeNode;

import junit.framework.TestCase;

public class MergeTwoTreesTest extends TestCase {
    private MergeTwoTrees mergeTwoTrees;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        mergeTwoTrees = new MergeTwoTrees();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        mergeTwoTrees = null;
    }

    public void testMergeTwoTrees() {
        System.out.println("====== merge two trees ======");
        TreeNode t1 = StructUtil.arrayToTree(new Integer[] {1, 3, 2, 5});
        TreeNode t2 = StructUtil.arrayToTree(new Integer[] {2, 1, 3, null, 4, null, 7});
        TreeNode t3 = mergeTwoTrees.mergeTrees(t1, t2);
        System.out.println("pre-order: " + BinaryTreeTraverse.preOrderTraverse(t3));
        System.out.println("in-order: " + BinaryTreeTraverse.inOrderTraverse(t3));
        System.out.println("post-order: " + BinaryTreeTraverse.postOrderTraverse(t3));
        System.out.println("sequence: " + BinaryTreeTraverse.sequenceTraverse(t3));
        StructUtil.printTree(t3);
        System.out.println("====== merge two trees ======");
    }
}
