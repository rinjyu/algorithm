package com.algorithm.leetcode.algorithm;

import java.util.Objects;

public class RemoveDuplicatesSortedArray {

    public static void main(String[] args) {
        int[] nums = {1,1,2};
//        int[] nums = {3,-1,0,0,0,3,3};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        if (!isValidArray(nums)) {
            return 0;
        }
        int i = 1;
        for (int n: nums) {
            if (n > nums[i - 1]) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }

    public static boolean isValidArray(int[] array) {
        return !Objects.isNull(array) && array.length >= 1 && array.length <= 30000;
    }
}