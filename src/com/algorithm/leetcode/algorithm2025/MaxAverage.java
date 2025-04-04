package com.algorithm.leetcode.algorithm2025;

public class MaxAverage {

    public static void main(String[] args) {

//        int[] nums = {1, 12, -5, -6, 50, 3};
//        int k = 4;
//        int[] nums = {5};
//        int k = 1;
        int[] nums = {0, 4, 0, 3, 2};
        int k = 1;
        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {

        if (k == 1) {
            int max = Integer.MIN_VALUE;
            for (int num : nums) {
                max = Math.max(max, num);
            }

            return max;
        }

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int max = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            max = Math.max(max, sum);
        }

        return (double) max / k;
    }
}