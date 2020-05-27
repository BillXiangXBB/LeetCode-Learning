package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;
import com.xbb.leetcode.learning.common.StructUtil;

import junit.framework.TestCase;

public class RandomListNodeTest extends TestCase {
    private RandomListNode randomListNode;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        ListNode head = StructUtil.arrayToList(new int[] {1, 2, 3});
        randomListNode = new RandomListNode(head);
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        randomListNode = null;
    }

    public void testRandomListNode() {
        System.out.println("====== random list node  ======");
        System.out.println(randomListNode.getRandom());
        System.out.println(randomListNode.getRandom());
        System.out.println(randomListNode.getRandom());
        System.out.println(randomListNode.getRandom());
        System.out.println("====== random list node  ======");
    }
}
