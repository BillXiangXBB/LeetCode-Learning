package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;

/**
 * LeetCode 141: 环形链表
 * 3 -> 2 -> 0 -> 4
 *      ^         |
 *      |         |
 *      ----------
 *
 * @author BillXiang
 * @since 2020-05-24
 */
public class CycleList {
    /**
     * 快慢指针求解
     *
     * @param head 链表
     * @return 是否为环形链表
     *          true：环形链表
     *          false：非环形链表
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (slow != fast) {
            if (fast == null || fast.next == null) {
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
