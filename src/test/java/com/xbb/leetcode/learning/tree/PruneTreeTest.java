package com.xbb.leetcode.learning.tree;

import com.xbb.leetcode.learning.common.StructUtil;
import com.xbb.leetcode.learning.common.TreeNode;

import junit.framework.TestCase;

public class PruneTreeTest extends TestCase {
    private PruneTree pruneTree;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        this.pruneTree = new PruneTree();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        this.pruneTree = null;
    }

    public void testPruneTree() {
        System.out.println("====== prune tree ======");
        TreeNode in = StructUtil.arrayToTree(new Integer[] {1, null, 0, 0, 1});
        System.out.println("case 1: ");
        StructUtil.printTree(in);
        TreeNode out = pruneTree.pruneTree(in);
        System.out.println("prune tree: ");
        StructUtil.printTree(out);

        in = StructUtil.arrayToTree(new Integer[] {1, 0, 1, 0, 0, 0, 1});
        System.out.println("case 2: ");
        StructUtil.printTree(in);
        System.out.println("prune tree: ");
        StructUtil.printTree(out);

        in = StructUtil.arrayToTree(new Integer[] {1, 1, 0, 1, 1, 0, 1, 0});
        System.out.println("case 3: ");
        StructUtil.printTree(in);
        System.out.println("prune tree: ");
        StructUtil.printTree(out);
        System.out.println("====== prune tree ======");
    }
}
