package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;
import com.xbb.leetcode.learning.common.StructUtil;

import junit.framework.TestCase;

public class MergeKListsTest extends TestCase {
    private MergeKLists mergeKLists;

    private ListNode[] lists;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        mergeKLists = new MergeKLists();
        lists = new ListNode[] {
            StructUtil.arrayToList(new int[] {1, 4, 5}),
            StructUtil.arrayToList(new int[] {0, 3, 4}),
            StructUtil.arrayToList(new int[] {2, 6})
        };
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        mergeKLists = null;
    }

    public void testMergeKLists() {
        System.out.println("====== merge k lists ======");
        StructUtil.printList(lists[0]);
        StructUtil.printList(lists[1]);
        StructUtil.printList(lists[2]);
        ListNode mergeNode = mergeKLists.mergeKLists(lists);
        StructUtil.printList(mergeNode);
        System.out.println("====== merge k lists ======");
    }
}
