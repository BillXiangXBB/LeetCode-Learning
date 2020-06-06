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
     * 数组转化为环形链表
     *
     * @param array 数组
     * @param pos 环形链表起始位置
     * @return 环形链表
     */
    public static ListNode arrayToCycleList(int[] array, int pos) {
        if (array == null || array.length == 0) {
            return null;
        }
        ListNode head = new ListNode(array[0]);
        ListNode prev = head;
        for (int i = 1; i < array.length; i++) {
            prev.next = new ListNode(array[i]);
            prev = prev.next;
        }
        ListNode cycle = head;
        int index = 0;
        while (index != pos) {
            cycle = cycle.next;
            index++;
        }
        prev.next = cycle;
        return head;
    }

    /**
     * 打印链表
     *
     * @param head 表头
     */
    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        StringBuilder list = new StringBuilder();
        while (head != null) {
            list.append(head.val).append(" -> ");
            head = head.next;
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

    /**
     * 打印二叉树
     *
     * @param root 根节点
     */
    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        int depth = treeDepth(root);
        String[][] result = new String[depth][(1 << depth) - 1];
        printTree(result, root, 0, (1 << (depth - 1)) - 1, 1);
        for (int i = 0; i < depth; i++) {
            for (int j = 0; j < (1 << depth) - 1; j++) {
                if (result[i][j] != null) {
                    System.out.print(result[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }

    /**
     * 计算二叉树高度
     *
     * @param root 根节点
     * @return 二叉树高度
     */
    public static int treeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(treeDepth(root.left), treeDepth(root.right)) + 1;
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

    private static void printTree(String[][] result, TreeNode root, int row, int col, int depth) {
        if (root == null) {
            return;
        }
        if (row < result.length && col < result[row].length) {
            result[row][col] = root.val + "";
        }
        printTree(result, root.left, row + 1, col - ((int)Math.pow(2, depth) - 1) - 1, depth - 1);
        printTree(result, root.right, row + 1, col + ((int)Math.pow(2, depth) - 1) + 1, depth - 1);
    }
}
