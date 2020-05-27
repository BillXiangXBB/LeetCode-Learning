package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;

/**
 * LeetCode 25: K个一组翻转链表
 * 给定一个链表，每K个节点一组进行翻转
 *
 * @author x00444382
 * @since 2020-05-26
 */
public class ReverseKGroup {
    /**
     * 分治算法+双指针算法
     *
     * @param head 头结点
     * @param k 分组个数
     * @return 翻转链表
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode node = null;
        ListNode tail = null;
        while (head != null) {
            ListNode nextNode = head;
            ListNode tailNode = null;
            int length = k;
            while (length != 0 && head != null) {
                tailNode = head;
                head = head.next;
                length--;
            }
            if (tailNode != null) {
                tailNode.next = null;
            }
            ListNode reverseNode = reverseListNode(nextNode, k);
            if (node == null) {
                node = reverseNode;
            } else {
                tail.next = reverseNode;
            }
            while (reverseNode.next != null) {
                reverseNode = reverseNode.next;
            }
            tail = reverseNode;
        }
        return node;
    }

    private ListNode reverseListNode(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        int length = 0;
        ListNode node = head;
        while (node != null) {
            node = node.next;
            length++;
        }
        if (length < k) {
            return head;
        }

        ListNode prev = null;
        ListNode curr = head;
        while (curr != null && k != 0) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            k--;
        }
        return prev;
    }
}
