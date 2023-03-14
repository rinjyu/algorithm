package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class MinimumDifference {

    public static void main(String[] args) {
        int[] nums = {90};
        int k = 1;
//        int[] nums = {9, 4, 1, 7};
//        int k = 2;
        int result = minimumDifference(nums, k);
        System.out.println(result);
    }

    public static int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int result = nums[k - 1] - nums[0];
        for (int i = k; i < nums.length; i++) {
            result = Math.min(nums[i] - nums[i - k + 1], result);
        }
        return result;
    }
}
