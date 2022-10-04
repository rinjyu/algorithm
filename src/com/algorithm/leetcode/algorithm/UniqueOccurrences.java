package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 1, 1, 3};
//        int[] arr = {1, 2};
//        int[] arr = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        boolean result = uniqueOccurrences(arr);
        System.out.println(result);
    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        Set<Integer> set = new HashSet<>(map.values());
        return map.size() == set.size();
    }
}
