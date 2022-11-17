package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class SortEvenOdd {

    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 3};
//        int[] nums = {2, 1};
        int[] result = sortEvenOdd(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortEvenOdd(int[] nums) {
        if (nums.length == 2) {
            return nums;
        }
        sorting(nums, 0);
        sorting(nums, 1);
        return nums;
    }

    private static void sorting(int[] nums, int odd) {
        for (int i = odd; i < nums.length; i += 2) {
            for (int j = i + 2; j < nums.length; j += 2) {
                if (odd == 0 && nums[i] > nums[j]) {
                    swap(nums, i, j);
                } else if (odd == 1 && nums[i] < nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
