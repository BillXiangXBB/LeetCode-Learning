package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;

/**
 * LeetCode 86: 分隔链表
 * 给定一个链表和一个特定值x，对链表进行分隔，使得所有小于x的节点都在大于或等于x的节点之前
 *
 * @author x00444382
 * @since 2020-05-25
 */
public class PartitionList {
    /**
     * 双指针算法
     *
     * @param head 链表头结点
     * @param x 指定x
     * @return 分隔链表
     */
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode preNode = null;
        ListNode postNode = null;
        ListNode preNextNode = null;
        ListNode postNextNode = null;
        while (head != null) {
            if (head.val < x) {
                if (preNode == null) {
                    preNode = head;
                    preNextNode = head;
                } else {
                    preNextNode.next = head;
                    preNextNode = preNextNode.next;
                }
            } else {
                if (postNode == null) {
                    postNode = head;
                    postNextNode = head;
                } else {
                    postNextNode.next = head;
                    postNextNode = postNextNode.next;
                }
            }
            head = head.next;
        }
        if (postNode == null) {
            preNextNode.next = null;
            return preNode;
        } else if (preNode == null) {
            postNextNode.next = null;
            return postNode;
        } else {
            preNextNode.next = postNode;
            postNextNode.next = null;
            return preNode;
        }
    }
}
