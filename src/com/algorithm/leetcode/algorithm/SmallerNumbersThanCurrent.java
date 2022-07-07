package com.algorithm.leetcode.algorithm;

import java.util.Arrays;

public class SmallerNumbersThanCurrent {

    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
//        int[] nums = {6,5,4,8};
//        int[] nums = {7,7,7,7};
        int[] result = smallerNumbersThanCurrent(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}
