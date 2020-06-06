package com.xbb.leetcode.learning.tree;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class MinHeightTreesTest extends TestCase {
    private MinHeightTrees minHeightTrees;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        minHeightTrees = new MinHeightTrees();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
        minHeightTrees = null;
    }

    public void testMinHeightTrees() {
        System.out.println("====== min height trees ======");
        System.out.println(
                minHeightTrees.findMinHeightTrees(
                        4, JSON.parseObject("[[1, 0], [1, 2], [1, 3]]", new TypeReference<int[][]>() {})));
        System.out.println(
                minHeightTrees.findMinHeightTrees(
                        6,
                        JSON.parseObject("[[0, 3], [1, 3], [2, 3], [4, 3], [5, 4]]", new TypeReference<int[][]>() {})));
        System.out.println("====== min height trees ======");
    }
}
