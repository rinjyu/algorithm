package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class FindFinalValue {

    public static void main(String[] args) {
        int[] nums = {5, 3, 6, 1, 12};
        int original = 3;
//        int[] nums = {2, 7, 9};
//        int original = 4;
        int result = findFinalValue(nums, original);
        System.out.println(result);
    }

    public static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        for (int num : nums) {
            if (num == original) {
                original *= 2;
            }
        }
        return original;
    }
}
