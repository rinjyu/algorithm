package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class ApplyOperations {

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 1, 0};
//        int[] nums = {0, 1};
        int[] result = applyOperations(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }
        swap(nums);
        return nums;
    }

    private static void swap(int[] nums) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }
}
