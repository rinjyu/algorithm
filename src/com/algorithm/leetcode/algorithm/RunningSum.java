package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class RunningSum {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = runningSum(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] runningSum(int[] nums) {
        int currentSum = 0;
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            result[i] = currentSum;
        }
        return result;
    }
}
