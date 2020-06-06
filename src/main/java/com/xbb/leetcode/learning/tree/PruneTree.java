package com.xbb.leetcode.learning.tree;

import com.xbb.leetcode.learning.common.TreeNode;

/**
 * LeetCode 814: 二叉树剪枝
 * 给定二叉树根节点root，
 *
 * @author x00444382
 * @since 2020-05-28
 */
public class PruneTree {
    public TreeNode pruneTree(TreeNode root) {
        return containsOne(root) ? root : null;
    }

    private boolean containsOne(TreeNode root) {
        if (root == null) {
            return false;
        }
        boolean left = containsOne(root.left);
        boolean right = containsOne(root.right);
        if (!left) {
            root.left = null;
        }
        if (!right) {
            root.right = null;
        }
        return root.val == 1 || left || right;
    }
}
