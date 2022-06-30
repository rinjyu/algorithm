package com.algorithm.leetcode.algorithm;

public class NumIdenticalPairs {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 1, 3};
//        int[] nums = {1, 1, 1, 1};
//        int[] nums = {1, 2, 3};
        int result = numIdenticalPairs(nums);
        System.out.println(result);
    }

    public static int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
