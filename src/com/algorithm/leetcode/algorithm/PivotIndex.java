package com.algorithm.leetcode.algorithm;

public class PivotIndex {

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
//        int[] nums = {1, 2, 3};
//        int[] nums = {2, 1, -1};
        int result = pivotIndex(nums);
        System.out.println(result);
    }

    public static int pivotIndex(int[] nums) {
        int sum = 0;
        int total = 0;
        for (int n : nums) {
            total += n;
        }
        for (int i = 0; i < nums.length; sum += nums[i++]) {
            if (sum * 2 == total - nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
