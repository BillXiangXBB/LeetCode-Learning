package com.xbb.leetcode.learning.link;

import com.xbb.leetcode.learning.common.ListNode;
import com.xbb.leetcode.learning.common.StructUtil;

import junit.framework.TestCase;

public class ListComponentsTest extends TestCase {
    private ListComponents listComponents;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        listComponents = new ListComponents();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        listComponents = null;
    }

    public void testListComponents() {
        ListNode case1 = StructUtil.arrayToList(new int[] {0, 1, 2, 3});
        int case1Res = listComponents.numComponents(case1, new int[] {0, 1, 3});
        assertEquals(case1Res, 2);

        ListNode case2 = StructUtil.arrayToList(new int[] {0, 1, 2, 3, 4});
        int case2Res = listComponents.numComponents(case2, new int[] {0, 3, 1, 4});
        assertEquals(case2Res, 2);
    }
}
