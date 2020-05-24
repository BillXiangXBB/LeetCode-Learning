package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;
import com.xbb.leetcode.learning.common.StructUtil;
import junit.framework.TestCase;

public class IntersectionNodeTest extends TestCase {
    private IntersectionNode node;

    public void setUp() throws Exception {
        super.setUp();
        node = new IntersectionNode();
    }

    public void tearDown() throws Exception {
        super.tearDown();
        node = null;
    }

    public void testIntersectionA() {
        ListNode intersection = intersectionNode(new int[] {4, 1, 8, 4, 5}, new int[] {5, 0, 1, 8, 4, 5}, 3);
        assertEquals(intersection.val, 8);
    }

    public void testIntersectionB() {
        ListNode intersection = intersectionNode(new int[] {0, 9, 1, 2, 4}, new int[] {3, 2, 4}, 2);
        assertEquals(intersection.val, 2);
    }

    public void testNoIntersection() {
        ListNode intersection = intersectionNode(new int[] {2, 6, 4}, new int[] {1, 5}, 0);
        assertEquals(intersection, null);
    }

    private ListNode intersectionNode(int[] arr1, int[] arr2, int intersection) {
        int[] a = new int[arr1.length - intersection];
        int[] b = new int[arr2.length - intersection];
        System.arraycopy(arr1, 0, a, 0, arr1.length - intersection);
        System.arraycopy(arr2, 0, b, 0, arr2.length - intersection);
        if (intersection == 0) {
            return node.getIntersectionNode(StructUtil.arrayToList(a), StructUtil.arrayToList(b));
        } else {
            int[] c = new int[intersection];
            System.arraycopy(arr1, arr1.length - intersection, c, 0, intersection);
            ListNode headA = StructUtil.arrayToList(a);
            ListNode headB = StructUtil.arrayToList(b);
            ListNode headC = StructUtil.arrayToList(c);
            linkList(headA, headC);
            linkList(headB, headC);
            return node.getIntersectionNode(headA, headB);
        }
    }

    private void linkList(ListNode headA, ListNode headB) {
        ListNode pA = headA;
        while (pA.next != null) {
            pA = pA.next;
        }
        pA.next = headB;
    }
}
