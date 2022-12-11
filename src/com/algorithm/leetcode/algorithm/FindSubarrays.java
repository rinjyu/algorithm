package com.algorithm.leetcode.algorithm;

import java.util.HashSet;
import java.util.Set;

public class FindSubarrays {

    public static void main(String[] args) {
        int[] nums = {4, 2, 4};
//        int[] nums = {1, 2, 3, 4, 5};
//        int[] nums = {0, 0, 0};
        boolean result = findSubarrays(nums);
        System.out.println(result);
    }

    public static boolean findSubarrays(int[] nums) {
        if (nums.length < 2) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length - 1; i++) {
            if (!set.add(nums[i] + nums[i + 1])) {
                return true;
            }
        }
        return false;
    }
}
