package com.algorithm.leetcode.algorithm;

public class MaxAscendingSum {

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 5, 10, 50};
//        int[] nums = {10, 20, 30, 40, 50};
        int result = maxAscendingSum(nums);
        System.out.println(result);
    }

    public static int maxAscendingSum(int[] nums) {
        int result = 0;
        int i = 0;
        while (i < nums.length - 1) {
            int temp = nums[i];
            while (i < nums.length - 1 && nums[i] < nums[i + 1]) {
                temp += nums[i + 1];
                i++;
            }
            i++;
            result = Math.max(result, temp);
        }
        return Math.max(result, nums[nums.length - 1]);
    }
}
