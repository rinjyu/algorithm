package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class SortArrayByParity {

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 4};
//        int[] nums = {0};
        int[] result = sortArrayByParity(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] sortArrayByParity(int[] nums) {
        int[] result = new int[nums.length];
        int i = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                result[i++] = n;
            }
        }
        for (int n : nums) {
            if (n % 2 == 1) {
                result[i++] = n;
            }
        }
        return result;
    }
}
