package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class MaxProductDifference {

    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
//        int[] nums = {4, 2, 5, 9, 7, 4, 8};
        int result = maxProductDifference(nums);
        System.out.println(result);
    }

    public static int maxProductDifference(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        return nums[length - 1] * nums[length - 2] - nums[0] * nums[1];
    }
}
