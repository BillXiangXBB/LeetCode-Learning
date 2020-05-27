package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;

/**
 * LeetCode 143: 重排链表
 * 给定一个单链表L: L0 -> L1 -> ... -> Ln-1 -> Ln
 * 将其重新排列后变为: L0 -> Ln -> L1 -> Ln-1 -> L2 -> Ln-2 -> ...
 *
 * @author BillXiang
 * @since 2020-05-25
 */
public class ReorderList {
    /**
     * 双指针算法实现
     * 首先通过快慢指针找到链表中心节点
     * 然后反转后半部分链表
     * 最后使用双指针重排链表
     *
     * @param head 头节点
     */
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode reverseNode = reverseList(slow);
        ListNode nextNode = head;
        while (reverseNode != null) {
            ListNode nextReverseNode = reverseNode.next;
            reverseNode.next = nextNode.next;
            nextNode.next = reverseNode;
            nextNode = reverseNode.next;
            reverseNode = nextReverseNode;
        }
        nextNode.next = null;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
