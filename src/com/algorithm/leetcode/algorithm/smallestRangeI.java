package com.algorithm.leetcode.algorithm;

public class smallestRangeI {

    public static void main(String[] args) {
        int[] nums = {1};
        int k = 0;
//        int[] nums = {0, 10};
//        int k = 2;
//        int[] nums = {1, 3, 6};
//        int k = 3;
        int result = smallestRangeI(nums, k);
        System.out.println(result);
    }

    public static int smallestRangeI(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        min = (max - k) - (min + k);
        return Math.max(min, 0);
    }
}
