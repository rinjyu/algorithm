package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class FindLHS {

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
//        int[] nums = {1, 2, 3, 4};
//        int[] nums = {1, 1, 1, 1};
        int result = findLHS(nums);
        System.out.println(result);
    }

    public static int findLHS(int[] nums) {
        Map<Long, Integer> map = new HashMap<>();
        for (long num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for (long key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                result = Math.max(result, map.get(key + 1) + map.get(key));
            }
        }
        return result;
    }
}
