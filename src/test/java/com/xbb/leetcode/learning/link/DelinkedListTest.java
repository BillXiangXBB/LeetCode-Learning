package com.xbb.leetcode.learning.link;

import junit.framework.TestCase;

public class DelinkedListTest extends TestCase {
    private DelinkedList delinkedList;
    @Override
    public void setUp() throws Exception {
        super.setUp();
        delinkedList = new DelinkedList();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        delinkedList = null;
    }

    public void testDelinkedList() {
        System.out.println("====== add at head ======");
        delinkedList.addAtHead(1);
        assertEquals(delinkedList.getHead().getVal(), 1);
        delinkedList.printDelinkedList();

        System.out.println("====== add at tail ======");
        delinkedList.addAtTail(3);
        assertEquals(delinkedList.getTail().getVal(), 3);
        delinkedList.printDelinkedList();

        System.out.println("====== add at index ======");
        delinkedList.addAtIndex(1, 2);
        assertEquals(delinkedList.get(1), 2);
        delinkedList.printDelinkedList();

        System.out.println("====== delete at index ======");
        delinkedList.deleteAtIndex(1);
        assertEquals(delinkedList.get(1), 3);
        delinkedList.printDelinkedList();
    }
}
