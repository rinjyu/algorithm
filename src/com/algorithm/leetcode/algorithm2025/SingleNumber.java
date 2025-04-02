package com.algorithm.leetcode.algorithm2025;

public class SingleNumber {

    public static void main(String[] args) {

//        int[] nums = {2, 2, 1};
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int result = 0;
        for (int num : nums) {
            result ^= num;
        }

        return result;
    }
}
