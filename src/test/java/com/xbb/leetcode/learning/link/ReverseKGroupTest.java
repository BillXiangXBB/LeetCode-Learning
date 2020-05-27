package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;
import com.xbb.leetcode.learning.common.StructUtil;

import junit.framework.TestCase;

public class ReverseKGroupTest extends TestCase {
    private ReverseKGroup reverseKGroup;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        reverseKGroup = new ReverseKGroup();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        reverseKGroup = null;
    }

    public void testReverseKGroup() {
        System.out.println("====== reverse K group ======");
        ListNode node2 = StructUtil.arrayToList(new int[] {1, 2, 3, 4, 5});
        System.out.println("Before reverse: ");
        StructUtil.printList(node2);
        ListNode reverse2KNode = reverseKGroup.reverseKGroup(node2, 2);
        System.out.println("After reverse(k=2): ");
        StructUtil.printList(reverse2KNode);

        ListNode node3 = StructUtil.arrayToList(new int[] {1, 2, 3, 4, 5});
        ListNode reverse3KNode = reverseKGroup.reverseKGroup(node3, 3);
        System.out.println("After reverse(k=3): ");
        StructUtil.printList(reverse3KNode);
        System.out.println("====== reverse K group ======");
    }
}
