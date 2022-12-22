package com.algorithm.leetcode.algorithm;

import java.util.*;

public class MergeSimilarItems {

    public static void main(String[] args) {
        int[][] item1 = {{1, 1}, {4, 5}, {3, 8}};
        int[][] item2 = {{3, 1}, {1, 5}};
//        int[][] item1 = {{1, 1}, {3, 2}, {2, 3}};
//        int[][] item2 = {{2, 1}, {3, 2}, {1, 3}};
//        int[][] item1 = {{1, 3}, {2, 2}};
//        int[][] item2 = {{7, 1}, {2, 2}, {1, 4}};
        List<List<Integer>> result = mergeSimilarItems(item1, item2);
        for (List<Integer> list : result) {
            System.out.println(Arrays.toString(list.toArray()));
        }
    }

    public static List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] items : items1) {
            map.put(items[0], map.getOrDefault(items[0], 0) + items[1]);
        }
        for (int[] items : items2) {
            map.put(items[0], map.getOrDefault(items[0], 0) + items[1]);
        }
        int[][] result = new int[map.size()][2];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result[i][0] = entry.getKey();
            result[i][1] = entry.getValue();
            i++;
        }
        Arrays.sort(result, Comparator.comparingInt(a -> a[0]));
        List<List<Integer>> list = new ArrayList<>();
        for (int[] items : result) {
            List<Integer> tempList = new ArrayList<>();
            tempList.add(items[0]);
            tempList.add(items[1]);
            list.add(tempList);
        }
        return list;
    }
}
