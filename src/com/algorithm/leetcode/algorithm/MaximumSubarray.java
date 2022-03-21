package com.algorithm.leetcode.algorithm;

import java.util.Objects;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] nums = {1};
//        int[] nums = {5, 4, -1, 7, 8};
        int result = maxSubArray(nums);
        System.out.println(result);
    }

    public static int maxSubArray(int[] nums) {
        if (!isValidArray(nums)) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int num : nums) {
            sum += num;
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    private static boolean isValidArray(int[] nums) {
        return !Objects.isNull(nums) && nums.length >= 1 && nums.length <= 100000;
    }
}