package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
//        int[] nums = {1, 0, 1, 1};
//        int k = 1;
//        int[] nums = {1, 2, 3, 1, 2, 3};
//        int k = 2;
        boolean result = containsNearbyDuplicate(nums, k);
        System.out.println(result);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int j = map.get(nums[i]);
                if (Math.abs(j - i) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
