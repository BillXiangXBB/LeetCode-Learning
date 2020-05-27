package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;
import com.xbb.leetcode.learning.common.StructUtil;
import junit.framework.TestCase;

public class CycleListTest extends TestCase {
    private CycleList cycleList;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        cycleList = new CycleList();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        cycleList = null;
    }

    public void testCycleList() {
        boolean hasCycle = cycleList.hasCycle(arrayToCycleList(new int[] {3, 2, 0, 4}, 1));
        assertEquals(hasCycle, true);
    }

    public void testNoCycleList() {
        boolean hasCycle = cycleList.hasCycle(arrayToCycleList(new int[] {1, 2, 3, 4, 5}, -1));
        assertEquals(hasCycle, false);
    }

    private ListNode arrayToCycleList(int[] arr, int pos) {
        if (pos == -1) {
            return StructUtil.arrayToList(arr);
        } else {
            return StructUtil.arrayToCycleList(arr, pos);
        }
    }
}
