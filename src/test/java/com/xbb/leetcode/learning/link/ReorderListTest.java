package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;
import com.xbb.leetcode.learning.common.StructUtil;

import junit.framework.TestCase;

public class ReorderListTest extends TestCase {
    private ReorderList reorderList;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        reorderList = new ReorderList();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        reorderList = null;
    }

    public void testOddReorderList() {
        System.out.println("====== odd reorder list ======");
        ListNode node = StructUtil.arrayToList(new int[] {1, 2, 3, 4, 5});
        System.out.println("Before reordering: ");
        StructUtil.printList(node);
        reorderList.reorderList(node);
        System.out.println("After reordering: ");
        StructUtil.printList(node);
        System.out.println("====== odd reorder list ======");
    }

    public void testEvenReorderList() {
        System.out.println("====== even reorder list ======");
        ListNode node = StructUtil.arrayToList(new int[] {1, 2, 3, 4});
        System.out.println("Before reordering: ");
        StructUtil.printList(node);
        reorderList.reorderList(node);
        System.out.println("After reordering: ");
        StructUtil.printList(node);
        System.out.println("====== even reorder list ======");
    }
}
