package com.algorithm.leetcode.algorithm;

public class MaximumDifference {

    public static void main(String[] args) {
        int[] nums = {7, 1, 5, 4};
//        int[] nums = {9, 4, 3,};
//        int[] nums = {1, 5, 2, 10};
        int result = maximumDifference(nums);
        System.out.println(result);
    }

    public static int maximumDifference(int[] nums) {
        int min = nums[0];
        int result = -1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                result = Math.max(result, nums[i] - min);
            } else {
                min = Math.min(min, nums[i]);
            }
        }
        return result;
    }
}
