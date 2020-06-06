package com.xbb.leetcode.learning.tree;

import com.xbb.leetcode.learning.common.TreeNode;

/**
 * LeetCode 26: 树的子结构
 * 输入两颗二叉树A和B，判断B是否是A的子结构；空树不是任意一个树的子结构
 *
 * @author x00444382
 * @since 2020-05-28
 */
public class SubTree {
    public boolean isSubStructure(TreeNode a, TreeNode b) {
        if (a == null || b == null) {
            return false;
        }
        return subStructure(a, b) || isSubStructure(a.left, b) || isSubStructure(a.right, b);
    }

    private boolean subStructure(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        }
        if (a == null || a.val != b.val) {
            return false;
        }
        return subStructure(a.left, b.left) && subStructure(a.right, b.right);
    }
}
