package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
//        int[] nums = {3, 4, -1, 1};
//        int[] nums = {7, 8, 9, 11, 12};
//        int[] nums = {-5};
//        int[] nums = {-1, -2, -60, 40, 43};
        int result = firstMissingPositive(nums);
        System.out.println(result);
    }

    public static int firstMissingPositive(int[] nums) {
        if (!isValidArray(nums)) {
            return -1;
        }
        Arrays.sort(nums);
        int i = 1;
        for (int num : nums) {
            if (num > i) {
                return i;
            }
            if (num == i) {
                i++;
            }
        }
        return i;
    }

    private static boolean isValidArray(int[] nums) {
        return nums.length >= 1 && nums.length <= 500000;
    }
}