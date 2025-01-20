package com.algorithm.leetcode.algorithm2025;

import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {

//        int[] nums = {1,2,3,4};
//        int[] nums = {-1,1,0,-3,3};
        int[] nums = {0,0};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int right = 1;
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }
}
