package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;
import com.xbb.leetcode.learning.common.StructUtil;
import junit.framework.TestCase;

public class ReverseListTest extends TestCase {
    private ReverseList reverse;

    private int[] arr;

    public void setUp() throws Exception {
        super.setUp();
        reverse = new ReverseList();
        arr = new int[] {1, 2, 3, 4, 5};
    }

    public void tearDown() throws Exception {
        super.tearDown();
        reverse = null;
        arr = null;
    }

    public void testReverseListByRecursion() {
        System.out.println("========= recursion ============");
        ListNode node = StructUtil.arrayToList(arr);
        System.out.println("Before reversion: ");
        StructUtil.printList(node);
        ListNode reverseNode = reverse.reverseListByRecursion(node);
        System.out.println("After reversing: ");
        StructUtil.printList(reverseNode);
        reverseAssert(reverseNode);
        System.out.println("========= recursion ============");
    }

    public void testReverseListByIteration() {
        System.out.println("========= iteration ============");
        ListNode node = StructUtil.arrayToList(arr);
        System.out.println("Before reversion: ");
        StructUtil.printList(node);
        ListNode reverseNode = reverse.reverseListByIteration(node);
        System.out.println("After reversing: ");
        StructUtil.printList(reverseNode);
        reverseAssert(reverseNode);
        System.out.println("========= iteration ============");
    }

    private void reverseAssert(ListNode reverseNode) {
        int index = arr.length - 1;
        while (reverseNode != null) {
            assertEquals(reverseNode.val, arr[index]);
            reverseNode = reverseNode.next;
            index--;
        }
    }
}
