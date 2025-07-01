package com.algorithm.leetcode.algorithm2025;

import java.util.HashMap;
import java.util.Map;

public class MaxOperations {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int k = 5;

//        int[] nums = {3, 1, 3, 4, 3};
//        int k = 6;
        System.out.println(maxOperations(nums, k));
    }

    public static int maxOperations(int[] nums, int k) {

        Map<Integer, Integer> result = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            int current = k - num;
            if (result.getOrDefault(current, 0) > 0) {
                result.put(current, result.get(current) - 1);
                count++;
            } else {
                result.put(num, result.getOrDefault(num, 0) + 1);
            }
        }

        return count;
    }
}
