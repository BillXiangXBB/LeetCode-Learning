package com.xbb.leetcode.learning.tree;

import com.xbb.leetcode.learning.common.TreeNode;

/**
 * LeetCode 617: 合并二叉树
 *
 * @author x00444382
 * @since 2020-05-27
 */
public class MergeTwoTrees {
    /**
     * 合并二叉树
     *
     * @param t1 二叉树
     * @param t2 二叉树
     * @return 合并后的二叉树
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        int val = t1.val + t2.val;
        TreeNode node = new TreeNode(val);
        node.left = mergeTrees(t1.left, t2.left);
        node.right = mergeTrees(t1.right, t2.right);
        return node;
    }
}
