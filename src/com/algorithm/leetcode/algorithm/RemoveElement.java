package com.algorithm.leetcode.algorithm;

import java.util.Objects;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 3;
//        int[] nums = {0,1,2,2,3,0,4,2};
//        int val = 2;
        int result = removeElement(nums, val);
        System.out.println(result);
    }

    public static int removeElement(int[] nums, int val) {
        if (!isValidArray(nums)) {
            return -1;
        }
        int i = 0;
        for (int n: nums) {
            if (n != val) {
                nums[i] = n;
                i++;
            }
        }
        return i;
    }

    public static boolean isValidArray(int[] array) {
        return !Objects.isNull(array) && array.length <= 30000;
    }
}
