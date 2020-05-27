package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;
import com.xbb.leetcode.learning.common.StructUtil;

import junit.framework.TestCase;

public class PartitionListTest extends TestCase {
    private PartitionList partitionList;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        partitionList = new PartitionList();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        partitionList = null;
    }

    public void testPartitionList() {
        System.out.println("======= partition =======");
        ListNode node = StructUtil.arrayToList(new int[] {1, 4, 3, 2, 5, 2});
        System.out.println("Before partition: ");
        StructUtil.printList(node);
        System.out.println("x = " + 3);
        ListNode partitionNode = partitionList.partition(node, 3);
        System.out.println("After partition: ");
        StructUtil.printList(partitionNode);
        System.out.println("======= partition =======");
    }

    public void testPartitionListAllBigger() {
        System.out.println("======= partition =======");
        ListNode node = StructUtil.arrayToList(new int[] {1, 1});
        System.out.println("Before partition: ");
        StructUtil.printList(node);
        System.out.println("x = " + 0);
        ListNode partitionNode = partitionList.partition(node, 0);
        System.out.println("After partition: ");
        StructUtil.printList(partitionNode);
        System.out.println("======= partition =======");
    }

    public void testPartitionListAllSmaller() {
        System.out.println("======= partition =======");
        ListNode node = StructUtil.arrayToList(new int[] {1, 1});
        System.out.println("Before partition: ");
        StructUtil.printList(node);
        System.out.println("x = " + 2);
        ListNode partitionNode = partitionList.partition(node, 2);
        System.out.println("After partition: ");
        StructUtil.printList(partitionNode);
        System.out.println("======= partition =======");
    }
}
