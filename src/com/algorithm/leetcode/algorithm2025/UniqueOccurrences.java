package com.algorithm.leetcode.algorithm2025;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueOccurrences {

    public static void main(String[] args) {

        int[] arr = {1,2,2,1,1,3};
//        int[] arr = {1,2};
//        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Integer> result = new HashMap<>();
        for (int num : arr) {
            result.put(num, result.getOrDefault(num, 0) + 1);
        }

        Set<Integer> set = new HashSet<>(result.values());

//        return result.values().stream().distinct().count() == result.size();
        return set.size() == result.size();
    }
}
