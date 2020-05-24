package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;

/**
 * LeetCode 206: 反转链表
 * 反转前: 1 -> 2 -> 3 -> 4 -> 5 -> null
 * 反转后: 5 -> 4 -> 3 -> 2 -> 1 -> null
 *
 * @author BillXiang
 * @since 2020-05-24
 */
public class ReverseList {
    /**
     * 递归法求解
     *
     * @param head 链表
     * @return 反转链表
     */
    public ListNode reverseListByRecursion(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode reverse = reverseListByRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return reverse;
    }

    /**
     * 迭代法求解
     *
     * @param head 链表
     * @return 反转链表
     */
    public ListNode reverseListByIteration(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmp = curr;
            curr = curr.next;
            tmp.next = prev;
            prev = tmp;
        }
        return prev;
    }
}
