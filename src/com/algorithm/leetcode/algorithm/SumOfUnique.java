package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class SumOfUnique {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
//        int[] nums = {1, 1, 1, 1, 1};
//        int[] nums = {1, 2, 3, 4, 5};
        int result = sumOfUnique(nums);
        System.out.println(result);
    }

    public static int sumOfUnique(int[] nums) {
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        for (Integer n : map.keySet()) {
            if (map.get(n) == 1) {
                sum += n;
            }
        }
        return sum;
    }
}
