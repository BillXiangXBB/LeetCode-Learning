package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;

/**
 * LeetCode 160: 相交链表
 * 如下面的两个链表
 * A:       a1 -> a2
 *                   \
 *                      c1 -> c2 -> c3
 *                   /
 * B: b1 -> b2 -> b3
 * 在节点c1相交
 *
 * @author BillXiang
 * @since 2020-05-24
 */
public class IntersectionNode {
    /**
     * 使用双指针算法求解
     *
     * @param headA 链表A
     * @param headB 链表B
     * @return 相交节点
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
