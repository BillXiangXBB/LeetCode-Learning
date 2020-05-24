package com.xbb.leetcode.learning.common;

/**
 * 数据结构工具类
 *
 * @author BillXiang
 * @since 2020-05-23
 */
public class StructUtil {
    /**
     * 数组转换为链表
     *
     * @param array 数组
     * @return 链表
     */
    public static ListNode arrayToList(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return arrayToList(array, 0);
    }

    /**
     * 打印链表
     *
     * @param first 首节点
     */
    public static void printList(ListNode first) {
        if (first == null) {
            System.out.println("null");
            return;
        }
        StringBuilder list = new StringBuilder();
        while (first != null) {
            list.append(first.val).append(" -> ");
            first = first.next;
        }
        list.append("null");
        System.out.println(list.toString());
    }

    /**
     * 数组转换为二叉树
     *
     * @param array 数组
     * @return 二叉树
     */
    public static TreeNode arrayToTree(Integer[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        return arrayToTree(array, 0);
    }

    private static ListNode arrayToList(int[] array, int index) {
        if (index >= array.length) {
            return null;
        }
        ListNode node = new ListNode(array[index]);
        node.next = arrayToList(array, index + 1);
        return node;
    }

    private static TreeNode arrayToTree(Integer[] array, int index) {
        if (index >= array.length || array[index] == null) {
            return null;
        }
        TreeNode root = new TreeNode(array[index]);
        root.left = arrayToTree(array, 2 * index + 1);
        root.right = arrayToTree(array, 2 * index + 2);
        return root;
    }
}
