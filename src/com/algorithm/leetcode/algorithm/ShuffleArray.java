package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class ShuffleArray {

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
//        int[] nums = {1, 1, 2, 2};
//        int n = 2;
        int[] result = shuffle(nums, n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int i = 0;
        for (int j = 0; j < nums.length; j += 2) {
            result[j] = nums[i];
            result[j + 1] = nums[i + n];
            i++;
        }
        return result;
    }
}
