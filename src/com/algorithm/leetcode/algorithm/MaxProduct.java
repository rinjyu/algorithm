package com.algorithm.leetcode.algorithm;

public class MaxProduct {

    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 2};
//        int[] nums = {1, 5, 4, 5};
//        int[] nums = {3, 7};
        int result = maxProduct(nums);
        System.out.println(result);
    }

    public static int maxProduct(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int value = (nums[i] - 1) * (nums[j] - 1);
                max = Integer.max(max, value);
            }
        }
        return max;
    }
}
