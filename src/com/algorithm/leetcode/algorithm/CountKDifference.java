package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class CountKDifference {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1};
        int k = 1;
//        int[] nums = {1, 3};
//        int k = 3;
//        int[] nums = {3, 2, 1, 5, 4};
//        int k = 2;
        int result = countKDifference(nums, k);
        System.out.println(result);
    }

    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            count += map.getOrDefault(n - k, 0) + map.getOrDefault(n + k, 0);
        }
        return count;
    }
}
