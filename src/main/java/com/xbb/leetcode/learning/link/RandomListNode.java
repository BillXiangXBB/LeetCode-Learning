package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;

import java.util.Random;

/**
 * LeetCode 382: 链表随机节点
 *
 * @author x00444382
 * @since 2020-05-26
 */
public class RandomListNode {
    private ListNode head;

    private Random random;

    public RandomListNode(ListNode head) {
        this.head = head;
        random = new Random();
    }

    /**
     * 蓄水池抽样算法
     *
     * @return 随机节点值
     */
    public int getRandom() {
        ListNode node = head;
        int result = 0;
        int index = 1;
        while (node != null) {
            if (index == 1) {
                result = node.val;
            } else {
                int rand = random.nextInt(index);
                if (rand < 1) {
                    result = node.val;
                }
            }
            node = node.next;
            index++;
        }
        return result;
    }
}
