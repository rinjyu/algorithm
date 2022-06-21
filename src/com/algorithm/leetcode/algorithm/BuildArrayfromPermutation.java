package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class BuildArrayfromPermutation {

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
//        int[] nums = {5, 0, 1, 2, 3, 4};
        int[] result = buildArray(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }
}
