package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;

/**
 * LeetCode 23: 合并K个排序链表
 *
 *
 * @author x00444382
 * @since 2020-05-26
 */
public class MergeKLists {
    /**
     * 双指针算法
     *
     * @param lists 链表列表
     * @return 合并后的链表
     */
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode mergeNode = null;
        ListNode mergeTailNode = null;
        while (!isAllEmpty(lists)) {
            int min = headMin(lists);
            for (int i = 0; i < lists.length; i++) {
                ListNode node = lists[i];
                ListNode tmpNode = node;
                ListNode tmpTailNode = null;
                boolean hasNode = false;
                while (node != null && node.val == min) {
                    tmpTailNode = node;
                    node = node.next;
                    hasNode = true;
                }
                if (!hasNode) {
                    continue;
                }
                if (mergeNode == null) {
                    mergeNode = tmpNode;
                    mergeTailNode = tmpTailNode;
                    if (mergeTailNode != null) {
                        mergeTailNode.next = null;
                    }
                } else if (mergeTailNode != null) {
                    mergeTailNode.next = tmpNode;
                    mergeTailNode = tmpTailNode;
                    if (mergeTailNode != null) {
                        mergeTailNode.next = null;
                    }
                }
                lists[i] = node;
            }
        }
        return mergeNode;
    }

    private int headMin(ListNode[] lists) {
        int min = Integer.MAX_VALUE;
        for (ListNode node : lists) {
            if (node != null && node.val < min) {
                min = node.val;
            }
        }
        return min;
    }

    private boolean isAllEmpty(ListNode[] lists) {
        for (ListNode node : lists) {
            if (node != null) {
                return false;
            }
        }
        return true;
    }
}
