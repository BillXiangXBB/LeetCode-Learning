package com.xbb.leetcode.learning.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * LeetCode 310: 最小高度树
 * 对于一个具有树特征的无向图，该图包含n个节点，标记0到n - 1。给定数字n和一个无向边edges列表（每一个边都是一对标签）。
 *
 *
 * @author x00444382
 * @since 2020-05-27
 */
public class MinHeightTrees {
    /**
     * 广度优先搜索(BFS) + 入度 + 哈希表实现
     *
     * @param n 节点数
     * @param edges 边列表
     * @return 最小高度树根节点列表
     */
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();
        if (edges == null || edges.length == 0) {
            result.add(0);
            return result;
        }
        // 计算入度并将节点间的关系映射到哈希表
        int[] indegree = new int[n];
        Map<Integer, List<Integer>> edgeMap = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            indegree[edges[i][0]]++;
            indegree[edges[i][1]]++;
            if (edgeMap.containsKey(edges[i][0])) {
                edgeMap.get(edges[i][0]).add(edges[i][1]);
            } else {
                List<Integer> edgeList = new ArrayList<>();
                edgeList.add(edges[i][1]);
                edgeMap.put(edges[i][0], edgeList);
            }
            if (edgeMap.containsKey(edges[i][1])) {
                edgeMap.get(edges[i][1]).add(edges[i][0]);
            } else {
                List<Integer> edgeList = new ArrayList<>();
                edgeList.add(edges[i][0]);
                edgeMap.put(edges[i][1], edgeList);
            }
        }

        // 将入度为1的节点入队
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 1) {
                queue.offer(i);
            }
        }

        // BFS
        while (!queue.isEmpty()) {
            result = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int node = queue.poll();
                result.add(node);
                for (int tmpNode : edgeMap.get(node)) {
                    indegree[tmpNode]--;
                    if (indegree[tmpNode] == 1) {
                        queue.offer(tmpNode);
                    }
                }
            }
        }
        return result;
    }
}
