package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class ArrayPairSum {

    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 2};
//        int[] nums = {6, 2, 6, 5, 1, 2};
        int result = arrayPairSum(nums);
        System.out.println(result);
    }

    public static int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}
