package com.xbb.leetcode.learning.tree;

import com.xbb.leetcode.learning.common.TreeNode;

/**
 * LeetCode 110: 平衡二叉树
 * 高度平衡二叉树的定义：一个二叉树每个节点的左右两个子树的高度差的绝对值不超过1
 *
 * @author x00444382
 * @since 2020-05-27
 */
public class HasBalancedTree {
    /**
     * 递归算法计算平衡二叉树高度
     *
     * @param root 根节点
     * @return 是否为平衡二叉树
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        } else if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return Math.max(left, right) + 1;
    }
}
