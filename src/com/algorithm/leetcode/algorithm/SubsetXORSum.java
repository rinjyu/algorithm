package com.algorithm.leetcode.algorithm;

public class SubsetXORSum {

    public static void main(String[] args) {
        int[] nums = {1, 3};
//        int[] nums = {5, 1, 6};
//        int[] nums = {3, 4, 5, 6, 7, 8};
        int result = subsetXORSum(nums);
        System.out.println(result);
    }

    public static int subsetXORSum(int[] nums) {
        return backtracking(nums, 0, 0);
    }

    private static int backtracking(int[] nums, int i, int current) {
        if (i == nums.length) {
            return current;
        }
        return backtracking(nums, i + 1, current ^ nums[i])
                + backtracking(nums, i + 1, current);
    }
}
