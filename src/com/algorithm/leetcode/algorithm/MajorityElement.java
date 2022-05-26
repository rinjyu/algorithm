package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
//        int[] nums = {2, 2, 1, 1, 1, 2, 2};
//        int[] nums = {3, 3, 4};
//        int[] nums = {6, 5, 5};
        int result = majorityElement(nums);
        System.out.println(result);
    }

    public static int majorityElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(max) == null) {
                max = n;
                continue;
            }
            if (map.get(max) < map.get(n)) {
                max = n;
            }
        }
        return max;
    }
}
