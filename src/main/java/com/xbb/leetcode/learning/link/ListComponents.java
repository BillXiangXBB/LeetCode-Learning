package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * LeetCode 817: 链表组件
 * 给定一个链表的头结点head
 * 同时给定列表G，该列表是上述链表汇总整形值的一个子集
 * 返回列表G中组件的个数，这里对组件的定义为：链表中一段最长连续节点的值（该值必须在列表G中）构成的集合
 *
 * @author x00444382
 * @since 2020-05-26
 */
public class ListComponents {
    /**
     * 链表遍历与哈希表映射
     *
     * @param head 头结点
     * @param g 列表
     * @return 组件个数
     */
    public int numComponents(ListNode head, int[] g) {
        Set<Integer> gSet = new HashSet<>();
        for (int gItem : g) {
            gSet.add(gItem);
        }
        int result = 0;
        ListNode node = head;
        while (node != null) {
            if (gSet.contains(node.val) && (node.next == null || !gSet.contains(node.next.val))) {
                result++;
            }
            node = node.next;
        }
        return result;
    }
}
