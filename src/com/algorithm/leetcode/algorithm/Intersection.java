package com.algorithm.leetcode.algorithm;

import java.util.*;

public class Intersection {

    public static void main(String[] args) {
        int[][] nums = {{3, 1, 2, 4, 5}, {1, 2, 3, 4}, {3, 4, 5, 6}};
//        int[][] nums = {{1, 2, 3}, {4, 5, 6}};
        List<Integer> result = intersection(nums);
        System.out.println(Arrays.toString(result.toArray()));
    }

    public static List<Integer> intersection(int[][] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int[] num : nums) {
            for (int n : num) {
                map.put(n, map.getOrDefault(n, 0) + 1);
                if (map.get(n) == nums.length) {
                    list.add(n);
                }
            }
        }
        list.sort(Comparator.naturalOrder());
        return list;
    }
}
