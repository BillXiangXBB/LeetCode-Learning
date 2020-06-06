package com.xbb.leetcode.learning.common;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二叉树的遍历
 *
 * @author x00444382
 * @since 2020-05-27
 */
public class BinaryTreeTraverse {
    /**
     * 前序遍历：根左右
     *
     * @param root 根节点
     * @return 遍历结果
     */
    public static String preOrderTraverse(TreeNode root) {
        if (root == null) {
            return "";
        }
        String str = root.val + "";
        str += preOrderTraverse(root.left);
        str += preOrderTraverse(root.right);
        return str;
    }

    /**
     * 中序遍历：左根右
     *
     * @param root 根节点
     * @return 遍历结果
     */
    public static String inOrderTraverse(TreeNode root) {
        if (root == null) {
            return "";
        }
        String str = inOrderTraverse(root.left);
        str += root.val;
        str += inOrderTraverse(root.right);
        return str;
    }

    /**
     * 后序遍历：左右根
     *
     * @param root 根节点
     * @return 遍历结果
     */
    public static String postOrderTraverse(TreeNode root) {
        if (root == null) {
            return "";
        }
        String str = postOrderTraverse(root.left);
        str += postOrderTraverse(root.right);
        str += root.val;
        return str;
    }

    /**
     * 层序遍历
     *
     * @param root 根节点
     * @return 遍历结果
     */
    public static String sequenceTraverse(TreeNode root) {
        if (root == null) {
            return "";
        }
        StringBuilder str = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            str.append(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return str.toString();
    }
}
