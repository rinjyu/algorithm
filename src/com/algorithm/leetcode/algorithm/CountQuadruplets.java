package com.algorithm.leetcode.algorithm;

import java.util.HashMap;
import java.util.Map;

public class CountQuadruplets {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 6};
//        int[] nums = {3, 3, 6, 4, 5};
//        int[] nums = {1, 1, 1, 3, 5};
        int result = countQuadruplets(nums);
        System.out.println(result);
    }

    public static int countQuadruplets(int[] nums) {
        int result = 0;
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = length - 2; i >= 1; i--) {
            for (int j = i + 1; j < length; j++) {
                int num = nums[j] - nums[i];
                map.put(num, map.getOrDefault(num, 0) + 1);
            }
            for (int j = i - 2; j >= 0; j--) {
                int num = nums[j] - nums[i - 1];
                result += map.getOrDefault(num, 0);
            }
        }
        return result;
    }
}
